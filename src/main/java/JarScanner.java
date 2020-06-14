import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.objectweb.asm.ClassReader;

public class JarScanner {

    public static final String[] archiveTypes = new String[] {
            "jar", "war", "zip", "tar", "epd", "ecd"
    };

    public static void main(String[] args) {
        JarScanner scanner = new JarScanner(args);
        System.out.println(scanner.execute());
    }

    /**
     * file or directory
     */
    private String[] targets;

    public JarScanner(String... targets) {
        this.targets = targets;
    }

    /**
     * all classes
     */
    private Set<String> classNames = new HashSet<String>();

    /**
     * duplicate classes
     */
    private Set<String> duplicateClasses = new HashSet<String>();

    /**
     * className: locations
     */
    private Map<String, Set<String>> classLocations = new ConcurrentHashMap<String, Set<String>>();

    /**
     * location: classes
     */
    private Map<String, Set<String>> locationClasses = new ConcurrentHashMap<String, Set<String>>();

    public String execute() {
        classNames.clear();
        classLocations.clear();
        locationClasses.clear();

        if (null == targets || 0 == targets.length) {
            targets = new String[] { "." };
        }
        for (String file : targets) {
            File f = new File(file);
            scan(f);
        }
        String format = System.getProperty("outFormat");
        if ("xml".equalsIgnoreCase(format)) {
            return outXml();
        } else if ("json".equalsIgnoreCase(format)) {
            return outJson();
        } else if ("yaml".equalsIgnoreCase(format) || "yml".equalsIgnoreCase(format)) {
            return outYaml();
        }
        return outXml();
    }

    protected void scan(File file) {
        if (null == file) {
            return;
        }
        if (!file.exists()) {
            System.err.printf("File %s not found.", file.getAbsolutePath());
            return;
        }
        // 可以考虑开启多线程扫描
        if (file.isFile()) {
            scanFile(file);
            return;
        }
        if (file.isDirectory()) {
            scanDir(file);
            return;
        }
    }

    private void scanDir(File dir) {
        if (null == dir || !dir.exists() || !dir.isDirectory()) {
            return;
        }
        File[] children = dir.listFiles();
        if (null == children || 0 == children.length) {
            return;
        }
        for (File file : children) {
            if (file.isFile()) {
                String fileName = file.getName();
                if (fileName.endsWith(".class")) {
                    addClass(file);
                } else {
                    boolean match = false;
                    String ext = getFileExtensionName(fileName);
                    for (String type : getArchiveTypes()) {
                        if (type.equalsIgnoreCase(ext)) {
                            match = true;
                            break;
                        }
                    }
                    if (match) {
                        scanFile(file);
                    }
                }
                continue;
            }
            if (file.isDirectory()) {
                scanDir(file);
                continue;
            }
        }
    }

    private void scanFile(File file) {
        if (null == file || !file.exists() || !file.isFile()) {
            return;
        }
        ZipFile zip = null;
        try {
            zip = new ZipFile(file);

            for (Enumeration entries = zip.entries(); entries.hasMoreElements(); ) {
                ZipEntry entry = (ZipEntry) entries.nextElement();

                if (entry.isDirectory()) {
                    continue;
                }
                String fileName = entry.getName();
                if (fileName.endsWith(".class")) {
                    String className = fileName.replaceAll("/", ".").substring(0, fileName.length() - 6); // ".class".length()
                    addClass(file.getAbsolutePath(), className);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != zip) {
                try {
                    zip.close();
                } catch (IOException e) {
                }
            }
        }
    }

    private void addClass(String location, String className) {
        if (null == location || null == className) {
            return;
        }
        classNames.add(className);

        Set<String> locations = classLocations.get(className);
        if (null == locations) {
            locations = new HashSet<String>();
            classLocations.put(className, locations);
        }
        locations.add(location);
        if (locations.size() > 1) {
            duplicateClasses.add(className);
        }
    }

    private void addClass(File file) {
        if (null == file || !file.exists() || !file.isFile()) {
            return;
        }

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            ClassReader classReader = new ClassReader(bis);
            String className = classReader.getClassName().replace("/", ".");
            addClass(file.getAbsolutePath(), className);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getFileExtensionName(String fileName) {
        if (null == fileName) {
            return null;
        }
        if (!fileName.contains(".")) {
            return null;
        }
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    protected String[] getArchiveTypes() {
        String types = System.getProperty("archiveTypes");
        return null == types || types.trim().length() == 0 ? archiveTypes : types.split(",");
    }

    public String outXml() {
        StringBuffer sb = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");

        sb.append("\n<report>");
        sb.append("\n\t<!-- duplicate classes -->");
        sb.append("\n\t<duplicates>");
        for (String clazz : duplicateClasses) {
            sb.append("\n\t\t<duplicate class=\"").append(clazz).append("\">");
            sb.append("\n\t\t\t<locations>");
            Set<String> locations = classLocations.get(clazz);
            for (String location : locations) {
                sb.append("\n\t\t\t\t<location>").append(location).append("</location>");
            }
            sb.append("\n\t\t\t</locations>");
            sb.append("\n\t\t</duplicate>");
        }
        sb.append("\n\t</duplicates>");

        if (outAllClasses()) {
            sb.append("\n\t<!-- all classes -->");
            sb.append("\n\t<classes>");
            for (String clazz : classNames) {
                sb.append("\n\t\t").append("<class>").append(clazz).append("</class>");
            }
            sb.append("\n\t</classes>");
        }

        sb.append("\n</report>");

        return sb.toString();
    }

    public String outJson() {
        StringBuffer sb = new StringBuffer();

        sb.append("{");
        sb.append("\n\t\"duplicates\": [");
        for (String clazz : duplicateClasses) {
            sb.append("\n\t\t{");
            sb.append("\n\t\t\t\"class\": \"").append(clazz).append("\",");
            sb.append("\n\t\t\t\"locations\": [");
            Set<String> locations = classLocations.get(clazz);
            for (String location : locations) {
                sb.append("\n\t\t\t\t\"").append(location).append("\",");
            }
            if (!locations.isEmpty()) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append("\n\t\t\t]");
            sb.append("\n\t\t},");
        }
        if (!duplicateClasses.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("\n\t]");
        if (outAllClasses()) {
            sb.append(",\n\t\"classes\": [");
            for (String clazz : classNames) {
                sb.append("\n\t\t").append("\"").append(clazz).append("\",");
            }
            if (!classNames.isEmpty()) {
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append("\n\t]");
        }

        sb.append("\n}");

        return sb.toString();
    }

    public String outYaml() {
        StringBuffer sb = new StringBuffer();

        sb.append("duplicates:");
        int count = 0;
        for (String clazz : duplicateClasses) {
            sb.append(0 == count ? "\n  - " : "\n  ");
            sb.append("class: ").append(clazz);
            sb.append("\n    locations:");
            Set<String> locations = classLocations.get(clazz);
            int index = 0;
            for (String location : locations) {
                sb.append(0 == index ? "\n    - " : "\n      ");
                sb.append(location);
                index++;
            }
            count++;
        }
        if (outAllClasses()) {
            sb.append("\n\nclasses:");
            count = 0;
            for (String clazz : classNames) {
                sb.append(0 == count ? "\n- " : "\n  ").append(clazz);
                count++;
            }
        }
        return sb.toString();
    }

    private boolean outAllClasses() {
        return Boolean.parseBoolean(System.getProperty("outAll", Boolean.FALSE.toString()));
    }

}

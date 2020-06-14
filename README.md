# Usage

```bash
java -cp class-tool.jar JarScanner /your/dir1 /your/dir2 /your/xyz.jar /your/abc.jar
```

```bash
# outFormat: json, yaml, xml (default)
java -DoutFormat=json -cp class-tool.jar JarScanner /your/dir1 /your/dir2 /your/xyz.jar /your/abc.jar

# archiveTypes: jar,war,zip,tar,epd,ecd (default)
java -DarchiveTypes="jar,zip" -cp class-tool.jar JarScanner /your/dir1 /your/dir2 /your/xyz.jar /your/abc.jar
```

# e.g.

`java -cp class-tool.jar JarScanner ~/.m2/repository/org/ow2/asm/asm/7.*`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<report>
	<!-- duplicate classes -->
	<duplicates>
		<duplicate class="org.objectweb.asm.ClassWriter">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.SymbolTable$Entry">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.AnnotationVisitor">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.MethodVisitor">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Edge">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.FieldWriter">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.FieldVisitor">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.TypeReference">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Symbol">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Label">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Type">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.SymbolTable">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.ModuleWriter">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Constants">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Context">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Attribute">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.signature.SignatureWriter">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.MethodTooLargeException">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.ClassVisitor">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Frame">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Attribute$Set">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.ByteVector">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Opcodes">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.ModuleVisitor">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.CurrentFrame">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Handler">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.signature.SignatureReader">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="module-info">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.Handle">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.TypePath">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.ClassReader">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.AnnotationWriter">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.MethodWriter">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.signature.SignatureVisitor">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.ClassTooLargeException">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
		<duplicate class="org.objectweb.asm.ConstantDynamic">
			<locations>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar</location>
				<location>/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar</location>
			</locations>
		</duplicate>
	</duplicates>
</report>
```


`java -DoutFormat=json -cp class-tool.jar JarScanner ~/.m2/repository/org/ow2/asm/asm/7.*`

```json
{
	"duplicates": [
		{
			"class": "org.objectweb.asm.ClassWriter",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.SymbolTable$Entry",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.AnnotationVisitor",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.MethodVisitor",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Edge",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.FieldWriter",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.FieldVisitor",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.TypeReference",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Symbol",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Label",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Type",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.SymbolTable",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.ModuleWriter",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Constants",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Context",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Attribute",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.signature.SignatureWriter",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.MethodTooLargeException",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.ClassVisitor",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Frame",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Attribute$Set",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.ByteVector",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Opcodes",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.ModuleVisitor",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.CurrentFrame",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Handler",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.signature.SignatureReader",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "module-info",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.Handle",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.TypePath",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.ClassReader",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.AnnotationWriter",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.MethodWriter",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.signature.SignatureVisitor",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.ClassTooLargeException",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		},
		{
			"class": "org.objectweb.asm.ConstantDynamic",
			"locations": [
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.1/asm-7.1.jar",
				"/Users/zhongwen/.m2/repository/org/ow2/asm/asm/7.0/asm-7.0.jar"
			]
		}
	]
}
```

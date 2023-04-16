import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {

	public static void main(String[] args) throws IOException {
		List<String> inputFiles = new ArrayList<>();
		for (String arg : args) {
			if (arg.endsWith(".java")) {
				inputFiles.add(arg);
			}
		}
		for (String inputFile : inputFiles) {
			String className = getClassName(inputFile);
			String pascalCase = className.substring(0, 1).toUpperCase()
					+ className.substring(1, className.length() - 4);
			String camelCase = className.substring(0, 1).toLowerCase() + className.substring(1, className.length() - 4);
			System.out.println(className);
			System.out.println(pascalCase);
			System.out.println(camelCase);
			generateControllerFile(pascalCase);
			generateProcFile(pascalCase);
			generateDAOFile(pascalCase);
		}
	}

	private static String getClassName(String fileName) {
		String[] parts = fileName.split("\\.");
		return parts[0];
	}

	private static void generateControllerFile(String className) throws IOException {
		String controllerFileName = className + "Ctrl.java";
		File file = new File(controllerFileName);
		FileWriter writer = new FileWriter(file);
		writer.write("public class " + className + "Ctrl {\n");
		writer.write("    public void save() {\n");
		writer.write("        // TODO: Implement save method\n");
		writer.write("    }\n");
		writer.write("    public void fetch() {\n");
		writer.write("        // TODO: Implement fetch method\n");
		writer.write("    }\n");
		writer.write("}");
		writer.close();
		System.out.println("Generated " + controllerFileName);
	}

	private static void generateProcFile(String className) throws IOException {
		String procFileName = className + "Proc.java";
		File file = new File(procFileName);
		FileWriter writer = new FileWriter(file);
		writer.write("public class " + className + "Proc {\n");
		writer.write("    public void save() {\n");
		writer.write("        // TODO: Implement save method\n");
		writer.write("    }\n");
		writer.write("    public void fetch() {\n");
		writer.write("        // TODO: Implement fetch method\n");
		writer.write("    }\n");
		writer.write("}");
		writer.close();
		System.out.println("Generated " + procFileName);
	}

	private static void generateDAOFile(String className) throws IOException {
		String daoFileName = className + "DAO.java";
		File file = new File(daoFileName);
		FileWriter writer = new FileWriter(file);
		writer.write("public class " + className + "DAO {\n");
		writer.write("    public void save() {\n");
		writer.write("        // TODO: Implement save method\n");
		writer.write("    }\n");
		writer.write("    public void fetch() {\n");
		writer.write("        // TODO: Implement fetch method\n");
		writer.write("    }\n");
		writer.write("}");
		writer.close();
		System.out.println("Generated " + daoFileName);
	}

}

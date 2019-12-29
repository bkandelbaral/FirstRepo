import java.util.Scanner;
import java.io.*;

public class a5main {

	public static void main(String[] args) throws IOException {

		// Asking user for input file name
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the name of a Input file");
		String InputFileName = keyboard.nextLine();

		// Asking user for output file name
		System.out.print("Enter the name of a Output file");
		String OutputFileName = keyboard.nextLine();

		// Creating a file and reading user given file
		File file = new File(InputFileName);
		Scanner Inputfile = new Scanner(file);

		// Read while there is next line
		String fileContents = "";

		while (Inputfile.hasNext()) {
			fileContents = fileContents + " " + Inputfile.nextLine();
		}
		
		keyboard.close();
		Inputfile.close();

		// Change the file to upper case
		String upperCaseFile = "";
		upperCaseFile = fileContents.toUpperCase();

		// Create a writer object
		PrintWriter outputFile = new PrintWriter(OutputFileName);
		outputFile.print(upperCaseFile);
		outputFile.close();

	}

}

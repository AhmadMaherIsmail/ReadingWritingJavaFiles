import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingAndWriting {
	public static void main(String[] args) {
		try {
			// Open the file you want to read from
			BufferedReader reader = new BufferedReader(new FileReader("/Users/User/Desktop/FileName.txt"));

			// Read the content of the file
			String line = reader.readLine();

			// Create a new File to write on
			File myObj = new File("FileName2.txt");

			// Allow editing on file
			FileWriter myWriter = new FileWriter("/Users/User/Desktop/FileName2.txt");

			// Loop on all contents of the initial file
			while (line != null) {
				System.out.println();

				// Get a substring of the sentences and print them on console and on file for
				// debugging purposes
				line = line.substring(0, 3);
				System.out.println("\n" + line);
				myWriter.write(line);

				// To keep reading the remaining contents of the file
				line = reader.readLine();
			}
			// Close the reading file
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

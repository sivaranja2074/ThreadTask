package Thread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileUsingFileWriter {
	public static void main(String args[]) throws IOException {
		File file = new File("C:\\java\\Task\\src\\Thread\\Test.txt");
		try (FileWriter writer = new FileWriter(file)) {
			writer.write("Heloo Mentor!.....I am Sivaranja");
			writer.close();
			System.out.println("File is created successfully with the content.");
		}
	}
}

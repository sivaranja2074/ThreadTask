package Thread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileUsingBufferWriter {
	public static void main(String args[]) throws IOException {
		File file = new File("C:\\java\\Task\\src\\Thread\\demo.txt");
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
			writer.write("Heloo Mentor!.....I am Sivaranja MTS in Zoho");
			writer.close();
			System.out.println("File is created successfully with the content.");
		}
	}
}

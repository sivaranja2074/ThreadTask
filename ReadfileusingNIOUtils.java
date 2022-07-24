package Thread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadfileusingNIOUtils {

	public static void main(String[] args) {
		Path wiki_path = Paths.get("C:\\java\\Task\\src\\Thread\\Test.txt");

		try {
			List<String> lines = Files.readAllLines(wiki_path);
			for (String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}

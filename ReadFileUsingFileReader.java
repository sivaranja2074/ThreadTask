package Thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String args[]) throws FileNotFoundException {
		File file=new File("C:\\java\\Task\\src\\Thread\\Test.txt");
		FileReader reader=new FileReader(file);
		int i;
		StringBuffer string=new StringBuffer();
		try {
			while((i=reader.read())!=-1)
			{
				string.append((char)i);
			}
			System.out.println(string);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

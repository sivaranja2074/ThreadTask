package Thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingBufferReader {
	public static void main(String args[]) throws FileNotFoundException
	{
		File file=new File("C:\\java\\Task\\src\\Thread\\Test.txt");
		BufferedReader bufferReader=new BufferedReader(new FileReader(file));
		int i;
		StringBuffer string=new StringBuffer();
		try {
			while((i=bufferReader.read())!=-1)
			{
				string.append((char)i);
			}
			System.out.println(string);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}

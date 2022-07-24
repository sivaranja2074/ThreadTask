package Thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Readfile implements Runnable {

	FileReader reader = null;
	File file = new File("C:\\java\\Task\\src\\Thread\\sample.txt");

	public Readfile() throws FileNotFoundException {
		reader = new FileReader(file);
	}

	void read() throws IOException {
		int i;
		String str = "";
		while ((i = reader.read()) != -1) {
			str += (char) i;
		}
		System.out.println(str);
		if(reader==null)
		{
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public void run() {

		try {
			
			read();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}
}

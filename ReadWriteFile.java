package Thread;


import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadWriteFile {

	public static void main(String args[]) throws IOException, InterruptedException {
		try {
			WriteFile filewrite = new WriteFile();
			Thread t1 = new Thread(filewrite);
			t1.start();
			WriteFile filewrite1 = new WriteFile();
			Thread t3 = new Thread(filewrite1);
			t3.start();
			
			for(int i=0;i<2;i++)
			{
			Readfile fileread = new Readfile();
			Thread t2 = new Thread(fileread);
			 t2.start();
            Thread.sleep(2000);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
}

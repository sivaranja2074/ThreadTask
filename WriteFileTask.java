package Thread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;

class WriteFile implements Runnable{
	FileWriter writer = null;
	File file = new File("C:\\java\\Task\\src\\Thread\\sample.txt");
	public WriteFile() throws IOException {
		writer = new FileWriter(file);
	}

	void write() throws IOException {
		int n=10;
		 byte[] array = new byte[256];
	        new Random().nextBytes(array);
	  
	        String randomString
	            = new String(array, Charset.forName("UTF-8"));
	        StringBuffer r = new StringBuffer(); 
	        String  AlphaNumericString
	            = randomString
	                  .replaceAll("[^A-Za-z0-9]", "");
	 
	        for (int k = 0; k < AlphaNumericString.length(); k++) {
	  
	            if (Character.isLetter(AlphaNumericString.charAt(k))
	                    && (n > 0)
	                || Character.isDigit(AlphaNumericString.charAt(k))
	                       && (n > 0)) {
	  
	                r.append(AlphaNumericString.charAt(k));
	                n--;
	            }
	        }
	  
	 
		writer.write(r.toString());
	}
	public void run() {

		try {
			write();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		finally
		{
			if(writer!=null)
			{
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}


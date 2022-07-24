
package Thread;

import java.io.*;
import java.net.*;

public class URLConnectionExample {
	public void getMethod() throws IOException {
		URL url = new URL("https://eop7frxnbayrid8.m.pipedream.net");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int statuscode = connection.getResponseCode();
		System.out.println("Status Code" + statuscode);
		String message=connection.getResponseMessage();
		System.out.println("Message "+message);
		
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputstreamReader=new InputStreamReader(inputstream);
		BufferedReader bufferReader=new BufferedReader(inputstreamReader);
		String line;
		StringBuffer string=new StringBuffer();
		while((line=bufferReader.readLine())!=null)
		{
			
			string.append(line);
		}
		System.out.println(string);
		
	}

	public static void main(String[] args) throws IOException {
		
		
		URLConnectionExample  coneg=new URLConnectionExample();
		coneg.getMethod();
	}
}
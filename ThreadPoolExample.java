package Thread;

import java.io.*;
import java.net.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class URLConnectionTask implements Runnable {
	
	public void getMethod() throws IOException {
		URL url = new URL("https://eop7frxnbayrid8.m.pipedream.net");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int statuscode = connection.getResponseCode();
		System.out.println("Status Code" + statuscode);
		String message = connection.getResponseMessage();
		System.out.println("Message " + message);

		InputStream inputstream = connection.getInputStream();
		InputStreamReader inputstreamReader = new InputStreamReader(inputstream);
		BufferedReader bufferReader = new BufferedReader(inputstreamReader);
		String line;
		StringBuffer string = new StringBuffer();
		while ((line = bufferReader.readLine()) != null) {

			string.append(line);
		}
		System.out.println(string);

	}
	public void run()
	{
		   try {
	            try {
	    			getMethod();
	    		} catch (IOException e) {
	    			System.out.println(e.getMessage());
	    		}
	           Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
	}

}

public class ThreadPoolExample {
	 public static void main(String[] args) 
	    {
	        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
	         
	        for (int i = 1; i <= 5; i++) 
	        {
	        	URLConnectionTask task = new URLConnectionTask();
//	            System.out.println("Created : " + task.getName());
	 
	            executor.execute(task);
	        }
	        executor.shutdown();
	    }
}

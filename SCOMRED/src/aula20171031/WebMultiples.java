package aula20171031;

import java.io.*;
import java.net.*;

public class WebMultiples {

	private static int count = 0;
	
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(8080);
		} catch (IOException ioe) {
			System.out.println("Error opening ServerSocket: " + ioe.getMessage());
			System.exit(1);
		}
		
		while(true) {
			try {
			Socket cs = ss.accept();
			Thread th = new Thread(new HttpClient(cs));
			th.start();
			setCount();
			} catch(IOException ioe) {
				System.out.println("Error accepting connection: " + ioe.getMessage());
			}
		}
	}
	
	public synchronized static int getCount() {
		return count;
	}
	
	public synchronized static int setCount() {
		return count = count + 1;
	}

}

package aula20171031;

import java.io.*;
import java.net.*;

public class WebMultiples {

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
			} catch(IOException ioe) {
				System.out.println("Error accepting connection: " + ioe.getMessage());
			}
		}
	}

}

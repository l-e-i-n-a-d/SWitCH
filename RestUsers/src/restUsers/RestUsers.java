package restUsers;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RestUsers {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(8085);
		} catch (IOException ioe) {
			System.out.println("Error opening ServerSocket: " + ioe.getMessage());
			System.exit(1);
		}

		while (true) {
			try {
				Socket cs = ss.accept();
				Thread th = new Thread(new HttpProcessRequest(cs));
				th.start();
			} catch (IOException ioe) {
				System.out.println("Error accepting connection: " + ioe.getMessage());
			}
		}
	}
}

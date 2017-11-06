package aula20171017;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpChatSrv {

	private static final int DEFAULT_PORT = 8099;

	public static void main(String[] args) {
		ServerSocket sS;
		Socket cS;
		try {
			sS = new ServerSocket(DEFAULT_PORT);
			while(true) {
				cS = sS.accept(); // wait for a new connection
				Thread th = new Thread(new ThreadClient(cS));
				th.start();
			}
			
		} catch (IOException e) {
			System.out.println("Fatal error" + e.getMessage());
			System.exit(1); // Number 1 to be different from 0
		}
		
		
	}

}

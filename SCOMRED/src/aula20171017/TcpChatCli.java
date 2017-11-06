package aula20171017;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TcpChatCli {

	static final int DEFAULT_PORT = 8099;

	public static void main(String[] args) {

		String serverName, nickName;
		InetAddress serverIP;
		Socket ss;
		Scanner sc = new Scanner(System.in);
		DataOutputStream outS;
		DataInputStream inS;

		try {
			System.out.print("Server adress: ");
			serverName = sc.nextLine();
			serverIP = InetAddress.getByName(serverName);
			ss = new Socket(serverIP, DEFAULT_PORT);
			outS = new DataOutputStream(ss.getOutputStream());
			inS = new DataInputStream(ss.getInputStream());
			Message resp;
			do {
				System.out.print("Nickname or empty message to give up: ");
				nickName = sc.nextLine();
				Message msg = new Message(nickName);
				msg.send(outS);
				resp = new Message(inS);
				if (resp.isEmpty()) {
					ss.close();
					System.exit(0);
				}
				if (resp.getString().equals("KO")) {
					System.out.println("Nickname in use... ");
				}
			} while (!resp.getString().equals("OK"));

			// Client registered
			System.out.print("Registered in server");
			System.out.print("You can write now (empty phrase to exit)...");
			Thread th = new Thread(new ReaderThread(inS));
			th.start();
			Message m;
			do {
				String sentence = sc.nextLine();
				m = new Message(sentence);
				m.send(outS);
			} while (!m.isEmpty());
			try {
				th.join();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}

		} catch (Exception e) {
			System.out.println("Fatal error " + e.getMessage());
			System.exit(1);
		}
	}
}

package aula20171017;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ThreadClient implements Runnable {

	private Socket clisock;

	public ThreadClient(Socket s) {
		this.clisock = s;
	}

	@Override
	public void run() {
		try {
			DataOutputStream outS = new DataOutputStream(clisock.getOutputStream());
			DataInputStream inS = new DataInputStream(clisock.getInputStream());

			while (true) {
				Message msg = new Message(inS);
				if (msg.error()) {
					clisock.close(); return; //return termina a thread
				}
				if(msg.isEmpty()) {
					msg.send(outS);
					clisock.close(); return;//return termina a thread
				}
				if (ClientList.add(msg.getString()))
					break;
				Message ko = new Message("KO");
				ko.send(outS);
			}

			Message ok = new Message("OK");
			ok.send(outS);

		} catch (IOException e) {
			try {
				clisock.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}

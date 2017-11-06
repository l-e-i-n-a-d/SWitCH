package aula20171017;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.spec.MGF1ParameterSpec;

public class ThreadClient implements Runnable {

	private Socket clisock;

	public ThreadClient(Socket s) {
		this.clisock = s;
	}

	@Override
	public void run() {
		String nickname;
		try {
			DataOutputStream outS = new DataOutputStream(clisock.getOutputStream());
			DataInputStream inS = new DataInputStream(clisock.getInputStream());

			while (true) {
				Message msg = new Message(inS);
				if (msg.error()) {
					clisock.close();
					return; // return thread ends
				}
				// QUESTION: if isEmpty why send outputstream
				// ANSWER: When client wants to terminate conversation sends an empty msg
				if (msg.isEmpty()) {
					msg.send(outS);
					clisock.close();
					return;// return thread ends
				}
				nickname = msg.getString();
				if (ClientList.add(nickname, outS))
					break;
				Message ko = new Message("KO");
				ko.send(outS);
			}

			Message ok = new Message("OK");
			ok.send(outS);

			// client registered
			while (true) {
				Message msg = new Message(inS);
				if (msg.error()) {
					ClientList.delete(nickname);
				    clisock.close();
					return; // return thread ends
				}
				
				if (msg.isEmpty()) {
					msg.send(outS);
					clisock.close();
					return;// return thread ends
				}
				
				if(!msg.isCommand()) {
					Message wn = new Message("[" + nickname + "] " + msg.getString());
					ClientList.sendToAll(wn);
				}
			}

		} catch (IOException e) {
			try {
				clisock.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}

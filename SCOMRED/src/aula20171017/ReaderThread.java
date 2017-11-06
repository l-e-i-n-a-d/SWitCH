package aula20171017;

import java.io.DataInputStream;

public class ReaderThread extends Thread {

	private DataInputStream inS;

	public ReaderThread(DataInputStream inS) {
		this.inS = inS;
	}

	@Override
	public void run() {
		Message msg;
		do {
			msg = new Message(inS);
			System.out.println(msg.getString());
		} while (!msg.isEmpty());
	}
}

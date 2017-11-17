package restUsers;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import httpmessage.HTTPMessage;

public class HttpProcessRequest extends Thread {

	Socket cli;

	public HttpProcessRequest(Socket s) {
		cli = s;
	}

	@Override
	public void run() {
		DataInputStream in;
		DataOutputStream out;
		try {
			in = new DataInputStream(cli.getInputStream());
			out = new DataOutputStream(cli.getOutputStream());
			HTTPMessage req = new HTTPMessage(in);

		} catch (IOException ie) {
			System.out.println("Error on client connection");
		}
	}

}

package aula20171017;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Message {

	private int len;
	private byte[] content;

	/**
	 * Class constructor that creates an Message object from reading a DataInputStream
	 * @param inS DataInputStream from where the message is going to be read
	 */
	public Message(DataInputStream inS) {
		try {
			len = inS.read();
			content = new byte[len];
			inS.read(content, 0, len);
		} catch (Exception e) {
			len = -1; // assinala erro IO
		}
	}
	
	/**
	 * Class constructor that creates an Message object from reading a String
	 * @param s String from where the message is going to be read
	 */
	public Message(String s) {
		len = s.length();
		content = s.getBytes();		
	}

	public boolean error() {
		return (len == -1);
	}

	public boolean send(DataOutputStream outS) {
		if (len < 0 || len > 255)
			return false;
		try {
			outS.write(len);
			outS.write(content, 0, len);
		} catch (IOException e) {
			return false;
		}
		return true;
	}

	public boolean isEmpty() {return (len == 0);}
	
	public String getString() {
		String s = new String(content, 0, len);	
		return s;
	}


	public boolean isCommand() {
		// if(this.getString().startsWith(".")) return true;
		if(len < 1) return false;
		if(content[0] == '.') return true;
		return false;
	}

}

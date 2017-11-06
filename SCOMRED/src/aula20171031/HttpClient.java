package aula20171031;

import java.io.*;
import java.net.*;

public class HttpClient extends Thread{
	private Socket cliS;
	DataOutputStream out;
	DataInputStream in;
	
	public HttpClient(Socket s) {
		cliS = s;
	}
	
	@Override
	public void run() {
		try {
			out = new DataOutputStream(cliS.getOutputStream());
			in = new DataInputStream(cliS.getInputStream());
			
			String reqLine = readLineHttp();
			String headerLine;
			//Ignore header lines because it's just a GET request
			do {
				headerLine = readLineHttp();
			} while(!headerLine.isEmpty());
			
			String[] reqComp = reqLine.split(" ");
			
			if(!(reqComp[0].contentEquals("GET"))) return; //If the request line doesn't start with "GET " terminate thread 
			if((reqComp[1].contentEquals("/"))) sendForm();
			
		} catch (IOException ioe) {
			System.out.println("IO error: " + ioe.getMessage());
			return;
		}
	}
	
	private void sendForm() throws IOException {
		String form = "<html><head><title>WebMultiples</title></head>";
		form += "<body bgcolor=c0c0c0><h1>WebMultiples</h1>";
		form += "<h3>Multiples calculation of 2, 3, 5 and 7<p>";
		form += "<form action=/calculate method=GET>";
		form += "A: <input type=text name=A value=1>";
		form += "B: <input type=text name=B value=100>";
		form += "<input type=submit value=CALCULATE>";
		form += "</form></body></html>";
		sendHtmlContent(form);
	}

	private void sendHtmlContent(String content) throws IOException {
		byte[] bCont = content.getBytes();
		writeLineHttp("HTTP/1.0 200 OK"); //status line
		writeLineHttp("Content-type: text/html; charset=UTF8");
		writeLineHttp("Content-length: " + bCont.length);
		writeLineHttp("Connection: close");
		writeLineHttp("");
		out.write(bCont, 0, bCont.length);
	}
	
	private void writeLineHttp(String line) throws IOException {
		out.write(line.getBytes(), 0, line.length());
		out.write(CR);
		out.write(LF);
		
	}
	private final int CR = 13;
	private final int LF = 10;
	private String readLineHttp() throws IOException {
		String ret = "";
		int val;
		do {
			val = in.read();
			if(val!=CR) ret = ret + (char) val;
		} while(val!=CR);
		in.read();
		return ret;
	}
}

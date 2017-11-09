package aula20171031;

import java.io.*;
import java.net.*;

public class HttpClient extends Thread{
	private Socket cliS;
	DataOutputStream out;
	DataInputStream in;
	
	private final String HTML_HEAD = "<html><head><title>WebMultiples</title></head>" + 
	"<body bgcolor=c0c0c0><h1>WebMultiples</h1>";
	private final String HTML_TAIL = "<hr><a href=/>Regressar ao formulário</a>" +
			"<hr><a href=/status>STATUS</a>" +
			"<hr><a href=/close>CLOSE APPLICATION</a>" +
			"</body></html>";
	
	
	public HttpClient(Socket s) {
		this.cliS = s;
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
			if(!(reqComp[0].contentEquals("GET"))) sendNotImplemented();
			else if((reqComp[1].contentEquals("/"))) sendForm();
			else if(reqComp[1].startsWith("/calcula")) calcula(reqComp[1]);
			else if(reqComp[1].startsWith("/status")) getStatus();
			else if(reqComp[1].startsWith("/close")) close();

			else {
				sendNotFound();
			}
			
		} catch (IOException ioe) {
			System.out.println("IO error: " + ioe.getMessage());
			return;
		}
	}
	
	private void close() throws IOException {
		String content = HTML_HEAD + "<h2>Aplicação terminada</h2>" + "</body></html>";
		sendHtmlContent(content);	
		System.exit(0);
	}

	private void getStatus() throws IOException {
		String content = HTML_HEAD + "<h2>Pedidos HTTP pedidos até ao momento: " + String.valueOf(WebMultiples.getCount()) 
		+ "</h2><hr>" + "<h2>Endereço do cliente: " + cliS.getInetAddress().getHostName().toString() 
		+ " : " + cliS.getPort() + "</h2>" + HTML_TAIL;
		sendHtmlContent(content);	
	}

	//uri /calcula?A=valor1&B=valor2
	private void calcula(String uri) throws IOException {
		String args[] = uri.split("=");
		if (args.length != 3) {sendInvalidData(); return;}
		String valor2 = args[2];
		String valor1 = args[1].substring(0, args[1].length() - 2);
		int v1, v2;
		try {
			v1 = Integer.parseInt(valor1);
			v2 = Integer.parseInt(valor2);
		} catch (NumberFormatException ne) {
			sendInvalidData(); return;
		}
		
		String content = HTML_HEAD;
		if(v1>v2) { //change limits
			int aux = v1;
			v1 = v2;
			v2 = aux;
			content += "<p>Os limites do intervalo foram trocados</p>";
		}
		
		if(v1 < 0) {
			sendInvalidData(); return;
		}
		
		String[] multiplos = new String[4];
		for (int i = 0; i < 4; i++) {
			multiplos[i] = "";
		}
		
		int[] divisores = {2, 3, 5, 7};
		for(int v = v1; v <= v2; v++) {
			for(int d = 0; d < 4; d++) {
				if(v % divisores[d] == 0) multiplos[d] += v + " ; ";
			}
		}

		content += "<h3>Múltiplos de 2, 3, 5 e 7 no intervalo " + "[ " + v1 + " , " + v2 + " ]</h3><hr>";
		for(int d = 0; d < 4; d++) {
			content += "<p><b>Múltiplos de " + divisores[d] + " : </b>" + multiplos[d] + "</p><hr>";
		}
		content += HTML_TAIL;
		sendHtmlContent(content);
	}
	
	private void sendInvalidData() throws IOException {
		String content = HTML_HEAD + "<h2>Os dados fornecidos são inválidos</h2>" + HTML_TAIL;
		sendHtmlContent(content);
	}

	private void sendForm() throws IOException {
		String form = HTML_HEAD;
		form += "<h3>Multiples calculation of 2, 3, 5 and 7<p>";
		form += "<form action=/calculate method=GET>";
		form += "A: <input type=text name=A value=1><br><br>";
		form += "B: <input type=text name=B value=100>";
		form += "<br><br><input type=submit value=CALCULATE>";
		form += "</form>";
		form += HTML_TAIL;
		sendHtmlContent(form);
	}

	private void sendHtmlContent(String content) throws IOException {
		byte[] bCont = content.getBytes();
		writeLineHttp("HTTP/1.0 200 OK"); //status line
		writeLineHttp("Content-type: text/html; meta charset=UTF-8");
		writeLineHttp("Content-length: " + bCont.length);
		writeLineHttp("Connection: close");
		writeLineHttp("");
		out.write(bCont, 0, bCont.length);
	}
	
	private void sendNotFound() throws IOException {
		String content = HTML_HEAD + "<h2>Endereço inválido</h2>" + HTML_TAIL;
		byte[] bCont = content.getBytes();
		writeLineHttp("HTTP/1.0 404 Not Found"); //status line
		writeLineHttp("Content-type: text/html; meta charset=UTF-8");
		writeLineHttp("Content-length: " + bCont.length);
		writeLineHttp("Connection: close");
		writeLineHttp("");
		out.write(bCont, 0, bCont.length);
		
	}

	private void sendNotImplemented() throws IOException {
		String content = HTML_HEAD + "<h2>Method not implemented</h2>" + HTML_TAIL;
		byte[] bCont = content.getBytes();
		writeLineHttp("HTTP/1.0 501 Not Implemented"); //status line
		writeLineHttp("Content-type: text/html; meta charset=UTF-8");
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

package aula20171017;

import java.io.IOException;
import java.net.InetAddress;

public class TcpChatCli {

	private static InetAddress IPdestino;
	private static int SERVER_PORT = 9999;

	public static void main(String[] args) throws IOException {

	}

	public static int getSERVER_PORT() {
		return SERVER_PORT;
	}

	public static void setSERVER_PORT(int sERVER_PORT) {
		SERVER_PORT = sERVER_PORT;
	}

}

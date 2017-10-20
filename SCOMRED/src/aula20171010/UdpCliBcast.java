package aula20171010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

public class UdpCliBcast {

	static InetAddress IPdestino;
	static final int SERVER_PORT = 9999;
	final static String BCAST_ADDRESS = "255.255.255.255";

	public static void main(String[] args) throws IOException {

		byte[] data = new byte[300];
		String frase = null;
		InetAddress myServer = null;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// System.out.print("Indique o endereço do servidor ou nome DNS: ");
		// frase = in.readLine();

		try {
			IPdestino = InetAddress.getByName(BCAST_ADDRESS);
		} catch (UnknownHostException ex) {
			System.out.println("O endereço/nome não é válido: " + frase);
			System.exit(1);
		}

		DatagramSocket sock = new DatagramSocket();

		sock.setSoTimeout(2000);

		sock.setBroadcast(true);

		DatagramPacket udpPacket = new DatagramPacket(data, data.length, IPdestino, SERVER_PORT);

		while (true) {
			System.out.print("Frase a enviar (para terminar utilize sair): ");
			frase = in.readLine();
			if (frase.compareTo("sair") == 0)
				break;
			udpPacket.setData(frase.getBytes());
			udpPacket.setLength(frase.length());
			sock.send(udpPacket);
			udpPacket.setData(data);
			udpPacket.setLength(data.length);

			try {
				do {
					sock.receive(udpPacket);
					if (myServer == null)
						myServer = udpPacket.getAddress(); // get ip address if it doesn´t exist
				} while (udpPacket.getAddress() != myServer);

				frase = new String(udpPacket.getData(), 0, udpPacket.getLength());
				System.out.println("Resposta recebida do servidor: " + frase);
			} catch (SocketTimeoutException e) {
				System.out.println("O servidor não respondeu!");
			}
		}
		sock.close();
	}

}

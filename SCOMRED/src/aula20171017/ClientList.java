package aula20171017;

import java.io.DataOutputStream;
import java.util.HashMap;

public class ClientList {
	
	private static HashMap<String, Client> clientList = new HashMap<>();

		public synchronized static boolean add(String nick, DataOutputStream outS) {
			if(clientList.containsKey(nick)) {
				return false;
			}
			Client cli = new Client(outS);
			clientList.put(nick, cli);
			return true;
		}
		
		public synchronized static boolean delete(String nick) {
//			if(!clientList.containsKey(nick)) {return false;}
			return (clientList.remove(nick) != null);
		}

		public synchronized static void sendToAll(Message msg) {
			for(Client c : clientList.values()) {
				msg.send(c.getOutS());
			}
		}
}

package aula20171017;

import java.util.Hashtable;
import java.util.List;

public class ClientList {
	
	private static Hashtable<String, Client> clientList = new Hashtable<>();

		public synchronized static boolean add(String nick) {
			if(clientList.containsKey(nick)) {
				return false;
			}
			Client cli = new Client();
			clientList.put(nick, cli);
			return true;
		}
}

package aula20171107;

import java.util.ArrayList;
import java.util.List;

public class ContactBook {

	private List<Person> contactList = new ArrayList<>();

	public boolean add(Person c) {
		if (contactExists(c.getNumber()))
			return false;
		return contactList.add(c);
	}

	public boolean remove(Person c) {
		if (!contactExists(c.getNumber()))
			return false;
		return contactList.remove(c);

	}

	public List<Person> search(String name) {
		List<Person> auxList = new ArrayList<>();
		for (Person c : contactList) {
			//TODO: change code logic to the Contact class to make possible to search more then consecutive names
			String auxStr = c.getName().toLowerCase();
			if (auxStr.contains(name.toLowerCase())) auxList.add(c);
		}
		return auxList;
	}

	public boolean contactExists(String number) {
		for (Person c : contactList) {
			if (c.getNumber().equals(number))
				return true;
		}
		return false;
	}
	
	public List<Person> searchCommonContacts(ContactBook cb) {
		List<Person> auxList = new ArrayList<>();
		for(Person a : this.contactList) {
			for(Person b : cb.contactList) {
				if(a.equals(b)) auxList.add(b);
			}
		}
		return auxList;
	}
}

package aula20171107;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Group {

	private List<Person> groupList = new ArrayList<>();

	public boolean addPerson(Person person) {
		if (personExists(person.getNumber()))
			return false;
		return groupList.add(person);
	}

	public boolean remove(Person c) {
		if (!personExists(c.getNumber()))
			return false;
		return groupList.remove(c);

	}

	public List<Person> search(String number) {
		List<Person> auxList = new ArrayList<>();
		for (Person person : groupList) {
			if (person.getNumber().equals(number))
				auxList.add(person);
		}
		return auxList;
	}

	public boolean personExists(String number) {
		for (Person c : groupList) {
			if (c.getNumber().equals(number))
				return true;
		}
		return false;
	}

	public void changePersonalData(Person person, String field, Object data) {
		switch (field) {
		case "name":
			person.setName((String) data);
			break;
		case "adress":
			person.addAdress((Adress) data);
			break;
		case "dateOfBirth":
			person.setDateOfBirth((LocalDate) data);
			break;
		case "phoneNumber":
			person.setPhoneNumber((String) data);
			break;
		case "email":
			person.setEmail((String) data);
			break;
		case "nif":
			person.setNif((String) data);
			break;
		case "taskListToDo":
			person.addAdress((Adress) data);
			break;
		case "taskListDone":
			person.setTaskListDone((Task) data);
			break;
		default:
			return;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupList == null) ? 0 : groupList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Group other = (Group) obj;
		if (groupList == null) {
			if (other.groupList != null) {
				return false;
			}
		} else if (!groupList.equals(other.groupList)) {
			return false;
		}
		return true;
	}

}

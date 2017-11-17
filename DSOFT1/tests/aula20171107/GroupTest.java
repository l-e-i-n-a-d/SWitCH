package aula20171107;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GroupTest {
	List<Task> taskListToDo = new ArrayList<>();
	List<Task> taskListDone = new ArrayList<>();
	List<Adress> adressList = new ArrayList<>();

	Person person1;
	Person person2;
	Person person3;

	@Before
	public void initializer() {
		person1 = new Person("2", "Daniel", new ArrayList<Group>(), adressList, LocalDate.of(2017, 11, 15),
				"+351966631898", "daniel@gmail.com", "222594829", taskListToDo, taskListDone);
		person2 = new Person("3", "Joaquim", new ArrayList<Group>(), adressList, LocalDate.of(2005, 11, 15),
				"+351966635648", "joaquim@gmail.com", "222594567", taskListToDo, taskListDone);
		person3 = new Person("4", "Manel", new ArrayList<Group>(), adressList, LocalDate.of(2017, 10, 15),
				"+351966631234", "manel@gmail.com", "222594123", taskListToDo, taskListDone);
	}

	@Test
	public void testAddPerson() {
		Group group = new Group();
		assertTrue(group.addPerson(person1));
		assertFalse(group.addPerson(person1));
	}

	@Test
	public void testRemove() {
		Group book = new Group();
		book.addPerson(person1);
		book.addPerson(person2);
		assertTrue(book.remove(person1));
		assertFalse(book.remove(person1));
	}

	@Test
	public void testSearch() {
		Group group = new Group();
		group.addPerson(person1);
		group.addPerson(person2);
		group.addPerson(person3);
		List<Person> searchList = group.search("2");
		List<Person> expectedList = new ArrayList<>();
		expectedList.add(person1);
		assertEquals(expectedList, searchList);
	}

	@Test
	public void testPersonExists() {
		Group book = new Group();
		book.addPerson(person1);
		book.addPerson(person2);
		assertTrue(book.personExists("2"));
		assertFalse(book.personExists("6"));
	}

	@Test
	public void testChangePersonalData() {
		Group group1 = new Group();
		group1.addPerson(person1);
		group1.addPerson(person2);
		group1.addPerson(person3);
		group1.changePersonalData(person1, "name", "António");
		// assertEquals(person1.getName(), );
	}
}

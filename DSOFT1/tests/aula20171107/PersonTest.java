package aula20171107;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	List<Task> taskListToDo;
	List<Task> taskListDone;
	List<Adress> adressList;
	Person person;

	@Before
	public void initialize() {
		taskListToDo = new ArrayList<>();
		taskListDone = new ArrayList<>();
		adressList = new ArrayList<>();
		person = new Person("2", "Daniel", new ArrayList<Group>(), adressList, LocalDate.of(2017, 11, 15),
				"+351966631898", "daniel@gmail.com", "222594829", taskListToDo, taskListDone);
	}

	@Test
	public void testPersonConstructor1() {
		assertTrue(person instanceof Person);
	}

	@Test
	public void testPersonConstructor2() {
		Person person = new Person();
		assertTrue(person instanceof Person);
	}

	@Test
	public void testAddAdress() {
		Adress adress1 = new Adress("Rua do Porto", "4250-541", "Porto", "Portugal");
		Adress adress2 = new Adress("Rua de Baixo", "4500-200", "Porto", "Portugal");
		List<Adress> expectedList = new ArrayList<>();
		expectedList.add(adress1);
		expectedList.add(adress2);
		person.addAdress(adress1);
		person.addAdress(adress2);
		assertEquals(expectedList, person.getAdressList());

		person.addAdress(adress1);
		assertFalse(expectedList.size() != person.getAdressList().size());
	}

	@Test
	public void testGetAdress() {
		Adress adress1 = new Adress("Rua do Porto", "4250-541", "Porto", "Portugal");
		Adress adress2 = new Adress("Rua de Baixo", "4500-200", "Viana", "Portugal");
		// List<Adress> expectedList = new ArrayList<>();
		// expectedList.add(adress1);
		// expectedList.add(adress2);
		person.addAdress(adress1);
		person.addAdress(adress2);
		assertEquals(adress1, person.getAdress("Porto"));
		assertEquals(adress2, person.getAdress("Viana"));
	}

	@Test
	public void testAddTaskToDo() {
		Task task1 = new Task("Do something", LocalDate.of(2017, 11, 15));
		person.addTaskToDo(task1);
		List<Task> expectedList = new ArrayList<>();
		expectedList.add(task1);
		assertEquals(expectedList, person.getTaskListToDo());

		Task task2 = new Task("Do somethingelse", LocalDate.of(2015, 12, 15));
		person.addTaskToDo(task2);
		expectedList.add(task2);
		assertEquals(expectedList, person.getTaskListToDo());
	}

	@Test
	public void testGetAdressList() {
		Adress adress1 = new Adress("Rua do Porto", "4250-541", "Porto", "Portugal");
		Adress adress2 = new Adress("Rua de Baixo", "4500-200", "Porto", "Portugal");
		List<Adress> expectedList = new ArrayList<>();
		expectedList.add(adress1);
		expectedList.add(adress2);
		person.addAdress(adress1);
		person.addAdress(adress2);
		assertTrue(person.getAdressList().get(0) == adress1);
		assertTrue(person.getAdressList().get(1) == adress2);
	}

	@Test
	public void testGetNumber() {
		assertEquals("2", person.getNumber());
	}

	@Test
	public void testSetNumber() {
		person.setNumber("3");
		assertEquals("3", person.getNumber());
	}

	@Test
	public void testGetName() {
		assertEquals("Daniel", person.getName());
	}

	@Test
	public void testSetName() {
		person.setName("Quim");
		assertEquals("Quim", person.getName());
	}

	@Test
	public void testGetGroup() {
		assertEquals(new ArrayList<Group>(), person.getGroup());
	}

}

package aula20171107;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ContactBookTests {
	
	Person c1 = new Person("966631898", "Daniel Barbosa");
	Person c2 = new Person("961234568", "Pedro Ferreira");
	Person c3 = new Person("915525412", "Daniel Pereira");
	Person c4 = new Person("915654112", "Quim Barreiros");
	Person c5 = new Person("915512345", "António Manuel");

	
	@Test
	public void testAdd() {
		ContactBook book = new ContactBook();
		assertTrue(book.add(c1));
		assertFalse(book.add(c1));
	}

	@Test
	public void testRemove() {
		ContactBook book = new ContactBook();
		book.add(c1);
		book.add(c2);
		assertTrue(book.remove(c1));
		assertFalse(book.remove(c1));
	}

	@Test
	public void testSearch() {
		ContactBook book = new ContactBook();
		book.add(c1);
		book.add(c2);
		book.add(c3);
		List<Person> searchList = book.search("Daniel");
		List<Person> expectedList = new ArrayList<>();
		expectedList.add(c1);
		expectedList.add(c3);
		assertEquals(expectedList, searchList);
	}

	@Test
	public void testContactExists() {
		ContactBook book = new ContactBook();
		book.add(c1);
		book.add(c2);
		assertTrue(book.contactExists("966631898"));
		assertFalse(book.contactExists("966631234"));
	}
	
	@Test
	public void testSearchCommonContacts() {
		ContactBook book1 = new ContactBook();
		book1.add(c1);
		book1.add(c2);
		book1.add(c3);
		book1.add(c4);
		book1.add(c5);
		ContactBook book2 = new ContactBook();
		book2.add(c1);
		book2.add(c2);
		List<Person> expected = new ArrayList<>();
		expected.add(c1);
		expected.add(c2);
		assertEquals(expected, book1.searchCommonContacts(book2));
		
	}
}

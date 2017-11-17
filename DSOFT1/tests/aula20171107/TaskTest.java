package aula20171107;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TaskTest {

	Task task;

	@Before
	public void initialize() {
		task = new Task("Do something", LocalDate.of(2017, 11, 15));
	}

	@Test
	public void testTaskContructor() {
		assertTrue(task instanceof Task);
	}

	@Test
	public void testIsDone() {
		assertFalse(task.isDone());
	}

	@Test
	public void testGetDescription() {
		assertEquals("Do something", task.getDescription());
	}

	@Test
	public void testSetDescription() {
		task.setDescription("Do anotherthing");
		assertEquals("Do anotherthing", task.getDescription());
	}

	@Test
	public void testGetDateOfCreation() {
		LocalDate date = LocalDate.of(2017, 11, 15);
		assertEquals(date, task.getDateOfCreation());
	}

	@Test
	public void testGetDateOfConclusion() {
		LocalDate date = null;
		assertEquals(date, task.getDateOfConclusion());
	}

	@Test
	public void testSetDateOfConclusion() {
		LocalDate date = LocalDate.of(2017, 12, 5);
		task.setDateOfConclusion(date);
		assertEquals(date, task.getDateOfConclusion());
	}

}

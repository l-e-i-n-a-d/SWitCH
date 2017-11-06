package aula20171004;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingExercice {

	@Test
	public void testMax() {
		assertEquals(4, Exercice.max(4, 2));
		assertEquals(1000, Exercice.max(1000, -2));
		assertEquals(4, Exercice.max(4, -2));
		assertEquals(-1, Exercice.max(-5, -1));

	}

}

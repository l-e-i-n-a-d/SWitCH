package aula20171004;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class TestingExercice {

	@Test
	public void test() {
		assertEquals(4, Exercice.max(4, 2));
		assertEquals(0, Exercice.max(0, 0));
		assertEquals(5, Exercice.max(0, 5));
		assertEquals(-1, Exercice.max(-5, -1));
	}
//Tests with Junit5
//	@Test
//	void testExpectedException() {
//		Assertions.assertThrows(NumberFormatException.class, () -> {
//			Integer.parseInt("One");
//		});
//	}
//	
//	@Test
//	void expectedException() {
//		Assertions.assertThrows(Exception.class, () -> {
//			Integer.parseInt("One");
//		});
	}


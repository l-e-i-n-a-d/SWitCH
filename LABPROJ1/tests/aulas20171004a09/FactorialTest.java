package aulas20171004a09;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import aula20171006.Factorial;

public class FactorialTest {

	@Test
	public void testFactorial1() {
		assertEquals(120, Factorial.factorial(5));
	}
	
	@Test
	public void testFactorial2() {
		assertEquals(3628800, Factorial.factorial(10));
	}
	
}

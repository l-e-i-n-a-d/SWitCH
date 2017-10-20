package aulas20171004a09;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import aula20171006.Fibonnaci;

public class FibonnaciTest {

	@Test
	public void testFibonnaci1() {
		assertEquals(5, Fibonnaci.calculateFibonnaci(5));
	}
	
	@Test
	public void testFibonnaci2() {
		assertEquals(6765, Fibonnaci.calculateFibonnaci(20));
	}
}

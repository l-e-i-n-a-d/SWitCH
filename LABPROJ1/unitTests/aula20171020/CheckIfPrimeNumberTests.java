package aula20171020;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckIfPrimeNumberTests {

	@Test
	public void testisPrimeNumber1() {
		int i = 257;
		assertTrue(CheckIfPrimeNumber.isPrimeNumber(i));
	}
	
	@Test
	public void testisPrimeNumber2() {
		int i = 15;
		assertFalse(CheckIfPrimeNumber.isPrimeNumber(i));
	}
	
	@Test
	public void testisPrimeNumber3() {
		int i = -12;
		assertFalse(CheckIfPrimeNumber.isPrimeNumber(i));
	}
}

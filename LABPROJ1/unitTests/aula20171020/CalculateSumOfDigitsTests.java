package aula20171020;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateSumOfDigitsTests {

	@Test
	public void testSumDigits1() {
		int i = 125;
		int expected = 8;
		assertEquals(expected, CalculateSumOfDigits.sumDigits(i));
	}
	
	@Test
	public void testSumDigits2() {
		int i = -125;
		int expected = 8;
		assertEquals(expected, CalculateSumOfDigits.sumDigits(i));
	}
	
	@Test
	public void testSumDigits3() {
		int i = 0;
		int expected = 0;
		assertEquals(expected, CalculateSumOfDigits.sumDigits(i));
	}

}

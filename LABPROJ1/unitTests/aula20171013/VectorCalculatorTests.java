package aula20171013;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorCalculatorTests {

	@Test
	public void testMean1() {
		int[] arr = new int[] { 1, 2, 3, 4 };
		double n = 2.5;
		assertEquals(n, VectorCalculator.mean(arr), 0.0001);
	}

	@Test
	public void testMean2() {
		int[] arr = new int[] {};
		double n = Double.NaN;
		assertEquals(n, VectorCalculator.mean(arr), 0.0001);
	}

	@Test
	public void testStandardDeviation() {
		int[] arr = new int[] { 1, 2, 3, 4 };
		assertEquals(1.29099, VectorCalculator.standardDeviation(arr), 0.00001);
	}

	@Test
	public void testReverseOrder() {
		int[] arr = new int[] { 1, 2, 3, 4 };
		assertArrayEquals(new int[] { 4, 3, 2, 1 }, VectorCalculator.reverseOrder(arr));
	}

	@Test
	public void testBubbleSort() {
		int[] arr = new int[] { 2, 1, 4, 3 };
		assertArrayEquals(new int[] { 1, 2, 3, 4 }, VectorCalculator.bubbleSort(arr));
	}

}

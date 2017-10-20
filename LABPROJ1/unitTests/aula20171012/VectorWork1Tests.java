package aula20171012;

import static org.junit.Assert.*;


import java.util.concurrent.ExecutionException;

import org.junit.Test;

public class VectorWork1Tests {

	@Test
	public void testNumberElements1() {
		int[] arr = {};
		assertEquals(0, VectorWork1.numberElements(arr));
	}
	
	@Test
	public void testNumberElements2() {
		int[] arr = {1,2,3};
		assertEquals(3, VectorWork1.numberElements(arr));
	}

	@Test
	public void testBiggestNumber1() {
		int[] arr = {};
		assertEquals(0, VectorWork1.biggestNumber(arr));
	}
	
	@Test
	public void testBiggestNumber2() {
		int[] arr = {1,2,3};
		assertEquals(3, VectorWork1.biggestNumber(arr));
	}
	@Test
	public void testShorttestNumber1() {
		int[] arr = {};
		assertEquals(0, VectorWork1.shorttestNumber(arr));
	}
	@Test
	public void testShorttestNumber2() {
		int[] arr = {1,2,3};
		assertEquals(1, VectorWork1.shorttestNumber(arr));
	}

	@Test(expected = ExecutionException.class)
	public void testSumElements1() {
		int[] arr = {};
		assertEquals(0, VectorWork1.sumElements(arr));	}

	@Test
	public void testSumElements2() {
		int[] arr = {1,2,3};
		assertEquals(6, VectorWork1.sumElements(arr));	}
	
	@Test
	public void testSumPairElements1() {
		int[] arr = {};
		assertEquals(0, VectorWork1.sumPairElements(arr));
	}
	
	@Test
	public void testSumPairElements2() {
		int[] arr = {0,2,3,6};
		assertEquals(8, VectorWork1.sumPairElements(arr));
	}

	@Test
	public void testSumMultiples1() {
		int[] arr = {};
		int n = 1;
		assertEquals(0, VectorWork1.sumMultiples(arr, n));
	}
	
	@Test
	public void testSumMultiples2() {
		int[] arr = {2,3,4,6,8};
		int n = 2;
		assertEquals(20, VectorWork1.sumMultiples(arr, n));
	}

	@Test
	public void testIsEmpty1() {
		int[] arr = {};
		assertTrue(VectorWork1.isEmpty(arr));
	}
	
	@Test
	public void testIsEmpty2() {
		int[] arr = {1,2,3};
		assertFalse(VectorWork1.isEmpty(arr));
	}

	@Test
	public void testHasOneElement1() {
		int[] arr = {1};
		assertTrue(VectorWork1.hasOneElement(arr));
	}
	
	@Test
	public void testHasOneElement2() {
		int[] arr = {1,2,23};
		assertFalse(VectorWork1.hasOneElement(arr));
	}
	
	@Test
	public void testHasOneElement3() {
		int[] arr = {};
		assertFalse(VectorWork1.hasOneElement(arr));
	}

	@Test
	public void testHasOnlyIntegers1() throws Exception{
		double[] arr = {1,2,2.3};
		assertFalse(VectorWork1.hasOnlyIntegers(arr));
	}
	
	@Test
	public void testHasOnlyIntegers2() throws Exception{
		double[] arr = {1,2,3};
		assertTrue(VectorWork1.hasOnlyIntegers(arr));
	}
	
	@Test(expected = Exception.class)
	public void testHasOnlyIntegers3() throws Exception{
		double[] arr = {};
		assertFalse(VectorWork1.hasOnlyIntegers(arr));
	}

	@Test
	public void testHasDuplicates1() {
		int[] arr = {};
		assertFalse(VectorWork1.hasDuplicates(arr));
	}
	
	@Test
	public void testHasDuplicates2() {
		int[] arr = {1,2,3};
		assertFalse(VectorWork1.hasDuplicates(arr));
	}
	
	@Test
	public void testHasDuplicates3() {
		int[] arr = {1,2,2,3};
		assertTrue(VectorWork1.hasDuplicates(arr));
	}

}

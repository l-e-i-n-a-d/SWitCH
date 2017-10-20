package aula20171011;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTwoArraysTests {

	@Test
	public void test1() {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 5, 3 };
		int[] expected = { 2, 7, 6 };

		assertArrayEquals(expected, SumTwoArrays.sum(arr1, arr2));
	}

	@Test
	public void test2() {
		int[] arr1 = {};
		int[] arr2 = {};
		int[] expected = {};

		assertArrayEquals(expected, SumTwoArrays.sum(arr1, arr2));
	}

	@Test(expected = Exception.class)
	public void test4() {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3, 4, 5 };

		SumTwoArrays.sum(arr1, arr2);
	}
}

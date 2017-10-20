package aula20171012;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.Test;

public class VectorWork2Tests {

	@Test
	public void testMultiplesOf3_1() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		int[] arr = new int[] {2,3,4};
		assertEquals(list, VectorWork2.multiplesOf3(arr));
	}
	
	@Test
	public void testMultiplesOf3_2() {
		ArrayList<Integer> list = new ArrayList<>();
		int[] arr = new int[] {};
		assertEquals(list, VectorWork2.multiplesOf3(arr));
	}

	@Test
	public void testMultiplesOfInt_1() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		int[] arr = new int[] {2,3,4,5};
		assertEquals(list, VectorWork2.multiplesOfInt(arr, 2));
	}
	
	@Test
	public void testMultiplesOfInt_2() {
		ArrayList<Integer> list = new ArrayList<>();
		int[] arr = new int[] {};
		assertEquals(list, VectorWork2.multiplesOfInt(arr, 2));
	}

	@Test
	public void testMultiplesOf3And5() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		int[] arr = new int[] {2,3,4,5,-2};
		assertEquals(list, VectorWork2.multiplesOf3And5(arr));
	}

	@Test
	public void testMultiplesOfTwoInts() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(-2);
		int[] arr = new int[] {2,3,4,5,-2};
		assertEquals(list, VectorWork2.multiplesOfTwoInts(arr, 2, 3));
	}

	@Test
	public void testMultiplesOfTwoIntsInInterval() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);
		int[] arr = new int[] {2,3,4,5,-2};
		assertEquals(list, VectorWork2.multiplesOfTwoIntsInInterval(arr, 2, 5, 3, 7));
	}

}

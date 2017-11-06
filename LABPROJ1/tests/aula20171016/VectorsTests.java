package aula20171016;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorsTests {

	@Test
	public void testFindIndex1() {
		
		int[] arr = {0,1,2,3,40};
		int i = 2;
		assertEquals(2, Vectors.findFirstIndex(arr, i));
		
	}
	@Test
	public void testFindIndex2() {
		
		int[] arr = {0,1,2,3,40};
		int i = 5;
		assertEquals(-1, Vectors.findFirstIndex(arr, i));
		
	}
	@Test
	public void testFindIndex3() {
		
		int[] arr = {0,1,2,2,40};
		int i = 2;
		assertEquals(2, Vectors.findFirstIndex(arr, i));
		
	}
	@Test
	public void testFindIndex4() {
		
		int[] arr = {};
		int i = 2;
		assertEquals(-1, Vectors.findFirstIndex(arr, i));
		
	}
	
	@Test
	public void testFindLastIndex1() {
		
		int[] arr = {0,1,2,3,40};
		int i = 2;
		assertEquals(2, Vectors.findLastIndex(arr, i));
		
	}
	@Test
	public void testFindLastIndex2() {
		
		int[] arr = {0,1,2,3,40};
		int i = 5;
		assertEquals(-1, Vectors.findLastIndex(arr, i));
		
	}
	@Test
	public void testFindLastIndex3() {
		
		int[] arr = {0,1,2,2,40};
		int i = 2;
		assertEquals(3, Vectors.findLastIndex(arr, i));
		
	}
	@Test
	public void testFindLastIndex4() {
		
		int[] arr = {};
		int i = 2;
		assertEquals(-1, Vectors.findLastIndex(arr, i));
		
	}
	

}

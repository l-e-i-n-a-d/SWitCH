package aula20171024;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumElementsTests {

	@Test
	public void testSumElements1() {
		int[][] arr1 = {{1, 0, 0, 0, 2},
					    {0, 0, 0, 0, 0},
					    {0 ,0, 5, 0, 0},
					    {0 ,0, 0, 0, 0},
					    {4 ,0, 0, 0, 3}};
		
		assertEquals(15, SumElements.sumElements(arr1));
	}
	
	@Test
	public void testSumElements2() {
		int[][] arr1 = {{1, 0, 0, 0, 1},
					    {0, 0, 0, 0, 0},
					    {0 ,0, 1, 0, 0},
					    {0 ,0, 0, 0, 0},
	   				    {1 ,0, 0, 0, 1}};
		
		assertEquals(5, SumElements.sumElements(arr1));
	}
	
	@Test
	public void testSumElements3() {
		int[][] arr1 = {{-1, 0, 0, 0, 1},
					   {0, 0, 0, 0, 0},
					   {0 ,0, 5, 0, 0},
					   {0 ,0, 0, 0, 0},
					   {1 ,0, 0, 0, -10}};
		
		assertEquals(-4, SumElements.sumElements(arr1));
	}

	@Test
	public void testSumElements4() {
		int[][] arr1 = {{-1, 0, 0, 0, 1, 0, 1},
					     {0, 0, 0, 0, 0, 0, 0},
					     {0 ,0, 5, 5, 0 , 0, 0},
					     {0 ,0, 0, 5, 0, 0, 0},
					     {1 ,0, 0, 0, 0, 0, -10},
					     {1 ,0, 0, 0, 0, 0, -10},
					     {1 ,0, 0, 0, 0, 0, -10}};
		
		assertEquals(-4, SumElements.sumElements(arr1));
	}
}

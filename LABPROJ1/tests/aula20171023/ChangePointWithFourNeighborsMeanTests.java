package aula20171023;

import static org.junit.Assert.*;
import org.junit.Test;
import org.hamcrest.CoreMatchers;

public class ChangePointWithFourNeighborsMeanTests {

	@Test
	public void testChangePoint1() {
		int[][] arr1 = {{0, 0, 0, 0, 0},
					   {0, 0, 0, 0, 0},
					   {0 ,0, 0, 0, 0},
					   {0 ,0, 0, 0, 0},
					   {0 ,0, 0, 0, 0}};
		
		assertArrayEquals(arr1, ChangePointWithFourNeighborsMean.changePoints(arr1));
	}
	
	@Test
	public void testChangePoint2() {
		int[][] arr = {{1, 1, 1, 1},
					   {1, 1, 3, 1},
					   {1 ,3, 2, 1},
					   {1 ,0, 4, 1}};
	
	
		int[][] expected = {{1, 1, 1, 1},
						   {1, 2, 1, 1},
						   {1 ,1, 3, 1},
						   {1 ,0, 4, 1}};
		
		assertArrayEquals(expected, ChangePointWithFourNeighborsMean.changePoints(arr));
	}
	
	@Test
	public void testChangePoint3() {
		int[][] arr = {{1, 1, 1, 1, 2},
					   {1, 1, 3, 1, 2},
					   {1 ,3, 2, 1, 2},
					   {1 ,0, 4, 1, 2}};
	
	
		int[][] expected = {{1, 1, 1, 1, 2},
						   {1, 2, 1, 2, 2},
						   {1 ,1, 3, 2, 2},
						   {1 ,0, 4, 1, 2}};
		
		assertArrayEquals(expected, ChangePointWithFourNeighborsMean.changePoints(arr));
	}

	//FIXME: assertThat not working
	public void testChangePoint4() {
		int[][] arr = {{1, 1, 1, 1, 2},
				   {1, 1, 3, 1, 2},
				   {1 ,3, 2, 1, 2},
				   {1 ,0, 4, 1, 2}};


	int[][] unexpected = {{1, 1, 1, 1, 2},
					   {1, 2, 1, 2, 2},
					   {1 ,1, 5, 2, 4},
					   {1 ,0, 4, 1, 3}};
	
		assertNotEquals(unexpected, ChangePointWithFourNeighborsMean.changePoints(arr));;
	}
}

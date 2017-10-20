package aula20171020;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckIfMatrixTriangularTests {

	@Test
	public void testIsMatrixTriangular1() {
		int[][] arr = {{1, 1, 1, 1, 1},
					   {0, 1, 1, 1, 1},
					   {0 ,0 ,1 ,1 ,1},
					   {0, 0, 0, 1, 1},
					   {0, 0, 0, 0, 1}};
		
		assertTrue(CheckIfMatrixTriangular.isMatrixTriangular(arr));
	}

	@Test
	public void testIsMatrixTriangular2() {
		int[][] arr = {{1, 0, 0, 0, 0},
					   {1, 1, 0, 0, 0},
					   {1 ,1 ,1 ,0 ,0},
					   {1, 1, 1, 1, 0},
					   {1, 1, 1, 1, 1}};
		
		assertTrue(CheckIfMatrixTriangular.isMatrixTriangular(arr));

	}
	
	@Test
	public void testIsMatrixTriangular3() {
		int[][] arr = {{1, 0, 0, 0, 0},
					   {1, 1, 0, 1, 0},
					   {1 ,1 ,1 ,0 ,0},
					   {1, 1, 1, 1, 0},
					   {1, 1, 1, 1, 1}};
		
		assertFalse(CheckIfMatrixTriangular.isMatrixTriangular(arr));

	}
	
	@Test
	public void testIsMatrixTriangular4() {
		int[][] arr = {{1, 1, 1, 1, 1},
					   {0, 1, 1, 1, 1},
					   {0 ,0 ,1 ,1 ,1},
					   {0, 0, 0, 1, 1},
					   {1, 0, 0, 0, 1}};
		
		assertFalse(CheckIfMatrixTriangular.isMatrixTriangular(arr));

	}
	
}

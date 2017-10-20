package aula20171016;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTests {

	@Test
	public void testMatrix1() {
		int[][] arr = new int[][] {{1,2,3},{2,4,6},{3,6,5}};
		assertTrue(Matrix.isSymetric1(arr));
	}
	
	@Test
	public void testMatrix2() {
		int[][] arr = new int[][] {{1,2,3},{1,2,3},{3,0,5}};
		assertFalse(Matrix.isSymetric1(arr));
	}
	
	@Test
	public void testMatrix3() {
		int[][] arr = new int[][] {{1,2,3},{1,2,3},{3,5}};
		assertFalse(Matrix.isSymetric1(arr));
	}

	
}

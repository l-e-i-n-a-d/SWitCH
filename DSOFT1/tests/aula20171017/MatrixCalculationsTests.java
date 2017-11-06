package aula20171017;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixCalculationsTests {

	@Test
	public void sumElementsInLineToArraySucess1() {
		int[][] arr = new int[][] { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		assertArrayEquals(new int[] { 10, 10, 10 }, MatrixCalculations.sumElementsInLineToArray(arr));
	}

	@Test
	public void sumElementsInLineToArrayEmptyMatrix() {
		int[][] arr = new int[][] { {} };
		assertArrayEquals(new int[] { 0 }, MatrixCalculations.sumElementsInLineToArray(arr));
	}

	@Test
	public void sumElementsInLineToArrayNegatives() {
		int[][] arr = new int[][] { { 1, 2 }, { 1, -2, 3 }, { 1, 2, 3, 4 } };

		assertArrayEquals(new int[] { 3, 2, 10 }, MatrixCalculations.sumElementsInLineToArray(arr));
	}

	@Test
	public void testExistsInMatrix1() {
		int[][] arrMatrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 10, 11, 12, 13 } };
		int[] arrVector = new int[] { 1, 2, 3, 4 };

		assertTrue(MatrixCalculations.ExistsInMatrix(arrVector, arrMatrix));
	}

	@Test
	public void testExistsInMatrix2() {
		int[][] arrMatrix = new int[][] { { 1, 2 }, { 3, 4, 7, 8 }, { 10, 11 } };
		int[] arrVector = new int[] { 1, 2, 7, 10 };

		assertTrue(MatrixCalculations.ExistsInMatrix(arrVector, arrMatrix));
	}

	@Test
	public void testExistsInMatrix3() {
		int[][] arrMatrix = new int[][] { {}, {}, {} };
		int[] arrVector = new int[] { 1, 2, 3, 4 };

		assertFalse(MatrixCalculations.ExistsInMatrix(arrVector, arrMatrix));
	}
	
	@Test
	public void testExistsInMatrix4() {
		int[][] arrMatrix = new int[][] { { 1, 2 }, { 3, 4, 0, 8 }, { 10, 11 } };
		int[] arrVector = new int[] { };

		assertFalse(MatrixCalculations.ExistsInMatrix(arrVector, arrMatrix));
	}

	
	
}

package aula20171102;

import static org.junit.Assert.*;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Matrix2Tests {

	@Test
	public void testTransposeColumnsToLinesSucess() throws Exception {

		int[][] arr = new int[][] { { 4, 3, 9, 5, 7, 2, 1, 8, 6 }, { 6, 8, 2, 4, 3, 1, 9, 5, 7 },
				{ 1, 5, 7, 8, 6, 9, 3, 4, 2 }, { 2, 7, 6, 9, 4, 3, 8, 1, 5 }, { 8, 9, 4, 1, 5, 6, 2, 7, 3 },
				{ 5, 1, 3, 7, 2, 8, 4, 6, 9 }, { 3, 6, 5, 2, 1, 4, 7, 9, 8 }, { 9, 2, 1, 6, 8, 7, 5, 3, 4 },
				{ 7, 4, 8, 3, 9, 5, 6, 2, 1 } };

		Matrix2 matrixObj = new Matrix2(arr);
		int[][] expectedArray = new int[][] { { 4, 6, 1, 2, 8, 5, 3, 9, 7 }, { 3, 8, 5, 7, 9, 1, 6, 2, 4 },
				{ 9, 2, 7, 6, 4, 3, 5, 1, 8 }, { 5, 4, 8, 9, 1, 7, 2, 6, 3 }, { 7, 3, 6, 4, 5, 2, 1, 8, 9 },
				{ 2, 1, 9, 3, 6, 8, 4, 7, 5 }, { 1, 9, 3, 8, 2, 4, 7, 5, 6 }, { 8, 5, 4, 1, 7, 6, 9, 3, 2 },
				{ 6, 7, 2, 5, 3, 9, 8, 4, 1 } };
		Matrix2 expected = new Matrix2(expectedArray);

		assertEquals(expected, matrixObj.transposeColumnsToLines());
	}
	
	@Test
	public void testExistsInMatrix1() {
		Matrix2 matrix = new Matrix2(new int[][] {{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 10, 11, 12, 13 }});
		int[] arrVector = new int[] { 1, 2, 3, 4 };
		assertTrue(matrix.existsInMatrix(arrVector, matrix));
	}
	
	@Test
	public void testIsMatrixSquareSucess() {
		Matrix2 matrix = new Matrix2(new int[][] {{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 10, 11, 12, 13 }, { 5, 6, 7, 8 }});
		assertTrue(matrix.isMatrixSquare(matrix));
	}
	
	@Test
	public void testIsMatrixSquareFail() {
		Matrix2 matrix = new Matrix2(new int[][] {{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 10, 11, 12, 13 }});
		assertFalse(matrix.isMatrixSquare(matrix));
	}
	
	@Test
	public void testOcorrencies() {
		Matrix2 matrix = new Matrix2(new int[][] {{ 1, 2, 3, 4 }, { 5, 6, 7, 2 }, { 10, 11, 12, 13 }});
		assertEquals(2, matrix.ocurrencies(matrix, 2));
	}
	
	@Test
	public void testSumElementsInLineToArray() {
		Matrix2 matrix = new Matrix2(new int[][] {{ 1, 2, 3, 4 }, { 5, 6, 7, 2 }});
		Vetor vetor = new Vetor(new int[] {10,20});
		assertEquals(vetor, matrix.sumElementsInLineToArray(matrix));
	}

	@Test
	public void testSetNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNumber() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPointsWithNumbers() {
		Matrix2 matrix = new Matrix2(new int[][] {{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 10, 11, 12, 13 }});
		List<Point2> expectedList = new ArrayList<>();
		expectedList.add(new Point2(0,2));
		assertEquals(expectedList, matrix.getPointsWithNumbers(3));
	}
	
	@Test
	public void testCloneMatrixSucess() {
		Matrix2 originalMatrix = new Matrix2(new int[][] {{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 10, 11, 12, 13 }});
		Matrix2 finalMatrix = new Matrix2(new int[][] {{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 10, 11, 12, 13 }});
		assertEquals(originalMatrix, finalMatrix);
	}
	
	@Test
	public void testCloneMatrixFail() {
		Matrix2 originalMatrix = new Matrix2(new int[][] {{ }, { }, { }});
		Matrix2 finalMatrix = new Matrix2(new int[][] {{ }, { }, { 1 }});
		assertEquals(originalMatrix, finalMatrix);
	}
}

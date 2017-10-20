package aula20171017;

import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuTests {

	@Test
	public void testCheckSudoku1() {
		int[][] arrMatrix = new int[][] { { 2, 9, 5, 7, 4, 3, 8, 6, 1 }, { 4, 3, 1, 8, 6, 5, 9, 2, 7 },
				{ 8, 7, 6, 1, 9, 2, 5, 4, 3 }, { 3, 8, 7, 4, 5, 9, 2, 1, 6 }, { 6, 1, 2, 3, 8, 7, 4, 9, 5 },
				{ 5, 4, 9, 2, 1, 6, 7, 3, 8 }, { 7, 6, 3, 5, 2, 4, 1, 8, 9 }, { 9, 2, 8, 6, 7, 1, 3, 5, 4 },
				{ 1, 5, 4, 9, 3, 8, 6, 7, 2 } };
		int[][] arr2 = new int[][] { { 4, 3, 9, 5, 7, 2, 1, 8, 6 }, { 6, 8, 2, 4, 3, 1, 9, 5, 7 },
				{ 1, 5, 7, 8, 6, 9, 3, 4, 2 }, { 2, 7, 6, 9, 4, 3, 8, 1, 5 }, { 8, 9, 4, 1, 5, 6, 2, 7, 3 },
				{ 5, 1, 3, 7, 2, 8, 4, 6, 9 }, { 3, 6, 5, 2, 1, 4, 7, 9, 8 }, { 9, 2, 1, 6, 8, 7, 5, 3, 4 },
				{ 7, 4, 8, 3, 9, 5, 6, 2, 1 } };

		assertTrue(Sudoku.checkSudoku(arrMatrix));
		assertTrue(Sudoku.checkSudoku(arr2));

	}

	@Test
	public void testCheckSudoku2() {
		int[][] arrMatrix = new int[][] { { 2, 9, 5, 7, 4, 3, 8, 6, 1 }, { 4, 3, 1, 8, 6, 5, 9, 2, 7 },
				{ 8, 7, 6, 1, 9 }, { 3, 8, 7, 4, 5, 9, 2, 1, 6 }, { 6, 1, 2, 3, 8, 7, 4, 9, 5 },
				{ 5, 4, 9, 2, 1, 6, 7, 3, 8 }, { 7, 6, 3, 5, 3, 4, 1, 8, 9 }, { 9, 2, 8, 6, 7, 1, 3, 5, 4 },
				{ 1, 5, 4, 9, 3, 8, 6, 7, 2 } };

		assertFalse(Sudoku.checkSudoku(arrMatrix));
	}

	@Test
	public void testIsMatrixSquare() {

		int[][] arr = new int[][] { { 4, 3, 9, 5, 7, 2, 1, 8, 6 }, { 6, 8, 2, 4, 3, 1, 9, 5, 7 },
				{ 1, 5, 7, 8, 6, 9, 3, 4, 2 }, { 2, 7, 6, 9, 4, 3, 8, 1, 5 }, { 8, 9, 4, 1, 5, 6, 2, 7, 3 },
				{ 5, 1, 3, 7, 2, 8, 4, 6, 9 }, { 3, 6, 5, 2, 1, 4, 7, 9, 8 }, { 9, 2, 1, 6, 8, 7, 5, 3, 4 },
				{ 7, 4, 8, 3, 9, 5, 6, 2, 1 } };
		assertTrue(Sudoku.isMatrixSquare(arr));
	}
	
	@Test
	public void testAreNumbers1To9() {

		int[][] arr = new int[][] { { 4, 3, 9, 5, 7, 2, 1, 8, 6 }, { 6, 8, 2, 4, 3, 1, 9, 5, 7 },
				{ 1, 5, 7, 8, 6, 9, 3, 4, 2 }, { 2, 7, 6, 9, 4, 3, 8, 1, 5 }, { 8, 9, 4, 1, 5, 6, 2, 7, 3 },
				{ 5, 1, 3, 7, 2, 8, 4, 6, 9 }, { 3, 6, 5, 2, 1, 4, 7, 9, 8 }, { 9, 2, 1, 6, 8, 7, 5, 3, 4 },
				{ 7, 4, 8, 3, 9, 5, 6, 2, 1 } };
		assertTrue(Sudoku.isMatrixSquare(arr));
	}
	
	@Test
	public void testAreLinesCorrect() {

		int[][] arr = new int[][] { { 4, 3, 9, 5, 7, 2, 1, 8, 6 }, { 6, 8, 2, 4, 3, 1, 9, 5, 7 },
				{ 1, 5, 7, 8, 6, 9, 3, 4, 2 }, { 2, 7, 6, 9, 4, 3, 8, 1, 5 }, { 8, 9, 4, 1, 5, 6, 2, 7, 3 },
				{ 5, 1, 3, 7, 2, 8, 4, 6, 9 }, { 3, 6, 5, 2, 1, 4, 7, 9, 8 }, { 9, 2, 1, 6, 8, 7, 5, 3, 4 },
				{ 7, 4, 8, 3, 9, 5, 6, 2, 1 } };
		assertTrue(Sudoku.isMatrixSquare(arr));
	}
	
	@Test
	public void testAreColumnsCorrect() {

		int[][] arr = new int[][] { { 4, 3, 9, 5, 7, 2, 1, 8, 6 }, { 6, 8, 2, 4, 3, 1, 9, 5, 7 },
				{ 1, 5, 7, 8, 6, 9, 3, 4, 2 }, { 2, 7, 6, 9, 4, 3, 8, 1, 5 }, { 8, 9, 4, 1, 5, 6, 2, 7, 3 },
				{ 5, 1, 3, 7, 2, 8, 4, 6, 9 }, { 3, 6, 5, 2, 1, 4, 7, 9, 8 }, { 9, 2, 1, 6, 8, 7, 5, 3, 4 },
				{ 7, 4, 8, 3, 9, 5, 6, 2, 1 } };
		assertTrue(Sudoku.isMatrixSquare(arr));
	}
	
	@Test
	public void testTransposeColumnsToLines() {

		int[][] arr = new int[][] { { 4, 3, 9, 5, 7, 2, 1, 8, 6 }, 
									{ 6, 8, 2, 4, 3, 1, 9, 5, 7 },
									{ 1, 5, 7, 8, 6, 9, 3, 4, 2 }, 
									{ 2, 7, 6, 9, 4, 3, 8, 1, 5 }, 
									{ 8, 9, 4, 1, 5, 6, 2, 7, 3 },
									{ 5, 1, 3, 7, 2, 8, 4, 6, 9 }, 
									{ 3, 6, 5, 2, 1, 4, 7, 9, 8 }, 
									{ 9, 2, 1, 6, 8, 7, 5, 3, 4 },
									{ 7, 4, 8, 3, 9, 5, 6, 2, 1 } };
				
		int[][] expected = new int[][] {{4,6,1,2,8,5,3,9,7},{3,8,5,7,9,1,6,2,4},{9,2,7,6,4,3,5,1,8},{5,4,8,9,1,7,2,6,3},{7,3,6,4,5,2,1,8,9},
			{2,1,9,3,6,8,4,7,5},{1,9,3,8,2,4,7,5,6},{8,5,4,1,7,6,9,3,2},{6,7,2,5,3,9,8,4,1}};
			
		assertArrayEquals(expected, Sudoku.transposeColumnsToLines(arr));
	}
	
	@Test
	public void testAreSubMatrixs3x3Correct() {

		int[][] arr = new int[][] { { 4, 3, 9 }, 
									{ 6, 8, 2 },
									{ 1, 5, 7 }};
									
		assertTrue(Sudoku.areSubMatrixs3x3Correct(arr));
				
	}

	@Test
	public void testMake3x3SubMatrix() {

		int[][] arr = new int[][] { { 4, 3, 9, 5, 7, 2, 1, 8, 6 }, 
									{ 6, 8, 2, 4, 3, 1, 9, 5, 7 },
									{ 1, 5, 7, 8, 6, 9, 3, 4, 2 }, 
									{ 2, 7, 6, 9, 4, 3, 8, 1, 5 }, 
									{ 8, 9, 4, 1, 5, 6, 2, 7, 3 },
									{ 5, 1, 3, 7, 2, 8, 4, 6, 9 }, 
									{ 3, 6, 5, 2, 1, 4, 7, 9, 8 }, 
									{ 9, 2, 1, 6, 8, 7, 5, 3, 4 },
									{ 7, 4, 8, 3, 9, 5, 6, 2, 1 } };
				
		int[][] expected = new int[][] {{4, 3, 9}, {6, 8, 2},{1, 5, 7}};
			
		assertArrayEquals(expected, Sudoku.make3x3SubMatrix(arr, 0, 0));
	}

	@Test
	public void testTransformSubMatrixToLine() {

		int[][] arr = new int[][] {{4, 3, 9}, {6, 8, 2},{1, 5, 7}};
				
		int[] expected = new int[] {4, 3, 9, 6, 8, 2, 1, 5, 7};
			
		assertArrayEquals(expected, Sudoku.transformSubMatrixToLine(arr));
		
	}	
}
 
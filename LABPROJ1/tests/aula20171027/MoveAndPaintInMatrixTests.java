package aula20171027;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Before;
import org.junit.Test;

public class MoveAndPaintInMatrixTests {
	
	@Before
	public void resetStaticVariables() {
		MoveAndPaintInMatrix.linePosition = 0;
		MoveAndPaintInMatrix.columnPosition = 0;
		MoveAndPaintInMatrix.direction = "RIGHT";
	}
	
//==========drawMatrix(...) tests================
	@Test

	public void testDrawMatrixSucess1() {
		char[][] matrix = {{'W', 'W', 'W', 'W', 'W', 'W'},
					      {'W', 'W', 'W', 'W', 'W', 'W'},
					      {'W', 'W', 'W', 'W', 'W', 'W'},				         
					      {'W', 'W', 'W', 'W', 'W', 'W'},
					      {'W', 'W', 'W', 'W', 'W', 'W'},
					      {'W', 'W', 'W', 'W', 'W', 'W'}};
		
		char[][] expected = {{'W', 'P', 'W', 'W', 'W', 'W'},
					         {'W', 'W', 'W', 'P', 'W', 'W'},
					         {'W', 'W', 'W', 'W', 'W', 'W'},				         
					         {'W', 'W', 'W', 'W', 'W', 'W'},
					         {'W', 'W', 'W', 'W', 'W', 'W'},
					         {'W', 'W', 'W', 'W', 'W', 'W'}};
		
		char[] steps = {'F','P', 'F', 'F', 'R', 'F', 'P'};
		
//		assertArrayEquals(finalMatrix, MoveAndPaintInMatrix.drawMatrix(steps, matrix));
//		assertThat(expected, is(equalTo(MoveAndPaintInMatrix.drawMatrix(steps, matrix))));
		assertThat(expected, equalTo(MoveAndPaintInMatrix.drawMatrix(steps, matrix)));
	}
	
	@Test
	public void testDrawMatrixSucess2() {
		char[][] matrix = {{'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},				         
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'}};
		
		char[][] expected = {{'W', 'P', 'W', 'W', 'W', 'W'},
					         {'W', 'W', 'W', 'W', 'W', 'W'},
					         {'W', 'W', 'W', 'W', 'W', 'W'},				         
					         {'W', 'W', 'P', 'P', 'W', 'W'},
					         {'W', 'W', 'W', 'W', 'W', 'W'},
					         {'W', 'W', 'W', 'W', 'W', 'W'}};
		
		char[] steps = {'F','P', 'F', 'R', 'F', 'F', 'F', 'P', 'R', 'R', 'R', 'F', 'P'};
		
		assertArrayEquals(expected, MoveAndPaintInMatrix.drawMatrix(steps, matrix));
	}
	
	@Test
	public void testDrawMatrixSucess3() {
		char[][] matrix = {{'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},				         
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'}};
		
		char[][] expected = {{'P', 'W', 'W', 'W', 'W', 'W'},
					         {'P', 'W', 'W', 'W', 'W', 'W'},
					         {'P', 'W', 'W', 'W', 'W', 'W'},				         
					         {'W', 'W', 'W', 'W', 'W', 'W'},
					         {'W', 'W', 'W', 'W', 'W', 'W'},
					         {'W', 'W', 'W', 'W', 'W', 'W'}};
		
		char[] steps = {'P', 'R', 'F', 'P', 'F', 'P'};
		
		assertArrayEquals(expected, MoveAndPaintInMatrix.drawMatrix(steps, matrix));
	}
	
	@Test
	public void testDrawMatrixWithEmptyMatrix() {
		char[][] matrix = {{}};	
		char[][] expected = {{}};	
		char[] steps = {'P', 'R', 'F', 'P', 'F', 'P'};
		assertArrayEquals(expected, MoveAndPaintInMatrix.drawMatrix(steps, matrix));
	}
	
	@Test(expected = NullPointerException.class)
	public void testDrawMatrixWithNullMatrix() {
		char[][] matrix = null;	
		char[] steps = {'P', 'R', 'F', 'P', 'F', 'P'};
		MoveAndPaintInMatrix.drawMatrix(steps, matrix);
	}
	
	@Test(expected = NullPointerException.class)
	public void testDrawMatrixWithNullSteps() {
		char[][] matrix = null;	
		char[] steps = {'P', 'R', 'F', 'P', 'F', 'P'};
		MoveAndPaintInMatrix.drawMatrix(steps, matrix);
	}
	
//==========isValidMatrix(...) tests================
	@Test
	public void testisValidMatrixWithEmptyMatrix() {
		char[][] matrix = {{}};
		assertFalse(MoveAndPaintInMatrix.isValidMatrix(matrix));
	}
	
	@Test
	public void testisValidMatrixSucess1() {
		char[][] matrix = {{'W', 'P', 'W', 'W', 'W', 'W'},
				           {'W', 'W', 'W', 'P', 'W', 'W'},
				           {'W', 'W', 'W', 'W', 'W', 'W'},				         
				           {'W', 'W', 'W', 'W', 'W', 'W'}};
		assertTrue(MoveAndPaintInMatrix.isValidMatrix(matrix));
	}
	
	@Test
	public void testisValidMatrixSucess2() {
		char[][] matrix = {{'W', 'W'}};	
		assertTrue(MoveAndPaintInMatrix.isValidMatrix(matrix));
	}
	
//==========paintCell(...) tests================	
	@Test
	public void testPaintCellSucess1() {
		char[][] matrix = {{'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},				         
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'}};
		
		MoveAndPaintInMatrix.paintCell(matrix);
		assertTrue(matrix[0][0] == 'P');
		
	}
	
	@Test
	public void testPaintCellSucess2() {
		char[][] matrix = {{'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},				         
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'},
					       {'W', 'W', 'W', 'W', 'W', 'W'}};
		
		MoveAndPaintInMatrix.linePosition = 1;
		MoveAndPaintInMatrix.columnPosition = 2;
		MoveAndPaintInMatrix.paintCell(matrix);
		assertTrue(matrix[1][2] == 'P');
		
	}
	
//==========rotate(...) tests================	
	@Test
	public void testRotateSucess1() {
		MoveAndPaintInMatrix.rotate();
		assertThat("DOWN", is(equalTo(MoveAndPaintInMatrix.direction)));
	}
	
	@Test
	public void testRotateSucess2() {
		MoveAndPaintInMatrix.direction = "UP";
		MoveAndPaintInMatrix.rotate();
		assertThat("RIGHT", is(equalTo(MoveAndPaintInMatrix.direction)));
	}

//==========moveForward(...) tests================	
	@Test
	public void testMoveForwardSucess1() {
		MoveAndPaintInMatrix.linePosition = 1;
		MoveAndPaintInMatrix.columnPosition = 1;
		MoveAndPaintInMatrix.direction = "UP";
		MoveAndPaintInMatrix.moveForward(MoveAndPaintInMatrix.direction);
		assertEquals(0, MoveAndPaintInMatrix.columnPosition);
	}
	
	@Test
	public void testMoveForwardSucess2() {
		MoveAndPaintInMatrix.linePosition = 0;
		MoveAndPaintInMatrix.columnPosition = 0;
		MoveAndPaintInMatrix.direction = "LEFT";
		MoveAndPaintInMatrix.moveForward(MoveAndPaintInMatrix.direction);
		assertEquals(-1, MoveAndPaintInMatrix.linePosition);
	}

//==========printMatrix(...) tests================	
	@Test
	public void testPrintMatrixSucess1() {	
		char[][] matrix = {{'W', 'W', 'W', 'W', 'W', 'W'}};
		
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		
		MoveAndPaintInMatrix.printMatrix(matrix);
		
		String expectedOutput = "[W, W, W, W, W, W]\r\n";    // \r carriage return  \n for new line.

		assertEquals(expectedOutput, outContent.toString());
	}

	@Test(expected = NullPointerException.class)
	public void testPrintMatrixWithNullArgument() {	
		char[][] matrix = null;
		MoveAndPaintInMatrix.printMatrix(matrix);
	}

}

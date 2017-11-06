package aula20171030;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MatrixTests {
	
	@Test
	public void testSumSucess() {
	 
		Matrix m1 = new Matrix(new int[][] {{1, 2}, {1, 2}});
		Matrix m2 = new Matrix(new int[][] {{1, 2}, {1, 2}});
		Matrix expected = new Matrix(new int[][] {{2, 4}, {2, 4}});

		assertArrayEquals(expected.m, (m1.sum(m2)).m);
	}

	@Test
	public void testMultiplySucess() {
		Matrix m1 = new Matrix(new int[][] {{1, 2, 3}, {4, 5, 6}});
		Matrix m2 = new Matrix(new int[][] {{7, 8}, {9, 10}, {11, 12}});
		Matrix expected = new Matrix(new int[][] {{58, 64}, {139, 154}});
		
		assertArrayEquals(expected.m, (m1.multiply(m2)).m);
		//method assertEquals works because of the Override of the equals meyhod in Matrix class
		assertEquals(expected, m1.multiply(m2));
	}
}

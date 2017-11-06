package aula20171031;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MatrixTests {

	@Test
	public void testGetPointsWithNumbers() {
		Matrix matrix = new Matrix(new int[][] {{1, 2, 3}, { 1, 2, 3}});
		int number = 2;
		Point firstPoint = new Point(0, 1);
		Point secondPoint = new Point(1, 1);
		List<Point> expected = new ArrayList<>();
		expected.add(firstPoint);
		expected.add(secondPoint);

		assertEquals(expected, matrix.getPointsWithNumbers(number));
	}
	
	@Test
	public void testSetNumber() {
		Matrix matrix = new Matrix(new int[][] {{1, 2, 3}, { 1, 2, 3}});
		int number = 5;
		Point point = new Point(0, 1);
		matrix.setNumber(point, number);
		assertEquals(5, matrix.getNumber(point));
	}
	
	@Test
	public void testGetNumber() {
		Matrix matrix = new Matrix(new int[][] {{1, 2, 3}, { 1, 2, 3}});
		Point point = new Point(0, 1);
		assertEquals(2, matrix.getNumber(point));

	}
}

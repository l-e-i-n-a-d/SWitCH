package aula20171031;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class WorkWithPointsTests {

	@Test
	public void testGetPointsSucess() throws Exception {
		
		char[][] matrix = {{'a', 'c', 'd'}, {'d', 'f', 'g'}, {'r', 't', 'a'}};
		char character = 'a';
		Point firstPoint = new Point(0,0);
		Point secondPoint = new Point(2,2);
		List<Point> expected = new ArrayList<>();
		expected.add(firstPoint);
		expected.add(secondPoint);
 		
		assertEquals(expected, WorkWithPoints.getPoints(matrix, character));
	}
	
	@Test(expected = Exception.class)
	public void testGetPointsFail() throws Exception {
		
		char[][] matrix = {};
		char character = 'a';
		Point firstPoint = new Point(0,0);
		Point secondPoint = new Point(2,2);
		List<Point> expected = new ArrayList<>();
		expected.add(firstPoint);
		expected.add(secondPoint);
 		
		assertEquals(expected, WorkWithPoints.getPoints(matrix, character));
	}
	

}

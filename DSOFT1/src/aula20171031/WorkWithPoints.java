package aula20171031;

import java.util.ArrayList;
import java.util.List;

public class WorkWithPoints {
	
	public static List<Point> getPoints(char[][] matrix, char c) throws Exception {
		if(matrix.length == 0) throw new Exception();
		List<Point> list = new ArrayList<>();
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == c) list.add(new Point(i, j));
			}
		}
		return list;
	}
}

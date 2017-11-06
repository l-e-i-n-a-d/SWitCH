package aula20171031;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix {
	
	int[][] m;
	int nlines, ncolumns;
	
	public Matrix(int nlines, int ncolumns) {
		m = new int[nlines][ncolumns];
		this.nlines = nlines;
		this.ncolumns = ncolumns;
	}
	
	public Matrix(int[][] matrix) {
		m = new int[matrix.length][matrix[0].length];
		this.nlines = matrix.length;
		this.ncolumns = matrix[0].length;
		m = copyMatrix(matrix, m);
	}
	
	public static int[][] copyMatrix(int[][] matrix, int[][] m) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				m[i][j] = matrix[i][j];
			}
		}
		return m;
	}

	public List<Point> getPointsWithNumbers(int number) {
		List<Point> list = new ArrayList<>();
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] == number) list.add(new Point(i, j));
			}
		}
		return list;
	}
	
	
	public void setNumber(Point point, int number) {
		m[point.getX()][point.getY()] = number;
	}
	
	public int getNumber(Point point) {
		return this.m[point.getX()][point.getY()];
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(m);
		result = prime * result + ncolumns;
		result = prime * result + nlines;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Matrix other = (Matrix) obj;
		if (!Arrays.deepEquals(m, other.m))	return false;
		if (ncolumns != other.ncolumns)	return false;
		if (nlines != other.nlines)	return false;
		return true;
	}

	@Override
	public String toString() {
		return "Matrix [m=" + Arrays.toString(m) + ", nlines=" + nlines + ", ncolumns=" + ncolumns + "]";
	}

}

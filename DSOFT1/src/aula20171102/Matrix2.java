package aula20171102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix2 {
	private int[][] m;
	
	public Matrix2(int nlines, int ncolumns) {
		m = new int[nlines][ncolumns];
	}
	
	public Matrix2(int[][] matrix) {
		m = matrix;
	}
	
	public boolean existsInMatrix(int[] vector, Matrix2 matrix) {
		if (vector.length == 0) return false;
		boolean b = false;
		outter: for (int i = 0; i < matrix.m.length; i++) {
			inner: for (int j = 0; j < matrix.m[i].length; j++) {
						for (int k : vector) {
							if (k == matrix.m[i][j]) {
								b = true;
								break inner;
							} else {
								break outter;
							}
						}
			}
		}
		return b;

	}
	
	public int ocurrencies(Matrix2 matrix, int number) {
		int sum = 0;
		for (int i = 0; i < matrix.m.length; i++) {
			for (int j = 0; j < matrix.m[i].length; j++) {
				if (matrix.m[i][j] == number) sum++;
			}
		}
		return sum;
	}

	public Vetor sumElementsInLineToArray(Matrix2 matrix) {
		Vetor vet = new Vetor(new int[matrix.m.length]);
		for (int i = 0; i < matrix.m.length; i++) {
			for (int j = 0; j < matrix.m[i].length; j++) {
				vet.setV(i, matrix.m[i][j]);
			}
		}
		return vet;
	}
	
	protected List<Point2> getPointsWithNumbers(int number) {
		List<Point2> list = new ArrayList<>();
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				if(m[i][j] == number) list.add(new Point2(i, j));
			}
		}
		return list;
	}
	
	public boolean isMatrixSquare(Matrix2 matrix) {
		for (int i = 0; i < getNumberOflines(); i++) {
			if (matrix.m[i].length != matrix.m.length)
				return false;
		}
		return true;
	}
	
	public int getNumberOfColumns() {
		return this.m.length;
	}
	
	public int getNumberOflines() {
		return this.m.length;
	}
	
	public void setNumber(Point2 point, int number) {
		m[point.getX()][point.getY()] = number;
	}
	
	public int getNumber(Point2 point) {
		return this.m[point.getX()][point.getY()];
	}
	
	public Matrix2 transposeColumnsToLines() {
		Matrix2 auxMatrix = new Matrix2(this.getNumberOflines(), this.getNumberOfColumns());
		for (int i = 0; i < getNumberOflines(); i++) {
			for (int j = 0; j < getNumberOfColumns(); j++) {
				auxMatrix.m[i][j] = this.m[j][i];
			}
		}
		return auxMatrix;
	}

	public Matrix2 cloneMatrix(Matrix2 originalMatrix) {
		Matrix2 clonedMatrix = new Matrix2(originalMatrix.m.length, originalMatrix.m.length);
		for (int i = 0; i < getNumberOflines(); i++) {
			for (int j = 0; j < getNumberOfColumns(); j++) {
				clonedMatrix.m[i][j] = this.m[i][j];
			}
		}
		return clonedMatrix;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Matrix2 other = (Matrix2) obj;
		if (!Arrays.deepEquals(m, other.m))	return false;
		return true;
	}

	@Override
	public String toString() {
		return "Matrix [m=" + Arrays.deepToString(m) + "]";
	}
}


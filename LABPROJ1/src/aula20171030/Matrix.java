package aula20171030;

import java.util.Arrays;

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
	
	private static int[][] copyMatrix(int[][] matrix, int[][] m) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				m[i][j] = matrix[i][j];
			}
		}
		return m;
	}

	public Matrix sum(Matrix a) {	
		Matrix aux = new Matrix(a.m.length, a.m.length);
		for(int i = 0; i < nlines; i++) {
			for(int j = 0; j < ncolumns; j++) {
				aux.m[i][j] = a.m[i][j] + this.m[i][j];
			}
		}
		return aux;
	}
	
	public Matrix multiply(Matrix a) {	
		Matrix result = new Matrix(this.m.length, a.m[0].length);
		for (int i = 0; i < this.m.length; i++) { 
		    for (int j = 0; j < a.m[0].length; j++) { 
		        for (int k = 0; k < this.m[0].length; k++) { 
		            result.m[i][j] += this.m[i][k] * a.m[k][j];
		        }
		    }
		}
		return result;	
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
		return "Matrix [m=" + Arrays.toString(this.m) + ", nlines=" + nlines + ", ncolumns=" + ncolumns + "]";
	}

	
	

	
	

	

}

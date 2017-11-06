package aula20171017;

import aula20171012.VectorWork1;

public class Sudoku {
		
	// Check if 9x9 matrix is a valid Sudoku solution
	public static boolean isSudokuCorrect(int[][] matrix) {
		if (!isMatrixSquare(matrix)) return false;
		if (!areNumbers1To9(matrix)) return false;
		if (!areLinesCorrect(matrix)) return false;
		if (!areColumnsCorrect(matrix)) return false;
		if (!areSubMatrixs3x3Correct(matrix)) return false;
		return true;
	}

	public static boolean isMatrixSquare(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i].length != matrix.length)
				return false;
		}
		return true;
	}

	public static boolean areNumbers1To9(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 1 || matrix[i][j] > 9)	return false;
			}
		}
		return true;
	}

	public static boolean areLinesCorrect(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (VectorWork1.hasDuplicates(matrix[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean areColumnsCorrect(int[][] matrix) {
		int[][] aux = transposeColumnsToLines(matrix);
		for (int i = 0; i < matrix.length; i++) {
			if (VectorWork1.hasDuplicates(aux[i])) return false;
		}
		return true;
	}

	public static int[][] transposeColumnsToLines(int[][] matrix) {
		int[][] aux = new int[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				aux[i][j] = matrix[j][i];
			}
		}
		return aux;
	}

	public static boolean areSubMatrixs3x3Correct(int[][] matrix) {
		for (int i = 0; i < matrix.length; i += 3) {
			for (int j = 0; j < matrix[i].length; j += 3) {
				int[][] aux1 = make3x3SubMatrix(matrix, i, j);
				int[] aux2 = transformSubMatrixToLine(aux1);
				if (VectorWork1.hasDuplicates(aux2)) return false;
			}
		}
		return true;
	}

	public static int[][] make3x3SubMatrix(int[][] matrix, int i, int j) {
		int[][] aux = new int[3][3];
		int indexl = 0;
		for (int k = i; k < i + aux.length; k++, indexl++) {
			for (int l = j, indexc = 0; l < j + aux.length; l++, indexc++) {
				aux[indexl][indexc] = matrix[k][l];
			}
		}
		return aux;
	}

	public static int[] transformSubMatrixToLine(int[][] matrix) {
		int[] aux = new int[matrix.length * 3];
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				aux[i*3+j] = matrix[i][j];
			}
		}
		return aux;
	}
}


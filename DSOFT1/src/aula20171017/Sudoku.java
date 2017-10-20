package aula20171017;

import aula20171012.VectorWork1;

public class Sudoku {
		
	// Check if 9x9 matrix is a valid Sudoku solution
	public static boolean checkSudoku(int[][] arr) {

		if (!isMatrixSquare(arr)) return false;
		if (!areNumbers1To9(arr)) return false;
		if (!areLinesCorrect(arr)) return false;
		if (!areColumnsCorrect(arr)) return false;
		if (!areSubMatrixs3x3Correct(arr)) return false;
		return true;
	}

	public static boolean isMatrixSquare(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i].length != matrix.length)
				return false;
		}
		return true;
	}

	public static boolean areNumbers1To9(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 1 || arr[i][j] > 9)
					return false;
			}
	
		}
		return true;
	}

	public static boolean areLinesCorrect(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (VectorWork1.hasDuplicates(arr[i])) {
				return false;
			}
		}
		return true;
	}

	public static boolean areColumnsCorrect(int[][] arr) {
		int[][] aux = transposeColumnsToLines(arr);
		for (int i = 0; i < arr.length; i++) {
			if (VectorWork1.hasDuplicates(aux[i])) {
				return false;
			}
		}
		return true;
	}

	public static int[][] transposeColumnsToLines(int[][] arr) {
		int[][] aux = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				aux[i][j] = arr[j][i];
			}

		}
		return aux;
	}

	public static boolean areSubMatrixs3x3Correct(int[][] arr) {
		for (int i = 0; i < arr.length; i += 3) {
			for (int j = 0; j < arr[i].length; j += 3) {
				int[][] aux1 = make3x3SubMatrix(arr, i, j);
				int[] aux2 = transformSubMatrixToLine(aux1);
				if (VectorWork1.hasDuplicates(aux2)) return false;
			}
		}
		return true;
	}

	public static int[][] make3x3SubMatrix(int[][] arr, int i, int j) {
		int[][] aux = new int[3][3];
		int indexl = 0;
		//int indexc = 0;
		for (int k = i; k < i + aux.length; k++, indexl++) {
			for (int l = j, indexc = 0; l < j + aux.length; l++, indexc++) {
				aux[indexl][indexc] = arr[k][l];
			}
		}
		return aux;
	}

	public static int[] transformSubMatrixToLine(int[][] arr) {
		int[] aux = new int[arr.length * 3];
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				aux[i*3+j] = arr[i][j];
			}
		}
		return aux;
	}
}


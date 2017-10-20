package aula20171020;

public class CheckIfMatrixTriangular {

	public static boolean isMatrixTriangular(int[][] arr) {

		if (!isMatrixSquare(arr))
			return false;

		if (isLowerPartFilled(arr) == true && isUpperPartFilled(arr) == true)
			return false;
		
		return true;
	}

	private static boolean isUpperPartFilled(int[][] arr) {
		boolean b = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if(arr[i][j] > 0 && arr[i][j-1] != 0) b = true; 
				else {return false;}
			}
		}
		return b;
	}

	private static boolean isLowerPartFilled(int[][] arr) {
		boolean b = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				if(arr[i][j] > 0 && arr[i][j+1] != 0) b = true; 
				else {return false;}
			}
		}
		return b;
	}

	public static boolean isMatrixSquare(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i].length != matrix.length)
				return false;
		}
		return true;
	}
}

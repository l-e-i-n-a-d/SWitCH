package aula20171024;

public class SumElements {

	public static int sumElements(int[][] arr) {
		int sum = 0;
		if (arr.length % 2 != 0 && isMatrixSquare(arr)) {
			sum = arr[0][0] + arr[arr.length - 1][0] + arr[arr.length / 2][arr.length / 2] + arr[0][arr[0].length - 1]
					+ arr[arr.length - 1][arr[0].length - 1];
		}
		return sum;
	}

	public static boolean isMatrixSquare(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i].length != matrix.length)
				return false;
		}
		return true;
	}
}
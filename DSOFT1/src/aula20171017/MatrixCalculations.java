package aula20171017;

public class MatrixCalculations {

	public static int[] Sum(int[][] arr) {

		int[] arrSum = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arrSum[i] += arr[i][j];
			}
		}
		return arrSum;
	}

	// Dada uma matriz e um vector, saber se todos os elementos do vector existem na
	// matriz, independente/ da posição
	public static boolean ExistsInMatrix(int[] arrVector, int[][] arrMatrix) {

		if (arrVector.length == 0) {
			return false;
		}
		boolean b = false;
		outter: for (int i = 0; i < arrMatrix.length; i++) {
			inner: for (int j = 0; j < arrMatrix[i].length; j++) {
				for (int k : arrVector) {
					if (k == arrMatrix[i][j]) {
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

}

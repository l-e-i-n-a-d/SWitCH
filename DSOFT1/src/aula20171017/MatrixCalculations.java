package aula20171017;

public class MatrixCalculations {

	public static int[] sumElementsInLineToArray(int[][] matrix) {

		int[] arrSum = new int[matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				arrSum[i] += matrix[i][j];
			}
		}
		return arrSum;
	}

	// Dada uma matriz e um vector, saber se todos os elementos do vector existem na
	// matriz, independente/ da posição
	public static boolean ExistsInMatrix(int[] vector, int[][] matrix) {

		if (vector.length == 0) {
			return false;
		}
		boolean b = false;
		outter: for (int i = 0; i < matrix.length; i++) {
			inner: for (int j = 0; j < matrix[i].length; j++) {
						for (int k : vector) {
							if (k == matrix[i][j]) {
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

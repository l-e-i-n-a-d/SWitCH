package aula20171024;

public class CountPiecesInChessBoard {

	public static int[] countPieces(char[][] matrix) throws Exception{
		int[] count = new int[3];
		if (!isValidChessBoard(matrix))	throw new Exception();
		count[0] = CharacterCounting.ocurrencies(matrix, 'L');
		count[1] = CharacterCounting.ocurrencies(matrix, 'B');
		count[2] = CharacterCounting.ocurrencies(matrix, 'P');
		return count;
	}

	public static int[] countPiecesAndKings(char[][] matrix) throws Exception{
		int[] count = new int[5];
		if (!isValidChessBoard(matrix))	throw new Exception();
		count[0] = CharacterCounting.ocurrencies(matrix, 'L');
		count[1] = CharacterCounting.ocurrencies(matrix, 'B');
		count[2] = CharacterCounting.ocurrencies(matrix, 'P');
		count[3] = CharacterCounting.ocurrencies(matrix, 'r');
		count[4] = CharacterCounting.ocurrencies(matrix, 'R');
		return count;
	}

	private static boolean isValidChessBoard(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] != 'L' && matrix[i][j] != 'B' && matrix[i][j] != 'P'&& matrix[i][j] != 'r' && matrix[i][j] != 'R')
					return false;
			}
		}
		return true;
	}
}

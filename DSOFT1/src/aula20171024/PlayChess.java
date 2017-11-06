package aula20171024;

import java.util.*;

public class PlayChess {
	
	// TODO: create enum with constant string names for each of the char letters

	public static char[][] makeBoardAfterPlay(char[][] matrix, char pieceAndColor, int[] initialPos, int[] finalPos) {
		char[][] matrixAfterMove = matrix;
		if (isValidPlay(matrix, pieceAndColor, initialPos, finalPos)) {
			matrixAfterMove[finalPos[0]][finalPos[1]] = pieceAndColor;
			matrixAfterMove[initialPos[0]][initialPos[1]] = 'L';
		}
		return matrixAfterMove;
	}

	public static boolean isValidPlay(char[][] matrix, char pieceAndColor, int[] initialPos, int[] finalPos) {
		if (!isValidBoard(matrix)) return false;
		if (!isValidPosition(initialPos)) return false;
		if (!isValidPosition(finalPos))	return false;
		if (!areDiferentPositions(initialPos, finalPos)) return false;
		if (!isPossibleToPlayToFinalPosition(matrix, finalPos, pieceAndColor))	return false;
		if (!isMoveValid(matrix, pieceAndColor, initialPos, finalPos)) return false;
		return true;
	} 

	public static boolean isValidBoard(char[][] matrix) {
		if(!isBoardDimensionsEightByEight(matrix)) return false;
		if(!areLettersInMatrixValid(matrix)) return false;
		return true;
	}
	
	public static boolean areLettersInMatrixValid(char[][] matrix) {
		List<Character> list = createListOfValidPieces();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (!list.contains(matrix[i][j])) return false;
			}
		}
		return true;
	}

	public static List<Character> createListOfValidPieces() {
		char[] validPieces = new char[] { 'P', 'p', 'T', 't', 'B', 'b', 'C', 'c', 'R', 'r', 'Q', 'q', 'L' };
		List<Character> list = new ArrayList<>();
		for (char c : validPieces) {
			list.add(c);
		}
		return list;		
	}

	public static boolean isBoardDimensionsEightByEight(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix.length != 8 || matrix[i].length != 8)
				return false;
		}
		return true;		
	}

	public static boolean isValidPosition(int[] position) {
		if ((position[0] < 8 && position[0] >= 0) && (position[1] < 8 && position[1] >= 0))	return true;
		return false;
	}

	public static boolean areDiferentPositions(int[] initialPos, int[] finalPos) {
		if(initialPos[0] == finalPos[0] && initialPos[1] == finalPos[1]) return false;
		return true;
	}

	public static boolean isPossibleToPlayToFinalPosition(char[][] matrix, int[] finalPos, char pieceAndColor) {
		if(arePiecesOfDiferentColor(matrix, finalPos, pieceAndColor) || matrix[finalPos[0]][finalPos[1]] != 'L') return true; 
		return false;
	}

	public static boolean arePiecesOfDiferentColor(char[][] matrix, int[] finalPos, char pieceAndColor) {
		char pieceAtFinalPosition = matrix[finalPos[0]][finalPos[1]];
		if(isWhite(pieceAtFinalPosition) == isWhite(pieceAndColor)) return false;
		return true;
	}

	public static boolean isWhite(char c) {
		char[] whitePieces = new char[] { 'P', 'T', 'B', 'C', 'R', 'Q'};
		List<Character> list = new ArrayList<>();
		for (char character : whitePieces) {
			list.add(character);
		}
		if (list.contains(c)) return true;
		return false;
	}

	public static boolean isMoveValid(char[][] matrix, char pieceAndColor, int[] initialPos, int[] finalPos) {
		if(pieceAndColor == 'T' || pieceAndColor == 't') return isRookMoveValid(matrix, pieceAndColor, initialPos, finalPos);
		else if(pieceAndColor == 'B' || pieceAndColor == 'b') return isBishopMoveValid(matrix, pieceAndColor, initialPos, finalPos);

		return false;
	}

	private static boolean isBishopMoveValid(char[][] matrix, char pieceAndColor, int[] initialPos, int[] finalPos) {
		boolean isDiagonalIncreasingMovement = (finalPos[0] - initialPos[0]) == -(finalPos[1] - initialPos[1]);
		boolean isDiagonalDecreasingMovement = (finalPos[0] - initialPos[0]) == (finalPos[1] - initialPos[1]);	
		
		if (isDiagonalIncreasingMovement) {
			if (isUpDiagonalPathFree(matrix, initialPos, finalPos)) return true;
		}
		if (isDiagonalDecreasingMovement) {
			if (isDownDiagonalPathFree(matrix, initialPos, finalPos)) return true;
		}
		return false;
	}

	private static boolean isUpDiagonalPathFree(char[][] matrix, int[] initialPos, int[] finalPos) {
		

		return true;
	}
	private static boolean isDownDiagonalPathFree(char[][] matrix, int[] initialPos, int[] finalPos) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean isRookMoveValid(char[][] matrix, char pieceAndColor, int[] initialPos, int[] finalPos) {
		boolean isHorizontalMovement = (finalPos[1] - initialPos[1] != 0) && (finalPos[0] - initialPos[0] == 0);
		boolean isVerticalMovement = (finalPos[1] - initialPos[1] == 0) && (finalPos[0] - initialPos[0] != 0);

		if (isVerticalMovement) {
			if (isVerticalPathFree(matrix, initialPos, finalPos)) return true;
		}
		if (isHorizontalMovement) {
			if (isHorizontalPathFree(matrix, initialPos, finalPos))	return true;
		}
		return false;
	}
	
	public static boolean isVerticalPathFree(char[][] matrix, int[] initialPos, int[] finalPos) {
		int numberOfVerticalMoves = finalPos[0] - initialPos[0];
		int numberOfPositionsInPath = Math.abs(numberOfVerticalMoves);
		int verticalDirection = numberOfVerticalMoves / numberOfPositionsInPath;
		
		for (int moveNumber = 1; moveNumber < numberOfPositionsInPath; moveNumber++) {
			if (matrix[initialPos[0] + moveNumber * verticalDirection][initialPos[1]] != 'L') return false;
		}
		return true;
	}

	public static boolean isHorizontalPathFree(char[][] matrix, int[] initialPos, int[] finalPos) {
		int numberOfHorizontalMoves = finalPos[1] - initialPos[1];
		int numberOfPositionsInPath = Math.abs(numberOfHorizontalMoves);
		int horizontalDirection = numberOfHorizontalMoves / numberOfPositionsInPath;

		for (int moveNumber = 1; moveNumber < numberOfPositionsInPath; moveNumber++) {
			if (matrix[initialPos[0]][initialPos[1] + moveNumber * horizontalDirection] != 'L') return false;
		}
		return true;
		

	}
}
	

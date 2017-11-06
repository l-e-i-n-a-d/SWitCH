package aula20171024;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountPiecesInChessBoardTests {

	@Test
	public void testCountPiecesSucess1() throws Exception {
		char[][] arr1 = {{'L', 'L', 'L', 'B', 'P'},
				         {'L', 'L', 'L', 'B', 'P'},
				         {'L', 'L', 'L', 'B', 'P'},
				         {'L', 'L', 'L', 'B', 'P'},
				         {'L', 'L', 'L', 'B', 'P'}};
		
		int[] expected = {15, 5, 5}; //{L, B, P}

		assertArrayEquals(expected, CountPiecesInChessBoard.countPieces(arr1));
	}
	
	@Test
	public void testCountPiecesSucess2() throws Exception {
		char[][] arr1 = {{'L', 'L', 'L', 'B', 'P'},
				         {'L', 'L', 'L', 'B', 'P'},
				         {'L', 'L', 'L', 'a', 'P'},
				         {'L', 'L', 'L', 'B', 'P'},
				         {'L', 'L', 'L', 'B', 'P'}};
		
		int[] expected = {15, 4, 5}; //{L, B, P}

		assertArrayEquals(expected, CountPiecesInChessBoard.countPieces(arr1));
	}
	
	@Test
	public void testCountPiecesAndKingsSucess1() throws Exception {
		char[][] arr1 = {{'L', 'L', 'L', 'B', 'P'},
				         {'L', 'L', 'L', 'B', 'P'},
				         {'L', 'r', 'L', 'B', 'P'},
				         {'L', 'R', 'L', 'B', 'P'},
				         {'L', 'L', 'L', 'B', 'P'}};
		
		int[] expected = {13, 5, 5, 1, 1}; //{L, B, P, r, R}

		assertArrayEquals(expected, CountPiecesInChessBoard.countPiecesAndKings(arr1));
	}

	@Test(expected = Exception.class)
	public void testCountPiecesInvalidMatrix() throws Exception {
		char[][] matrix = {{'L', 'd', 'j', 'B', 'P'},
				           {'L', 'L', 'L', 'B', 'P'},
				           {'L', 'L', 'L', 'a', 'P'},
				           {'L', 'L', 'L', 'B', 'P'},
				           {'L', 'L', 'L', 'B', 'P'}};
		CountPiecesInChessBoard.countPieces(matrix);
	}
}

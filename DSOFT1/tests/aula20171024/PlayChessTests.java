package aula20171024;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayChessTests {

	@Test
	public void testIsValidPlaySucess() {
		char[][] matrix = {{'B', 'L', 'L', 'B', 'P', 'P', 'P', 'T'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},				         
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'b', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'T', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'}};
		int[] initialPosition = new int[] {2,0};
		int[] finalPosition = new int[] {2,2};
		assertTrue(PlayChess.isValidPlay(matrix, 'T', initialPosition, finalPosition));
	}
	
	@Test
	public void testisValidBoard1() {
		char[][] matrix = {{'T', 'L', 'L', 'B', 'P', 'P', 'P', 'T'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},				         
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'b', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'}};
		
		assertTrue(PlayChess.isValidBoard(matrix));
	}
	
	@Test
	public void testisValidBoard2() {
		char[][] matrix = {{'T', 'L', 'L', 'B', 'P', 'P', 'P', 'T'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'j', 'L', 'B', 'P', 'P', 'P', 'P'},	//this line has a 'j'			         
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'b', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'}};
		
		assertFalse(PlayChess.isValidBoard(matrix));
	}
	
	@Test
	public void testisValidPosition1() {
		int[] position = new int[] {0,0};
		assertTrue(PlayChess.isValidPosition(position));
	}
	
	@Test
	public void testisValidPosition2() {
		int[] position = new int[] {0,8};
		assertFalse(PlayChess.isValidPosition(position));
	}

	@Test
	public void testMakeBoardAfterPlay() {
		char[][] matrix = {{'L', 'L', 'L', 'B', 'P', 'P', 'P', 'T'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},				         
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'T', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'}};
		
		char piece = 'T';
		int[] initialPosition = new int[] {0,0};
		int[] finalPosition = new int[] {5,0};
		
		assertArrayEquals(matrix, PlayChess.makeBoardAfterPlay(matrix, piece, initialPosition, finalPosition));		
	}

//==========isWhite(...) tests================
	@Test
	public void testIsWhiteSucess1() {
		char piece = 'T';
		assertTrue(PlayChess.isWhite(piece));	
		piece = 'C';
		assertTrue(PlayChess.isWhite(piece));	
	}
	
	@Test
	public void testIsWhiteSucess2() {
		char piece = 'b';
		assertFalse(PlayChess.isWhite(piece));	
	}

//==========arePiecesOfDiferentColor(...) tests================
	@Test
	public void testArePiecesOfDiferentColorSucess() {
		char[][] matrix = {{'T', 'L', 'L', 'B', 'P', 'P', 'P', 'T'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},				         
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'b', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'},
						   {'L', 'L', 'L', 'B', 'P', 'P', 'P', 'P'}};
		char piece = 'T';
		int[] finalPos = new int[]{5,0};
		assertTrue(PlayChess.arePiecesOfDiferentColor(matrix, finalPos, piece));	
	}
}

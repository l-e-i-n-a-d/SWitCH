package aula20171027;

import java.util.Arrays;

/**
 * TODO: Documentation
 */
public class MoveAndPaintInMatrix {
	
	static int linePosition = 0;
	static int columnPosition = 0;
	static String direction = "RIGHT";

	public static void main(String[] args) {
		char[] steps = { 'F', 'P', 'F', 'F', 'R', 'F', 'P' };
		char[][] matrix = { { 'W', 'W', 'W', 'W', 'W', 'W' }, { 'W', 'W', 'W', 'W', 'W', 'W' },
				{ 'W', 'W', 'W', 'W', 'W', 'W' }, { 'W', 'W', 'W', 'W', 'W', 'W' }, { 'W', 'W', 'W', 'W', 'W', 'W' },
				{ 'W', 'W', 'W', 'W', 'W', 'W' } };
		drawMatrix(steps, matrix);
		printMatrix(matrix);
	}

	public static char[][] drawMatrix(char[] steps, char[][] matrix) {	
		if(!isValidMatrix(matrix)) {
			System.out.println("Not a valid matrix...returning an empty matrix");
			return new char[][] {{}};
		}
		for (char character : steps) {
			switch (character) {
				case 'F': moveForward(direction); break;
				case 'R': rotate();	break;
				case 'P': paintCell(matrix); break;
			}
		}
		return matrix;
	}

	public static boolean isValidMatrix(char[][] matrix) {
		if (matrix.length < 1) return false;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[0].length == 0) return false;
		}
		return true;
	}

	public static void paintCell(char[][] matrix) {
		if(matrix[linePosition][columnPosition] != 'P') { 
			matrix[linePosition][columnPosition] = 'P';}
	}

	public static void rotate() {
		switch (direction) {
			case "RIGHT": direction = "DOWN"; break;
			case "DOWN": direction = "LEFT"; break;
			case "LEFT": direction = "UP"; break;
			case "UP": direction = "RIGHT"; 
		}	
	}

	public static void moveForward(String direction) {
		switch (direction) {
			case "RIGHT": columnPosition++; break;
			case "DOWN": linePosition++; break;
			case "LEFT": linePosition--; break;
			case "UP": columnPosition--; 
		}
	}

	public static void printMatrix(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

}

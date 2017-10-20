package aula20171016;

public class Matrix {
	public static boolean isSymetric1(int[][] arr) {
		boolean b = true;
		if (arr.length != arr[0].length)
			return false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != arr[j][i]) {
					b = false;
				}
			}
		}
		return b;
	}
	
	public static boolean isSymetric2(int[][] arr) {
		boolean b = true;
		
		return b;
	}
}

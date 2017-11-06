package aula20171023;

public class ChangePointWithNineNeighborsMean {
	public static int[][] changePoints(int[][] arr) {

		int[][] aux = makeBorder(arr);
		
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr[i].length - 1; j++) {
//				int sum = arr[i][j - 1] + arr[i - 1][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i-1][j-1] + arr[][];
//				aux[i][j] = mean(sum);
			}
		}

		return aux;
	}

	public static int mean(int sum) {
		int result = 0;
		try {
			result = (int)Math.round(((double)sum) / 4);
		} catch (Exception e) {
			System.out.println("Illegal operation");
		}

		return result;
	}

	public static int[][] makeBorder(int[][] arr) {
		int[][] aux = new int [arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i = i + arr.length - 1) {
			for (int j = 0; j < arr[0].length; j++) {
				aux[i][j] = arr[i][j];
			}
		}
		for (int j = 0; j < arr[0].length; j = j + arr[0].length - 1) {
			for (int i = 1; i < arr.length-1; i++) {
				aux[i][j] = arr[i][j];
			}
		}
		
		return aux;
	
	}
}

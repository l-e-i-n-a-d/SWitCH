package aula20171013;

public class VectorCalculator {

	public static double mean(int[] arr) {
		double sum = 0.0;
		for (int i : arr) {
			sum += i;
		}
		return sum / arr.length;
	}

	public static double standardDeviation(int[] arr) {
		double m = mean(arr);
		double sum = 0;
		for (int i : arr) {
			sum += Math.pow((i - m), 2);
		}
		return Math.sqrt(sum / (arr.length - 1));
	}

	public static int[] reverseOrder(int[] arr) {
		int[] aux = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			aux[(arr.length - 1) - i] = arr[i];
		}
		return aux;
	}

	public static int[] bubbleSort(int[] arr) {
		int aux = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					aux = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = aux;
				}

			}
		}
		return arr;
	}
}
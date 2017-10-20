package aula20171016;

public class Vectors {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3, 4 };
		System.out.println(isEqual(arr1, arr2));
		int[] arr3 = { 1, 2, 3, 4, 5 };
		int[] arr4 = { 1, 2, 3, 4 };
		System.out.println(isEqual(arr3, arr4));
		int[] arr5 = { 1, 2, 3, 6 };
		int[] arr6 = { 1, 2, 3, 4 };
		System.out.println(isEqual(arr5, arr6));
	}

	public static boolean isEqual(int[] arr1, int[] arr2) {

		boolean b = true;
		if (arr1.length != arr2.length) {
			b = false;
		} else {
			for (int i = 0; (i < arr1.length) && b; i++) {
				if (arr1[i] != arr2[i]) {
					b = false;
				}
			}
		}
		return b;
	}

	public static boolean isSymetrical(int[] arr) {

		boolean b = true;
		for (int i = 0, j = arr.length; i < arr.length / 2; i++, j--) {
			b = arr[i] == arr[j];
		}
		return b;
	}

	public static int findFirstIndex(int[] arr, int j) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == j) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int findLastIndex(int[] arr, int j) {
		int index = -1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == j) {
				index = i;
				break;
			}
		}
		return index;
	}

	
}

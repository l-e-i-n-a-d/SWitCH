package aula20171011;

public class SumTwoArrays {

	public static int[] sum(int[] a, int[] b) {

		int[] result = new int[Math.max(a.length, b.length)];

		for (int i = 0; i < result.length; i++) {
			result[i] = a[i] + b[i];
		}

		return result;
	}
}

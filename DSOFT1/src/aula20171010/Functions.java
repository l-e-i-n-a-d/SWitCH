package aula20171010;

public class Functions {

	public static int fatorial(int num) throws Exception {

		if (num < 0)
			throw new Exception();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public static int biggest(int a, int b) {
		if (a < b) {
			return b;
		} else {
			return a;
		}
	}

	public static int biggest(int a, int b, int c) {
		return biggest(a, biggest(b, c));
	}

	public static int biggest(int a, int b, int c, int d) {
		return biggest(biggest(a, b), biggest(c, d));
	}

	public static int biggest(int[] nums) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > result)
				result = nums[i];
		}
		return result;
	}
}

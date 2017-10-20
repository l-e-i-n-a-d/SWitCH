package aula20171011;

public class ArrayMean {

	public static double mean(double[] arr) {
		double sum = 0;
		double result = 0;
		for (double i : arr) {
			sum += i;
		}
		try {
			result = sum / arr.length;
		} catch (Exception e) {
			System.out.println("Illegal operation");
		}

		return result;
	}
}

package aula20171011;

public class ArraysSum {
	
	public static int sum(int[] array) {
		int sum = 0;
		for(int i: array) {
			sum += i;
		}
		return sum;
	}
}

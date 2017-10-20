package aula20171020;

public class CheckIfPrimeNumber {

	public static boolean isPrimeNumber(int i) {
		
		if (i < 1) return false;
		
		for (int j = i--; j > 1; j--) {
			if (i % j == 0)	return false;
		}
		return true;
		}
	}

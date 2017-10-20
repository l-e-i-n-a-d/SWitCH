package aula20171020;

public class CalculateSumOfDigits {
	
	public static int sumDigits(int i) {
		
		int sum = 0;
		if(i < 0) i = Math.abs(i);
		
		String str = String.valueOf(i);
		char[] digits = str.toCharArray();
		for(char c: digits) {
			sum += Character.getNumericValue(c);
		}
		return sum;
	}
}

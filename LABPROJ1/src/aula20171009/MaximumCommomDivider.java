package aula20171009;

public class MaximumCommomDivider {

	public static void main(String[] args) {
		System.out.println(mCd(100, 250));
	}

	public static int mCd(int a, int b) {
		int maxDiv = a;
		while (a % maxDiv != 0 || b % maxDiv != 0) {
			maxDiv--;
		}
		return maxDiv;
	}

}

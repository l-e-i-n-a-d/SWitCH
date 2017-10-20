package algoritmia;

import java.util.ArrayList;

/*II. Para cada uma das al�neas seguintes elabore uma fun��o que retorne:
a)	a soma de todos os n�meros pares: long somaPares(int inf, int sup)
b)	a some de todos os m�ltiplos de �num�: long somaMult(int num, int inf, int sup)*/

public class Sum {
	public static long somaPares(int inf, int sup) {
		long sum = 0;
		for (int i = inf; i <= sup; i++) {
			if (i == 0)
				continue;
			if (i % 2 == 0)
				sum += i;
		}
		return sum;
	}

	public static long somaMult(int num, int inf, int sup) {

		long sum = 0;

		ArrayList<Integer> resultList = Multiples.multipleNum(inf, sup, num);

		for (Integer i : resultList) {
			sum += i;
		}
		return sum;
	}
}

package aula20171012;

import java.util.ArrayList;
import java.util.Collections;

/*II. Sabendo que o operador % do Java dá o resto da divisão entre dois inteiros pretende-se que elabore um programa, 
 * com funções, que dado um vector:
a) retorne todos os múltiplos de 3
b) retorne todos os múltiplos de um dado número inteiro
c) retorne todos os múltiplos de 3 e 5
d) retorne todos os múltiplos de dois números inteiros
e) retorne todos os múltiplos de dois números inteiros num intervalo dado, mas por ordem decrescente*/

public class VectorWork2 {

	static ArrayList<Integer> list = new ArrayList<>();

	public static ArrayList<Integer> multiplesOf3(int[] arr) {
		list.clear();
		for (int i : arr) {
			if (i % 3 == 0) {
				list.add(i);
			}
		}
		return list;
	}

	public static ArrayList<Integer> multiplesOfInt(int[] arr, int n) {
		list.clear();
		for (int i : arr) {
			if (i % n == 0) {
				list.add(i);
			}
		}
		return list;
	}

	public static ArrayList<Integer> multiplesOf3And5(int[] arr) {
		list.clear();
		for (int i : arr) {
			if (i % 3 == 0 || i % 5 == 0) {
				list.add(i);
			}
		}
		return list;
	}

	public static ArrayList<Integer> multiplesOfTwoInts(int[] arr, int a, int b) {
		list.clear();
		for (int i : arr) {
			if (i % a == 0 || i % b == 0) {
				list.add(i);
			}
		}
		return list;
	}

	public static ArrayList<Integer> multiplesOfTwoIntsInInterval(int[] arr, int a, int b, int inf, int sup) {
		list.clear();
		for (int i : arr) {
			if (i % a == 0 || i % b == 0) {
				list.add(i);
			}
		}
		for (int j = 0; j < list.size(); j++) {
			if (j < inf || j < sup) {
				list.remove(j);
			}
		}
		Collections.sort(list);
		Collections.reverse(list);
		return list;
	}
}

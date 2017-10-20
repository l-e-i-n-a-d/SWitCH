package algoritmia;

import java.util.ArrayList;
import java.util.Collections;

/* I. Sabendo que o operador % do Java dá o resto da divisão entre dois inteiros pretende-se que elabore um programa que:
a)	liste todos os múltiplos de 3 num intervalo dado
b)	liste todos os múltiplos de um dado número inteiro num intervalo dado
c)	liste todos os múltiplos de 3 e 5 num intervalo dado
d)	liste todos os múltiplos de dois números inteiros num intervalo dado
e)	liste todos os múltiplos de dois números inteiros num intervalo dado, mas por ordem decrescente */

public class Multiples {
	
	public Multiples() {};

	public static ArrayList<Integer> multiple3(int min, int max) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = min; i <= max; i++) {
			if (i == 0)
				continue;
			if (i % 3 == 0) {
				result.add(i);
			}
		}
		return result;
	}

	public static ArrayList<Integer> multipleNum(int min, int max, int num) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = min; i <= max; i++) {
			if (i == 0)
				continue;
			if (i % num == 0) {
				result.add(i);
			}
		}
		return result;
	}
	public static ArrayList<Integer> multiple3Or5(int min, int max) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = min; i <= max; i++) {
			if (i == 0)
				continue;
			if (i % 3 == 0 || i % 5 == 0) {
				result.add(i);
			}
		}
		return result;
	}
	public static ArrayList<Integer> multipleNum1OrNum2(int min, int max, int num1, int num2) {
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = min; i <= max; i++) {
			if (i == 0)
				continue;
			if (i % num1 == 0 || i % num2 == 0) {
				result.add(i);
			}
		}
		return result;
	}
	public static ArrayList<Integer> multipleNum1OrNum2Desc(int min, int max, int num1, int num2) {
		ArrayList<Integer> result = new ArrayList<>();
		result = multipleNum1OrNum2(min, max, num1, num2);
		Collections.reverse(result);
		return result;
	}
}

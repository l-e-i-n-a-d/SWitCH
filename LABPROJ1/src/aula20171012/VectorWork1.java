package aula20171012;

import java.util.HashSet;
import java.util.Set;

/*I. Dado um vector de números pretende-se que elabore uma função que retorne:
a) o número de elementos num vector
b) o maior elemento de um vector
c) o menor elemento de um vector
d) o somatório de todos os números
e) o somatório de todos os números pares
f) o somatório de todos os múltiplos de um número
g) True caso o vector esteja vazio, False em caso contrário
h) True caso o vector contenha apenas um elemento, False em caso contrário
i) True se o vector tiver apenas elementos inteiros, False em caso contrário
j) True se o vector tiver elementos duplicados, False em caso contrário*/

public class VectorWork1 {

	public static int numberElements(int[] arr) {
		return arr.length;
	}

	public static int biggestNumber(int[] arr) {
		int n = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i - 1])
				n = arr[i];
			else {
				n = arr[i - 1];
			}
		}
		return n;
	}

	public static int shorttestNumber(int[] arr) {
		int n = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1])
				n = arr[i];
			else {
				n = arr[i - 1];
			}
		}
		return n;
	}

	public static int sumElements(int[] arr) {
		int n = 0;
		for (int i : arr) {
			n += i;
		}
		return n;
	}

	public static int sumPairElements(int[] arr) {
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				n += arr[i];
			}
		}
		return n;
	}

	public static int sumMultiples(int[] arr, int a) {
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % a == 0) {
				n += arr[i];
			}
		}
		return n;
	}

	public static boolean isEmpty(int[] arr) {
		boolean b = false;
		if (arr.length == 0)
			b = true;
		return b;
	}

	public static boolean hasOneElement(int[] arr) {
		boolean b = false;
		if (arr.length == 1)
			b = true;
		return b;
	}

	public static boolean hasOnlyIntegers(double[] arr) throws Exception {
		int a = 0;
		boolean b = true;
		int i = 0;
		if (arr.length == 0)
			throw new Exception();
		while (b == true && i < arr.length) {
			a = (int) arr[i];
			if (a != arr[i])
				b = false;
			else {
				b = true;
			}
			i++;
		}
		return b;
	}

	public static boolean hasDuplicates(int[] arr) {
		Set<Integer> list = new HashSet<>();
		for (int i : arr) {
			list.add(i);
		}
		if (arr.length != list.size())
			return true;
		return false;
	}
}

package aula20171006;

import java.util.ArrayList;
import java.util.Scanner;

/*Criar uma fun��o que devolva o n�mero de Fibonnaci de ordem n*/

public class Fibonnaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor introduza o n�mero para calcular o n�mero de Fibonnaci: ");
		System.out.println(calculateFibonnaci(sc.nextInt()));
		sc.close();
	}
	public static long calculateFibonnaci(long n) {
		ArrayList<Long> arr = new ArrayList<>();
		arr.add(1L);
		arr.add(1L);
		arr.add(2L);
		for(int i = 2; i < (n-1) ; i++) {
			arr.add(arr.get(i) + arr.get(i-1));
		}
		long result = arr.get(arr.size()-1);
		System.out.println(arr);

		return result;
	}
}


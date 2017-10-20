package aula20171006;

import java.util.Scanner;

/* Criar uma função que devolva o factorial de um número */

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor introduza o número para calcular o factorial: ");
		System.out.println(factorial(sc.nextInt()));
		sc.close();
	}

	public static long factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}

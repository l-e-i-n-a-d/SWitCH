package algoritmia;

import java.util.Scanner;

public class CalculatorSum {
	
	static int min;
	static int max;
	static int num1;
	static long result;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Soma de números pares num intervalo - Introduza o limite inferior do intervalo: ");
		min = sc.nextInt();
		
		System.out.println("Soma de números pares num intervalo - Introduza o limite superior do intervalo: ");
		max = sc.nextInt();
		
		result = Sum.somaPares(min, max);
		
		System.out.println("A soma dos números pares no intervalo de " + min + " e " + max + " é de: " + result);
	
	// ---------------------------------------------------------------------------------------------
		
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("Soma dos múltiplos de número dado - Introduza o limite inferior do intervalo: ");
			min = sc.nextInt();

			System.out.println("Soma dos múltiplos de número dado - Introduza o limite superior do intervalo: ");
			max = sc.nextInt();

			System.out.println("Soma dos múltiplos de número dado - Introduza o número inteiro para achar múltiplos: ");
			num1 = sc.nextInt();

			result = Sum.somaMult(num1, min, max);
			System.out.println("A soma dos mútiplos de " + num1 + " no intervalo de " + min + " a " + max + " é: " + result);
			
			sc.close();
	}
}

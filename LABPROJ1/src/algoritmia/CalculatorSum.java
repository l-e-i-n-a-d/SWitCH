package algoritmia;

import java.util.Scanner;

public class CalculatorSum {
	
	static int min;
	static int max;
	static int num1;
	static long result;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Soma de n�meros pares num intervalo - Introduza o limite inferior do intervalo: ");
		min = sc.nextInt();
		
		System.out.println("Soma de n�meros pares num intervalo - Introduza o limite superior do intervalo: ");
		max = sc.nextInt();
		
		result = Sum.somaPares(min, max);
		
		System.out.println("A soma dos n�meros pares no intervalo de " + min + " e " + max + " � de: " + result);
	
	// ---------------------------------------------------------------------------------------------
		
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println("Soma dos m�ltiplos de n�mero dado - Introduza o limite inferior do intervalo: ");
			min = sc.nextInt();

			System.out.println("Soma dos m�ltiplos de n�mero dado - Introduza o limite superior do intervalo: ");
			max = sc.nextInt();

			System.out.println("Soma dos m�ltiplos de n�mero dado - Introduza o n�mero inteiro para achar m�ltiplos: ");
			num1 = sc.nextInt();

			result = Sum.somaMult(num1, min, max);
			System.out.println("A soma dos m�tiplos de " + num1 + " no intervalo de " + min + " a " + max + " �: " + result);
			
			sc.close();
	}
}

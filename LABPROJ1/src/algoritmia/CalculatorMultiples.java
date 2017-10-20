package algoritmia;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorMultiples {

	static int min;
	static int max;
	static int num1;
	static int num2;

	static ArrayList<Integer> result;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Múltiplos de 3 - Introduza o limite inferior do intervalo: ");
		min = sc.nextInt();

		System.out.println("Múltiplos de 3 - Introduza o limite superior do intervalo: ");
		max = sc.nextInt();

		result = Multiples.multiple3(min, max);

		// TODO: use printf instead of println
		System.out.println("Os mútiplos de 3 no intervalo de " + min + " a " + max + " são: " + result);

		// ---------------------------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Múltiplos de número dado - Introduza o limite inferior do intervalo: ");
		min = sc.nextInt();

		System.out.println("Múltiplos de número dado - Introduza o limite superior do intervalo: ");
		max = sc.nextInt();

		System.out.println("Múltiplos de número dado - Introduza o número inteiro para achar múltiplos: ");
		num1 = sc.nextInt();

		result = Multiples.multipleNum(min, max, num1);
		System.out.println("Os mútiplos de " + num1 + " no intervalo de " + min + " a " + max + " são: " + result);

		// ---------------------------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Múltiplos de 3 e 5 - Introduza o limite inferior do intervalo: ");
		min = sc.nextInt();

		System.out.println("Múltiplos de 3 e 5 - Introduza o limite superior do intervalo: ");
		max = sc.nextInt();

		result = Multiples.multiple3Or5(min, max);

		System.out.println("Os mútiplos de 3 e 5 no intervalo de " + min + " a " + max + " são: " + result);

		// ---------------------------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Múltiplos de dois números dados - Introduza o limite inferior do intervalo: ");
		min = sc.nextInt();

		System.out.println("Múltiplos de dois números dados - Introduza o limite superior do intervalo: ");
		max = sc.nextInt();

		System.out.println("Múltiplos de dois números dados - Introduza o 1º número inteiro para achar múltiplos: ");
		num1 = sc.nextInt();

		System.out.println("Múltiplos de dois números dados - Introduza o 2º número inteiro para achar múltiplos: ");
		num2 = sc.nextInt();

		result = Multiples.multipleNum1OrNum2(min, max, num1, num2);
		System.out.println(
				"Os mútiplos de " + num1 + " e " + num2 + " no intervalo de " + min + " a " + max + " são: " + result);

		// ---------------------------------------------------------------------------------------------
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(
				"Múltiplos de dois números dados por ordem decrescente - Introduza o limite inferior do intervalo: ");
		min = sc.nextInt();

		System.out.println(
				"Múltiplos de dois números dados por ordem decrescente - Introduza o limite superior do intervalo: ");
		max = sc.nextInt();

		System.out.println(
				"Múltiplos de número dado por ordem decrescente - Introduza o 1º número inteiro para achar múltiplos: ");
		num1 = sc.nextInt();

		System.out.println(
				"Múltiplos de número dado por ordem decrescente - Introduza o 2º número inteiro para achar múltiplos: ");
		num2 = sc.nextInt();

		result = Multiples.multipleNum1OrNum2Desc(min, max, num1, num2);
		System.out.println("Os mútiplos de " + num1 + " e " + num2 + " no intervalo de " + min + " a " + max
				+ " por ordem decrescente são: " + result);
		
		sc.close();
	}

}

package aula20171006;

import java.util.Scanner;

/*Criar uma fun��o que verifica se um dado n�mero inteiro � im pal�ndromo (capicua) */

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor introduza o n�mero para verificar se � um pal�ndrome: ");
		System.out.println(isPalindrome(sc.nextLong()));
		sc.close();
	}

	public static boolean isPalindrome(Long num) {
		String str = new String();
		str = Long.toString(num);
		boolean b = false;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) == str.charAt(str.length() - 1 - i))
				b = true;
			else {
				b = false;
				break;
			}
		}
		return b;
	}

}

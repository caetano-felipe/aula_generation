package LacoCondicional;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/* Faça um programa em que permita a entrada de um número qualquer e exiba se este
		 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		 * ímpar exiba o número elevado ao quadrado.
		 */

		Scanner read = new Scanner(System.in);
		int number;
		double squareRoot, exponentiation;
		
		System.out.printf("Digite um número: ");
		number = read.nextInt();
		
		if(number % 2 == 0) {
			squareRoot = Math.sqrt(number);
			System.out.printf("O número %d é Par, e sua raiz quadrada é: %.2f", number, squareRoot);
		} else {
			exponentiation = Math.pow(number, 2);
			System.out.printf("O número %d é Ímpar, e sua potência é: %.2f", number, exponentiation);
		}
	}

}

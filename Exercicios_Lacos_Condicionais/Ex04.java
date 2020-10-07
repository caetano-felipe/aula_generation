package LacoCondicional;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		 * �mpar exiba o n�mero elevado ao quadrado.
		 */

		Scanner read = new Scanner(System.in);
		int number;
		double squareRoot, exponentiation;
		
		System.out.printf("Digite um n�mero: ");
		number = read.nextInt();
		
		if(number % 2 == 0) {
			squareRoot = Math.sqrt(number);
			System.out.printf("O n�mero %d � Par, e sua raiz quadrada �: %.2f", number, squareRoot);
		} else {
			exponentiation = Math.pow(number, 2);
			System.out.printf("O n�mero %d � �mpar, e sua pot�ncia �: %.2f", number, exponentiation);
		}
	}

}

package LacosDeRpeticao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/* Crie um programa que leia um n�mero do teclado at� que encontre um
		 * n�mero igual a zero. No final, mostre a soma dos n�meros digitados.
		 */

		Scanner input = new Scanner(System.in);
		int number, sum = 0;
		
		System.out.printf("Digite um n�mero: ");
		number = input.nextInt();
		
		do {
			sum += number;
			System.out.printf("Digite um n�mero: ");
			number = input.nextInt();
		} while(number != 0);
		
		System.out.printf("A soma dos n�meros �: %d", sum);
	}

}

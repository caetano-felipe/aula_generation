package LacosDeRpeticao;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/* Crie um programa que leia um número do teclado até que encontre um
		 * número igual a zero. No final, mostre a soma dos números digitados.
		 */

		Scanner input = new Scanner(System.in);
		int number, sum = 0;
		
		System.out.printf("Digite um número: ");
		number = input.nextInt();
		
		do {
			sum += number;
			System.out.printf("Digite um número: ");
			number = input.nextInt();
		} while(number != 0);
		
		System.out.printf("A soma dos números é: %d", sum);
	}

}

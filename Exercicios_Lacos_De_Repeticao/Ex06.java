package LacosDeRpeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/* Escrever um programa que receba vários números inteiros no teclado. E no
		 * final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
		 */

		Scanner input = new Scanner(System.in);
		int number, sum = 0, count = 0;
		double average;
		
		do {
			System.out.printf("Digite um número inteiro: ");
			number = input.nextInt();
			
			if(number % 3 == 0 && number != 0) {
				sum += number;
				count++;
			}
		} while(number != 0);

		average = sum / count;
		
		System.out.printf("A média dos múltiplos de 3 é: %.2f", average);
	}

}

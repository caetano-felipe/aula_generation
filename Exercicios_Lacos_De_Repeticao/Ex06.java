package LacosDeRpeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/* Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).
		 */

		Scanner input = new Scanner(System.in);
		int number, sum = 0, count = 0;
		double average;
		
		do {
			System.out.printf("Digite um n�mero inteiro: ");
			number = input.nextInt();
			
			if(number % 3 == 0 && number != 0) {
				sum += number;
				count++;
			}
		} while(number != 0);

		average = sum / count;
		
		System.out.printf("A m�dia dos m�ltiplos de 3 �: %.2f", average);
	}

}

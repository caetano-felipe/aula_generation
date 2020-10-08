package LacosDeRpeticao;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares.

		Scanner input = new Scanner(System.in);
		int i, number, contEven = 0, contOdd = 0;
		
		for(i = 1; i <= 10; i++) {
			System.out.printf("Digite um número: ");
			number = input.nextInt();
			
			if(number % 2 == 0) {
				contEven++;
			} else {
				contOdd++;
			}
		}
		System.out.printf("\nQuantidade de números pares: %d", contEven);
		System.out.printf("\nQuantidade de números ímpares: %d", contOdd);
	}

}

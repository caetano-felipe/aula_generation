package LacosDeRpeticao;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99.
		 */
		
		Scanner input = new Scanner(System.in);
		int age, count21 = 0, count50 = 0;
		
		System.out.printf("Digite sua idade: ");
		age = input.nextInt();
		
		while(age != -99) {
			if(age >= 0 && age < 21) {
				count21++;
			} else if(age > 50) {
				count50++;
			} else {
				System.out.printf("\nIdade inválida...");
			}
			System.out.printf("\nDigite sua idade: ");
			age = input.nextInt();
		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d", count21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d", count50);
	}

}

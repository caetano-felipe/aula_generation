package LacoCondicional;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* Faça um programa que receba a idade de uma pessoa e mostre na saída em qual 
		 * categoria ela se encontra: 10-14 infantil - 15-17 juvenil - 18-25 adulto
		 */

		Scanner read = new Scanner(System.in);
		int age;
		
		System.out.printf("Digite sua idade: ");
		age = read.nextInt();
		
		if(age >= 10 && age <= 14) {
			System.out.printf("Sua idade é: %d, e você está na categoria: Infantil!", age);
		} else if(age >= 15 && age <= 17) {
			System.out.printf("Sua idade é: %d, e você está na categoria: Juvenil!", age);
		} else if(age >= 18 && age <= 25) {
			System.out.printf("Sua idade é: %d, e você está na categoria: Adulto!", age);
		} else {
			System.out.printf("Você digitou uma idade inválida...");
		}
	}

}

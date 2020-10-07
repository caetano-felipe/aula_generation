package LacoCondicional;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Faça um programa que entre com três números e coloque em ordem crescente.

		Scanner read = new Scanner(System.in);
		int numOne, numTwo, numThree;
		
		System.out.printf("Digite o primeiro número: ");
		numOne = read.nextInt();
		System.out.printf("Digite o segundo número: ");
		numTwo = read.nextInt();
		System.out.printf("Digite o terceiro número: ");
		numThree = read.nextInt();
		
		if(numThree > numOne) {
			if(numOne > numTwo) {
				System.out.printf("A ordem crescente: %d, %d, %d %n", numTwo, numOne, numThree);
			} else if(numTwo < numThree) {
				System.out.printf("A ordem crescente: %d, %d, %d %n", numOne, numTwo, numThree);
			}
		}
		if(numOne > numTwo) {
			if(numTwo > numThree) {
				System.out.printf("A ordem crescente: %d, %d, %d %n", numThree, numTwo, numOne);
			} else if(numThree < numOne) {
				System.out.printf("A ordem crescente: %d, %d, %d %n", numTwo, numThree, numOne);
			}
		}
		if(numOne < numTwo) {
			if(numThree < numOne) {
				System.out.printf("A ordem crescente: %d, %d, %d %n", numThree, numOne, numTwo);
			} else if(numThree < numTwo) {
				System.out.printf("A ordem crescente: %d, %d, %d %n", numOne, numThree, numTwo);
			}
		}
	}

}

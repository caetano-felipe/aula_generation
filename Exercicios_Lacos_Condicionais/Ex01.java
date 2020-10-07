package LacoCondicional;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Faça um programa que receba três inteiros e diga qual deles é o maior.

		Scanner read = new Scanner(System.in);
		int numOne, numTwo, numThree, bigger = 0;
		
		System.out.println("Digite o primeiro número: ");
		numOne = read.nextInt();
		System.out.println("Digite o segundo número: ");
		numTwo = read.nextInt();
		System.out.println("Digite o terceiro número: ");
		numThree = read.nextInt();
		
		if(numOne > numTwo && numOne > numThree) {
			bigger = numOne;
		} else if(numTwo > numOne && numTwo > numThree) {
			bigger = numTwo;
		} else {
			bigger = numThree;
		}
		
		System.out.printf("O maior número é: %d", bigger);
	}

}

package LacoCondicional;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

		Scanner read = new Scanner(System.in);
		int numOne, numTwo, numThree, bigger = 0;
		
		System.out.println("Digite o primeiro n�mero: ");
		numOne = read.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numTwo = read.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		numThree = read.nextInt();
		
		if(numOne > numTwo && numOne > numThree) {
			bigger = numOne;
		} else if(numTwo > numOne && numTwo > numThree) {
			bigger = numTwo;
		} else {
			bigger = numThree;
		}
		
		System.out.printf("O maior n�mero �: %d", bigger);
	}

}

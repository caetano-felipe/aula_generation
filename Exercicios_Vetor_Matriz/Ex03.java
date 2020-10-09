package VetorMatriz;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		Scanner input = new Scanner(System.in);

		int[][] matrice = new int[3][3];
		int number, greaterThanTen = 0;
		
		System.out.println("Matriz M[3][3]\n");
		
		for(int line = 0; line < 3; line++) {
			for(int column = 0; column < 3; column++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", (line +1), (column + 1));
				matrice[line][column] = input.nextInt();
			}
		}
		
		for(int line = 0; line < 3; line++) {
			for(int column = 0; column < 3; column++) {
				System.out.printf("\t %d \t", matrice[line][column]);
				if(matrice[line][column] > 10) {
					greaterThanTen++;
				}
			}
			System.out.println();
		}
		System.out.printf("\nA matriz possui %d valores maiores que 10!", greaterThanTen);
	}

}

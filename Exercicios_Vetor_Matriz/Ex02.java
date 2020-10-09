package VetorMatriz;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba 6 n�meros inteiros e mostre:
		 � Os n�meros pares digitados;
		 � A soma dos n�meros pares digitados;
		 � Os n�meros �mpares digitados;
		 � A quantidade de n�meros �mpares digitados.
		 */
		
		Scanner input = new Scanner(System.in);
		int sum = 0; 
		int[] array = new int[6];
		ArrayList<Integer> even = new ArrayList();
		ArrayList<Integer> odd = new ArrayList();
		
		for(int i = 0; i < 6; i++) {
			System.out.printf("Entre com um valor: ");
			array[i] = input.nextInt();
		}
		
		for(int i = 0; i < 6; i++) {
			if(array[i] % 2 == 0) {
				even.add(array[i]);
				sum += array[i];
			} else {
				odd.add(array[i]);
			}
		}
		
		System.out.printf("\nN�meros pares digitados: "+ even);
		System.out.printf("\nSoma dos n�meros pares digitados: %d", sum);
		System.out.printf("\nN�meros �mpares digitados: "+ odd);
		System.out.printf("\nQuantidade dos n�meros �mpares digitados: "+ odd.size());
	}
}

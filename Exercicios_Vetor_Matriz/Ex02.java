package VetorMatriz;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba 6 números inteiros e mostre:
		 • Os números pares digitados;
		 • A soma dos números pares digitados;
		 • Os números ímpares digitados;
		 • A quantidade de números ímpares digitados.
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
		
		System.out.printf("\nNúmeros pares digitados: "+ even);
		System.out.printf("\nSoma dos números pares digitados: %d", sum);
		System.out.printf("\nNúmeros ímpares digitados: "+ odd);
		System.out.printf("\nQuantidade dos números ímpares digitados: "+ odd.size());
	}
}

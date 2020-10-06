package PacoteJava;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/* Escreva um sistema que leia três números inteiros
		 * e positivos (A, B, C) e calcule a seguinte expressão:
		 * D = R + S / 2 , ONDE R = (A + B)² E S = (B + C)²
		 */

		Scanner read = new Scanner(System.in);
		int a, b, c;
		double s, d, r;
		
		System.out.println("Digite o valor de A: ");
		a = read.nextInt();
		System.out.println("Digite o valor de B: ");
		b = read.nextInt();
		System.out.println("Digite o valor de C: ");
		c = read.nextInt();
		
		r = Math.pow(a + b, 2.0);
		s = Math.pow(b + c, 2.0);
		d = (r + s) / 2;
		
		System.out.printf("O resultado da expressão D é: %2.2f", d);
	}

}

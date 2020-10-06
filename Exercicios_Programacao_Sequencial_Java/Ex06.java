package PacoteJava;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/* Construa um programa em c que, tendo como dados de entrada dois pontos
		 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
		 * A fórmula que efetua tal cálculo é: d = sqrt((x2 - x1)² + (y2 - y1)²).
		 */

		Scanner read = new Scanner(System.in);
		double d, y1, y2, x1, x2;
		
		System.out.println("Entre com o valor de x1: ");
		x1 = read.nextDouble();
		System.out.println("Entre com o valor de x2: ");
		x2 = read.nextDouble();
		System.out.println("Entre com o valor de y1: ");
		y1 = read.nextDouble();
		System.out.println("Entre com o valor de y2: ");
		y2 = read.nextDouble();
		
		d = Math.sqrt((Math.pow(x2 - x1, 2.0)) + Math.pow(y2 - y1, 2.0));
		
		System.out.printf("O valor da distância foi de: %2.2f", d);
	}

}

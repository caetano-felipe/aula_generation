package PacoteJava;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/* Escreva um sistema que lê os coeficientes a,b,c,d,e e f
		 * e calcula e mostra os valores de x e y.
		 */

		Scanner read = new Scanner(System.in);
		double x, y, a, b, c, d, e, f;
		
		System.out.println("Entre com o valor de A: ");
		a = read.nextDouble();
		System.out.println("Entre com o valor de B: ");
		b = read.nextDouble();
		System.out.println("Entre com o valor de C: ");
		c = read.nextDouble();
		System.out.println("Entre com o valor de D: ");
		d = read.nextDouble();
		System.out.println("Entre com o valor de E: ");
		e = read.nextDouble();
		System.out.println("Entre com o valor de F: ");
		f = read.nextDouble();
		
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		
		System.out.printf("O valor de X é: %2f %n", x);
		System.out.printf("O valor de Y é: %2f %n", y);
	}

}

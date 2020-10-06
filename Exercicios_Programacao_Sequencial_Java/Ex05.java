package PacoteJava;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/* Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
		 * aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
		 */

		Scanner read = new Scanner(System.in);
		double noteOne, noteTwo, noteThree, finalGrade;
		
		System.out.println("Digite a primeira nota: ");
		noteOne = read.nextDouble();
		System.out.println("Digite a segunda nota: ");
		noteTwo = read.nextDouble();
		System.out.println("Digite a terceira nota: ");
		noteThree = read.nextDouble();
		
		finalGrade = (noteOne * 2 + noteTwo * 3 + noteThree * 5) / 10;
		
		System.out.printf("A média final é %2.2f", finalGrade);
	}

}

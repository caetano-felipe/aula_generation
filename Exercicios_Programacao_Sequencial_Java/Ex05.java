package PacoteJava;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/* Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
		 * aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
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
		
		System.out.printf("A m�dia final � %2.2f", finalGrade);
	}

}

package PacoteJava;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/* Faça um sistema que leia a idade de uma pessoa expressa em dias
		 * e mostre-a expressa em anos, meses e dias.
		 * */

		Scanner read = new Scanner(System.in);
		int years, months, days, day;
		
		System.out.println("Digite sua idade em dias: ");
		days = read.nextInt();
		
		years = days / 365;
		months = (days % 365) / 30;
		day = (days % 365) % 30;
		
		System.out.printf("A idade em ano(s): %d ano(s), mes(es): %d mes(es) e dia(s): %d dia(s)", years, months, day);
	}

}

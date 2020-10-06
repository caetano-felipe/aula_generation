package PacoteJava;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/* Faça um sistema que leia a idade de uma pessoa expressa
		em anos, meses e dias e mostre-a expressa apenas em dias.*/
		
		Scanner read = new Scanner(System.in);
		int years, months, days, ageYears, ageMonths, ageDays;
		
		System.out.println("Quantos anos você tem?");
		years = read.nextInt();
		System.out.println("Quantos meses você tem?");
		months = read.nextInt();
		System.out.println("Quantos dias você tem?");
		days = read.nextInt();
		
		ageYears = years * 365;
		ageMonths = months * 30;
		ageDays = ageYears + ageMonths + days;
		
		System.out.printf("O total de anos convertidos em dias é: %d dias", ageDays);
	}

}

package PacoteJava;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* Faça um sistema que leia o tempo de duração de um evento em uma
		 * fábrica expressa em segundos e mostre-o expresso em horas, 
		 * minutos e segundos.
		 */
		
		Scanner read = new Scanner(System.in);
		int hours, minutes, seconds, totalSeconds;
		
		System.out.println("Digite o tempo de duração do evento em segundos: ");
		totalSeconds = read.nextInt();
		
		hours = totalSeconds / 3600;
		minutes = (totalSeconds % 3600) / 60;
		seconds = (totalSeconds % 3600) % 60;
		
		System.out.printf("A duração do evento teve %d hora(s), %d minuto(s) e %d segundo(s)", hours, minutes, seconds);
	}

}

package PacoteJava;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
		 */

		Scanner read = new Scanner(System.in);
		double carValue, percentageDistributor, taxes, totalCost;
		
		System.out.println("Digite o valor de fábrica do carro: ");
		carValue = read.nextDouble();
		
		percentageDistributor = carValue * 0.28;
		taxes = carValue * 0.45;
		totalCost = carValue + percentageDistributor + taxes;
		
		System.out.printf("O custo total do consumidor será de: R$%2.2f", totalCost);
	}

}

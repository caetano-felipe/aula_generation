package PacoteJava;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/* O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
		 */

		Scanner read = new Scanner(System.in);
		double carValue, percentageDistributor, taxes, totalCost;
		
		System.out.println("Digite o valor de f�brica do carro: ");
		carValue = read.nextDouble();
		
		percentageDistributor = carValue * 0.28;
		taxes = carValue * 0.45;
		totalCost = carValue + percentageDistributor + taxes;
		
		System.out.printf("O custo total do consumidor ser� de: R$%2.2f", totalCost);
	}

}

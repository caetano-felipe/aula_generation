package LacosDeRpeticao;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/* Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		 * psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
		 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		 * agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		 * pessoas, calcule e mostre:
		 * o n�mero de pessoas calmas;
		 * o n�mero de mulheres nervosas;
		 * o n�mero de homens agressivos;
		 * o n�mero de outros calmos;
		 * o n�mero de pessoas nervosas com mais de 40 anos;
		 * o n�mero de pessoas calmas com menos de 18 anos.
		 */

		Scanner input = new Scanner(System.in);
		int age, gender, options, count = 0;
		int calmPeople = 0, nervousWomen = 0, agressiveMen = 0, nonBinaryCalm = 0, nervousPeople40 = 0, calmPeople18 = 0;

		while(count < 150) {
			System.out.printf("Digite sua idade:");
			age = input.nextInt();
			while(age < 1 || age > 120) {
				System.out.printf("Digite sua idade:");
				age = input.nextInt();
			}
			
			System.out.printf("Digite 1 para Feminino / 2 para Masculino / 3 para N�o bin�rios: ");
			gender = input.nextInt();
			while(gender < 1 || gender > 3) {
				System.out.printf("Digite 1 para Feminino / 2 para Masculino / 3 para N�o bin�rios: ");
				gender = input.nextInt();
			}
			
			System.out.printf("Digite 1 para Calmo(a) / 2 para Nervoso(a) / 3 para Agressivo(a): ");
			options = input.nextInt();
			while(options < 1 || options > 3) {
				System.out.printf("Digite 1 para Calmo(a) / 2 para Nervoso(a) / 3 para Agressivo(a): ");
				options = input.nextInt();
			}

			if(options == 1) { calmPeople++; }
			if(gender == 1 && options == 2) { nervousWomen++; }
			if(gender == 2 && options == 3) { agressiveMen++; }
			if(gender == 3 && options == 1) { nonBinaryCalm++; }
			if(options == 2 && age > 40) { nervousPeople40++; }
			if(options == 1 && age < 18) { calmPeople18++; }

			count++;
		}
		System.out.printf("\nN�mero de pessoas calmas: %d", calmPeople);
		System.out.printf("\nN�mero de mulheres nervosas: %d", nervousWomen);
		System.out.printf("\nN�mero de homens agressivos: %d", agressiveMen);
		System.out.printf("\nN�mero de n�o bin�rios calmos: %d", nonBinaryCalm);
		System.out.printf("\nN�mero de pessoas nervosas com mais de 40 anos: %d", nervousPeople40);
		System.out.printf("\nN�mero de pessoas calmas com menos de 18 anos: %d", calmPeople18);
	}

}

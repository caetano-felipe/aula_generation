package VetorMatriz;

public class Ex01 {

	public static void main(String[] args) {
		/* Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
		 * inteiros. O programa deve executar os seguintes passos:
		 * (a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		 * (b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
		 * A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
		 * (c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
		 * (d) Mostre na tela cada valor do vetor A, um em cada linha.
		 */

		int[] array = {1, 0, 5, -2, -5, 7};
		
		int sum = array[0] + array[1] + array[5];
		System.out.printf("A soma dos valores no vetor �: %d \n", sum);
		
		array[4] = 100;

		for(int i : array) {
			System.out.printf("\nValor: %d", i);
		}
	}

}

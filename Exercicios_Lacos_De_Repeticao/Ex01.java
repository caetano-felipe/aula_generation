package LacosDeRpeticao;

public class Ex01 {

	public static void main(String[] args) {
		// Informar todos os n�meros de 1000 a 1999 que quando divididos por 11	obtemos resto = 5.

		int number;
		
		for(number = 1000; number <= 1999; number++) {
			if(number % 11 == 5) {
				System.out.printf("\nN�mero: %d", number);
			}
		}
	}

}

package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {
		Collection<String> products = new ArrayList();

		Scanner input = new Scanner(System.in);
		boolean exit = false;

		do {
			System.out.println("\n\t\tEntre com uma opção:");
			System.out.println("\n(1)Adicionar produto\n(2)Remover produto\n(3)Atualizar produto\n(4)Apresentar toda lista de produtos\n(0)Sair do programa");
			int option = input.nextInt();

			while(option < 0 || option > 4) {
				System.out.println("Opção inválida...Digite novamente:");
				System.out.println("\n(1)Adicionar produto\n(2)Remover produto\n(3)Atualizar produto\n(4)Apresentar toda lista de produtos\n(0)Sair do programa");
				option = input.nextInt();
			}

			switch(option) {
				case 0: 
					exit = true;
					break;

				case 1: 
					input.nextLine();
					System.out.println("Digite o nome do produto que vai adicionar: ");
					String insert = input.nextLine();
					products.add(insert);
					System.out.println("Lista: "+products);
					break;

				case 2: 
					input.nextLine();
					System.out.println("Digite o nome do produto que vai remover: ");
					String delete = input.nextLine();
					products.remove(delete);
					System.out.println("Lista: "+products);
					break;

				case 3: 
					input.nextLine();
					System.out.println("Digite o nome do produto que quer atualizar");
					String check = input.nextLine();
					System.out.println("Digite o nome do novo produto: ");
					String newProduct = input.nextLine();

					if(products.contains(check)) {
						products.remove(check);
						products.add(newProduct);
					}

					System.out.println("Atualizando item da lista: "+products+"\n");
					break;

				case 4: 
					for (String product : products) {
						System.out.println("Item: "+product);
					}
					break;

				default: 
					System.out.println("Erro inesperado");
					break;
			}
		} while (exit != true);
	}
}

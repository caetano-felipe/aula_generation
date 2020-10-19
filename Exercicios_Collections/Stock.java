package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Stock {

	public static void main(String[] args) {
		Collection<String> products = new ArrayList();

		// Armazenar dados da lista
		products.add("Arroz");
		products.add("Feijão");
		products.add("Água");
		products.add("Óleo");
		
		System.out.println("Produtos armazenados: "+products+"\n");
		
		// Remover dados da lista
		products.remove("Água");
		System.out.println("Removendo item da lista: "+products+"\n");
		
		// Atualizar dados da lista
		products.add("Farinha de trigo");
		System.out.println("Adicionando/Atualizando item da lista: "+products+"\n");
		
		// Apresentando todos dados da lista
		for (String product : products) {
			System.out.println("Item: "+product);
		}
		
		// Limpando lista
		products.clear();
		System.out.println("\nLimpando lista: "+products);
		
	}

}

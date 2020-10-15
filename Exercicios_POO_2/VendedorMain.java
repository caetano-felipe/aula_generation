package ExsEncapsulamentoHerança;

public class VendedorMain {

	public static void main(String[] args) {
		/* 6. Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
		 * tem como atributos da classe Pessoa e também os atributos próprios como valorVendas
		 * (correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem
		 * do valorVendas que será adicionado ao vencimento base do Vendedor).
		 */
		
		Vendedor venda = new Vendedor("Tony", "Rua Tito, 678", "(11)98765-4321", "34589765401", 35, 2000, 5);
		venda.printInfo();
		venda.validateCpf();
		venda.valorTotal();
		
		System.out.println("\n***********************************************************************\n");
		
		venda.setName("Valdivia");
		venda.setAddress("Rua Valparaíso, 567");
		venda.setTelephone("(11)97412-9876");
		venda.setCpf("76554321298");
		venda.setAge(30);
		venda.setValorVendas(3000);
		venda.setComissao(10);
		
		venda.printInfo();
		venda.validateCpf();
		venda.valorTotal();
	}

}

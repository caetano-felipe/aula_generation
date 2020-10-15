package ExsEncapsulamentoHeran�a;

public class FornecedorMain {

	public static void main(String[] args) {
		/* 2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe
		 * Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos
		 * que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao cr�dito
		 * m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor).
		 * Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores,
		 * um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e
		 * valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste
		 * adequado que lhe permita verificar o funcionamento dos m�todos implementados na classe
		 * Fornecedor e os herdados da classe Pessoa.
		 */
		
		Fornecedor fornecedor = new Fornecedor(
				"Jo�o", "Rua das bananas, 999", "(11)99999-9999", "12345678900", 40, 1000.0, 500.50);
		fornecedor.printInfo();
		fornecedor.validateCpf();
		System.out.println("Valor em cr�dito: "+fornecedor.formatarMoeda(fornecedor.getValorCredito()));
		System.out.println("Valor em d�vida: "+fornecedor.formatarMoeda(fornecedor.getValorDivida()));
		fornecedor.saldoAtual();
		
		System.out.println("\n*******************************************************************************\n");
		
		fornecedor.setName("Maria");
		fornecedor.setAddress("Ruas das caldeiras");
		fornecedor.setTelephone("(35)88888-9999");
		fornecedor.setCpf("999");
		fornecedor.setAge(77);
		fornecedor.printInfo();
		fornecedor.validateCpf();
		fornecedor.setValorCredito(1250.0);
		fornecedor.setValorDivida(749.40);
		System.out.println("Valor em cr�dito: "+fornecedor.formatarMoeda(fornecedor.getValorCredito()));
		System.out.println("Valor em d�vida: "+fornecedor.formatarMoeda(fornecedor.getValorDivida()));
		fornecedor.saldoAtual();
		
	}

}

package ExsEncapsulamentoHeran�a;

public class EmpregadoMain {

	public static void main(String[] args) {
		/* 3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
		 * inst�ncia da classe Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa,
		 * os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
		 * retida dos impostos). Implemente a classe Empregado com m�todos seletores e modificadores
		 * e um m�todo calcularSalario. Escreva um programa de teste adequado para a classe
		 * Empregado.
		 */
		
		Empregado funcionario = new Empregado(
				"Rub�o", "Rua das palmeiras, 10", "(11)3344-0987", "99999999999", 30, 6666, 4000, 10);
		funcionario.printInfo();
		funcionario.validateCpf();
		funcionario.salarioCalculado();
	}

}

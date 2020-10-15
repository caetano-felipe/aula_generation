package ExsEncapsulamentoHerança;

import java.text.NumberFormat;

public class Vendedor extends Pessoa {
	/* 6. Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
	 * tem como atributos da classe Pessoa e também os atributos próprios como valorVendas
	 * (correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem
	 * do valorVendas que será adicionado ao vencimento base do Vendedor).
	 */
	
	private double valorVendas;
	private double comissao;
	
	public Vendedor(
			String name, String address, String telephone, String cpf, int age, double valorVendas, double comissao) {
		super(name, address, telephone, cpf, age);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(vendasCalculadas());
		return formatoMoeda;
	}
	
	public double vendasCalculadas() {
		return valorVendas + (valorVendas * (comissao/100));
	}
	
	public void valorTotal() {
		System.out.println("Valor calculado com a comissão: "+this.formatarMoeda());
	}
}

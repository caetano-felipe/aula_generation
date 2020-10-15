package ExsEncapsulamentoHerança;

import java.text.NumberFormat;

public class Administrador extends Pessoa{
	/* 4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
	 * administrador tem como atributos da classe Pessoa e também os atributos próprios como
	 * ajudaDeCusto (ajudas referentes a viagens, estadias).
	 */
	
	private double ajudaDeCusto;
	
	public Administrador(String name, String address, String telephone, String cpf, int age, double ajudaDeCusto) {
		super(name, address, telephone, cpf, age);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public String formatarMoeda(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valor);
		return formatoMoeda;
	}
}

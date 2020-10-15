package ExsEncapsulamentoHerança;

import java.text.NumberFormat;

public class Empregado extends Pessoa {
	/* 3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
	 * instância da classe Empregado tem, para além dos atributos que caracterizam a classe Pessoa,
	 * os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
	 * retida dos impostos). Implemente a classe Empregado com métodos seletores e modificadores
	 * e um método calcularSalario. Escreva um programa de teste adequado para a classe
	 * Empregado.
	 */
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String name, String address, String telephone, String cpf,
					 int age, int codigoSetor, double salarioBase, double imposto) {
		super(name, address, telephone, cpf, age);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(calcularSalario());
		return formatoMoeda;
	}
	
	public double calcularSalario() {
		return salarioBase - (salarioBase * (imposto / 100));
	}
	
	public void salarioCalculado() {
		System.out.println("Salário calculado com os descontos: "+this.formatarMoeda());
	}
}

package ExsEncapsulamentoHerança;

public class Pessoa {
	/* 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
	 * (getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
	 * opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
	 * String telefone;
	 */
	
	private String name;
	private String address;
	private String telephone;
	private String cpf;
	private int age;
	
	public Pessoa(String name, String address, String telephone, String cpf, int age) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.cpf = cpf;
		this.age = age;
	}

	public void printInfo() {
		System.out.printf(
				"Nome: %s\nLogradouro: %s\nTelefone: %s\nCPF: %s\nIdade: %d\n", name, address, telephone, cpf, age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void validateCpf() {
		if(getCpf().length() != 11) {
			System.out.println("CPF inválido");
		} else {
			System.out.println("CPF válido");
		}
	}
}

package POO;

public class Ex01Cliente {
	/* Crie uma classe cliente e apresente os atributos e métodos referentes
	 * esta classe, em seguida crie um objeto cliente, defina as instancias deste
	 * objeto e apresente as informações deste objeto no console.
	 */
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String cpf;
	String newName;
	String newCpf;
	
	public Ex01Cliente(String first, String middle, String last, String document) {
		firstName = first;
		middleName = middle;
		lastName = last;
		cpf = document;
	}
	
	public String getFullName() {
		String fullName = firstName+" "+middleName+" "+lastName;
		return fullName;
	}
	
	public String getCpf() {
		String doc = cpf;
		return doc;
	}
	
	void setFullName(String first, String middle, String last) {
		String fullName = first+" "+middle+" "+last;
		this.newName = fullName;
	}
	
	void setCpf(String document) {
		String doc = document;
		this.newCpf = doc;
	}
}

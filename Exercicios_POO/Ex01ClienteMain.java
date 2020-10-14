package POO;

public class Ex01ClienteMain {

	public static void main(String[] args) {
		/* Crie uma classe cliente e apresente os atributos e métodos referentes
		 * esta classe, em seguida crie um objeto cliente, defina as instancias deste
		 * objeto e apresente as informações deste objeto no console.
		 */
		
		Ex01Cliente cliente = new Ex01Cliente("Felipe", "Borges", "Caetano", "99999999999");
		System.out.println("Nome: "+cliente.getFullName());
		System.out.println("CPF: "+cliente.getCpf());
		
		cliente.setFullName("Antonio", "Silva", "Santos");
		cliente.setCpf("12345678900");
		
		System.out.println("Nome: "+cliente.newName);
		System.out.println("CPF: "+cliente.newCpf);
	}

}

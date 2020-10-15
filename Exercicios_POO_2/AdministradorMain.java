package ExsEncapsulamentoHerança;

public class AdministradorMain {

	public static void main(String[] args) {
		/* 4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
		 * administrador tem como atributos da classe Pessoa e também os atributos próprios como
		 * ajudaDeCusto (ajudas referentes a viagens, estadias).
		 */
		
		Administrador admin = new Administrador(
				"Christopher McCandless", "Rua Alaska, 300", "(99)1111-2222", "98765432100", 24, 5000);
		
		admin.printInfo();
		admin.validateCpf();
		
		System.out.println(
				"Valor destinado a custos de viagens e estadias: "+admin.formatarMoeda(admin.getAjudaDeCusto()));
		
		System.out.println("\n***********************************************************************\n");
		
		admin.setName("Marty Mcfly");
		admin.setAddress("Avenida De volta pro futuro, 2015");
		admin.setTelephone("(88)1234-5678");
		admin.setCpf("88888888888");
		admin.setAge(15);
		admin.setAjudaDeCusto(9000);
		admin.printInfo();
		admin.validateCpf();
		
		System.out.println(
				"Valor destinado a custos de viagens e estadias: "+admin.formatarMoeda(admin.getAjudaDeCusto()));
	}

}

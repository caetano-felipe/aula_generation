package InterfacePolimorfismo;

public class AnimalMain {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		dog.setName("Lauers");
		dog.setAge(13);
		dog.setSendingSounds("AuAuAu");
		dog.setRun("Correr");
		
		Cavalo horse = new Cavalo();
		horse.setName("Pé de Pano");
		horse.setAge(10);
		horse.setSendingSounds("hihihihihihi");
		horse.setRun("Correr");
		
		Preguica sloth = new Preguica();
		sloth.setName("Sleep");
		sloth.setAge(5);
		sloth.setSendingSounds("ahhhh ihhhhhhh ahhhh");
		sloth.setClimbingTrees("Subir em árvores");
		
		Animal[] animals = new Animal[3];
		animals[0] = dog;
		animals[1] = horse;
		animals[2] = sloth;
		
		for(Animal animal:animals) {
			System.out.println(animal.getSendingSounds());
		}
	}
}

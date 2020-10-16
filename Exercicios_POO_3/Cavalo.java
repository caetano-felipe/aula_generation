package InterfacePolimorfismo;

public class Cavalo extends Animal {
	private String run;
	
	public Cavalo() {
		
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}
	
	public String getSendingSounds() {
		return "\nCavalo: "+super.getName()+"\nIdade: "+super.getAge()+"\nEmite sons como: "+super.getSendingSounds()+"\nGosta de: "+this.getRun();
	}
}

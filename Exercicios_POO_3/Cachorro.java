package InterfacePolimorfismo;

public class Cachorro extends Animal{
	public String run;
	
	public Cachorro() {
		
	}

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}
	
	public String getSendingSounds() {
		return "\nCachorro: "+super.getName()+"\nIdade: "+super.getAge()+"\nEmite sons como: "+super.getSendingSounds()+"\nGosta de: "+this.getRun();
	}
	
}

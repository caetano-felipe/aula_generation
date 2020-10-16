package InterfacePolimorfismo;

public class Preguica extends Animal{
	private String climbingTrees;
	
	public Preguica() {
		
	}

	public String getClimbingTrees() {
		return climbingTrees;
	}

	public void setClimbingTrees(String climbingTrees) {
		this.climbingTrees = climbingTrees;
	}
	
	public String getSendingSounds() {
		return "\nPreguiça: "+super.getName()+"\nIdade: "+super.getAge()+"\nEmite sons como: "+super.getSendingSounds()+"\nGosta de: "+this.getClimbingTrees();
	}
}

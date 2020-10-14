package POO;

public class Ex02Aviao {
	String color;
	String model;
	String company;
	double currentSpeed;
	double maximumSpeed;
	
	void on() {
		System.out.println("Ligando as turbinas, e preparando para decolagem.");
	}
	
	void fly() {
		System.out.println("Senhores passageiros, por favor apertem os cintos, estamos decolando!");
	}
	
	void landing() {
		System.out.println("Senhores passageiros, estamos iniciando o pouso da aeronave,"
				+ " por favor apertem os cintos!\nTenham uma excelente chegada e estadia!");
	}
	
	void changeSpeed(double velocity) {
		double change = this.currentSpeed + velocity;
		this.currentSpeed = change;
	}
}

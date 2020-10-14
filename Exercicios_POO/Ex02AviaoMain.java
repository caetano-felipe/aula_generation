package POO;

public class Ex02AviaoMain {

	public static void main(String[] args) {
		Ex02Aviao airplane = new Ex02Aviao();
		airplane.color = "Cinza";
		airplane.model = "Boeing 777";
		airplane.company = "KLM";
		airplane.currentSpeed = 0;
		airplane.maximumSpeed = 10000;
		
		airplane.on();
		airplane.fly();
		airplane.changeSpeed(5000);
		
		System.out.println("Nova velocidade: "+airplane.currentSpeed);
		
		airplane.landing();
		System.out.printf("\nA %s agradece a preferência!!!", airplane.company);
	}

}

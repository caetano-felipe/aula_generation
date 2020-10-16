package InterfacePolimorfismo;

public class Animal {
	private String name;
	private int age;
	private String sendingSounds;
	
	public String getName() {
		return name;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(final int age) {
		this.age = age;
	}
	public String getSendingSounds() {
		return sendingSounds;
	}
	public void setSendingSounds(final String sendingSounds) {
		this.sendingSounds = sendingSounds;
	}
}

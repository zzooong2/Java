package soccer;

public class Player {
	String name;
	String country;
	String position;
	int age;
	int height;
	
	
	public static void main(String[] args) {
		Attacker attacker = new Attacker();
		attacker.Attacker();
		attacker.run();
		attacker.shoot();
		attacker.pass();
		
		Deffender deffender = new Deffender();
		deffender.Deffender();
		deffender.run();
		deffender.shoot();
		deffender.pass();
	}
}
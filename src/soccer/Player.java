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

		Deffender deffender = new Deffender();
		deffender.Deffender();
		
		Goalkeeper goalkeeper = new Goalkeeper();
		goalkeeper.Goalkeeper();
	}
}
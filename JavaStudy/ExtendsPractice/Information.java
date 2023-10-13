package ExtendsPractice;

public class Information extends Player1{
	int height;
	int weight;
	String club;
	
	public Information(String name, int height, int weight, String club) {
		super(name);
		this.height = height;
		this.weight = weight;
		this.club = club;
	}
	
	public void tellYourInfo() {
		tellYourName();
		
		System.out.println("My height is " + height + "cm");
		System.out.println("My weight is " + weight + "kg");
		System.out.println("My club is " + club + ".  " +  "I really really love my club");
	}

}

package ExtendsPractice;

public class Physical extends Player1{
	int height = 193;
	int weight = 90;
	
	public Physical(String name, int height, int weight) {
		super(name);
		this.height = height;
		this.weight = weight;
	}
	
	public void tellYourInfo() {
		tellYourName();
		
		System.out.println("My height is " + height + "cm");
		System.out.println("My weight is " + weight + "kg");
	}

}

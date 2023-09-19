package CollectionFramework2_superT;

public class ECar extends Car {
	private int battery;
	
	public ECar(int d, int b) {
		super(d);
		battery = b;
	}
	@Override
	public String toString() { return "cc: " + disp + ", ba: " + battery;}

}

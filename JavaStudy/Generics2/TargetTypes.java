package Generics2;

public class TargetTypes {
	public static void main(String[] args) {
		Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
		iBox.set(25);
		System.out.println(iBox.get());
	}

}

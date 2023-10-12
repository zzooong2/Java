package GenericsPractice;

public class ManchesterUnited {
	public static void main(String[] args) {
		Box<Mctominay> aBox = new Box<>();
		Box<Multigoal> bBox = new Box<>();
		
		aBox.set(new Mctominay());
		bBox.set(new Multigoal());
		
		Mctominay mt = aBox.get();
		Multigoal mg = bBox.get();
		
		System.out.println(mt);
		System.out.println(mg);
	}

}

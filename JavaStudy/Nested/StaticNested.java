package Nested;

public class StaticNested {
	public static void main(String[] args) {
		Outer.Nested1 nst1 = new Outer.Nested1();
		nst1.add(5);
		Outer.Nedted2 nst2 = new Outer.Nedted2();
		System.out.println(nst2.get());
	}

}

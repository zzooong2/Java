package LambdaPractice;

public class Player4 {
	public static void Soccer(Football f, String s) {
		f.shoot(s);
	}
	
	public static void main(String[] args) {
		Soccer((s) -> {System.out.println(s);}, "미친 감아차기");
	}
}
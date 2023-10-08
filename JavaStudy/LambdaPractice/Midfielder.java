package LambdaPractice;

public class Midfielder {
	public static void main(String[] args) {
		String player = "BRUNO FERNANDES";
		
		Football fb = new Football() {
			public void print(String s) {
				System.out.println(player + s);
			}
		};
		
		fb.print("선수, 침투하는 공격수의 발 앞에 떨어지는 정확한 패스");
		
	}

}

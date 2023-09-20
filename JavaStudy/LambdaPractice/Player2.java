package LambdaPractice;

public class Player2 {
	public static void main(String[] args) {
		Football ak = new Football() { // 익명클래스 
			public void shoot(String s) {
				System.out.println(s);
			}
		};
		
		ak.shoot("무회전슛팅맨");
	}

}

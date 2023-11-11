package LambdaPractice;

public class Deffender {
	public static void main(String[] args) {
		String player = "KIM MINJAE";
		
		Football fb = (s) -> { System.out.println(player + s); };
		fb.print("선수, 상대 공격수를 피지컬로 제압해버립니다.");
	}

}

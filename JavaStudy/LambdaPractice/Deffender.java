package LambdaPractice;

public class Deffender {
	public static void main(String[] args) {
		String player = "Diogo Dalot";
		
		Football fb = (s) -> { System.out.println(player + s); };
		fb.print("선수, 상대선를 피지컬로 제압해버립니다.");
	}

}

package LambdaPractice;

class England {
	public static void main(String[] args) {
		String player = "메이슨 그린우드";
		
		Football fb = (s) -> { System.out.println(player + s); };
		fb.print(" 선수는 잉글랜드 축구의 미래다");
	}

}

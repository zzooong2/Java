package EnumPractice;

public enum Freinds {
	MINSU("석수동"), HAJI("정왕동"), ARSENAL("박달동");
	
	String spot;
	
	private Freinds(String spot) {
		this.spot= spot;
	}
	
	@Override
	public String toString() {
		return "추석에 여기 " + spot + "으로 놀러가자.";
	}
}

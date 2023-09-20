package NonNestedMemberClass;

public class Papers {
	private String con;
	public Papers(String s) { con = s; }
	public Printable getPrinter() {
		return new Printer(); //멤버 클래스 인스턴스 생성 및 반환
	}
	
	private class Printer implements Printable {
		public void print() {
			System.out.println(con);
		}
	}

}

package NonNestedAnonymousClass;

public class Papers {
	private String con;
	public Papers(String s) { con = s; }
	
	
	public Printable getPrinter() {
	    return new Printable() { // 익명 클래스의 정의와 인스턴스 생성
	        public void print() {
	    	    System.out.println(con);
	        }
	     };
    }
}
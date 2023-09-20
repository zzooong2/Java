package NonNestedLocalClass;

public class Papers {
	private String con;
	public Papers(String s) { con = s; }
	
	
	public Printable getPrinter() {
	    class Printer implements Printable { // 로컬 클래스의 정의
	        public void print() {
	    	    System.out.println(con);
	        }
	     }
	    
	     return new Printer(); // 로컬 클래스의 인스턴스 생성 및 반환
    }
}
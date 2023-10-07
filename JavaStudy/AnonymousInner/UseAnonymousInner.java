package AnonymousInner;

public class UseAnonymousInner {
	public static void main(String[] args) {
		Papers p = new Papers("나는 행복합니다.");
		Printable prn = p.getPrinter();
		prn.print();
	}

}

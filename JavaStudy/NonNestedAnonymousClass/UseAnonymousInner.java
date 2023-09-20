package NonNestedAnonymousClass;

public class UseAnonymousInner {
	public static void main(String[] args) {
		Papers p = new Papers("진짜 행복해?");
		Printable prn = p.getPrinter();
		prn.print();
	}

}

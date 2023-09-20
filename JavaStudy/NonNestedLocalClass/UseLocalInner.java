package NonNestedLocalClass;

public class UseLocalInner {
	public static void main(String[] args) {
		Papers p = new Papers("서류내용 : 행복스~");
		Printable prn = p.getPrinter();
		prn.print();
	}
}

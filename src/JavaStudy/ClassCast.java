package JavaStudy;
class ClassCast {
	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard)pbd1;
		
		System.out.println(". . intermediate locationg . .");
		Board ebd1 = new Board();
		PBoard ebd2 = (PBoard)ebd1;
	}
}
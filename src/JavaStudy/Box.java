package JavaStudy;
class Box {
	 protected String contents;
	 protected int boxNum;
	
	Box(int num, String cont) {
		boxNum = num;
		contents = cont;
	}
	public int geBoxNum() {
		return boxNum;
	}
	public String toString() {
		return contents;
	}
}

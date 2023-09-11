package ObjectClass;

class ShallowCopy {
	public static void main(String[] args) {
		Rectangle org = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;
		
		try {
			cpy = (Rectangle)org.clone(); // 인스턴스 복사
			org.changePos(2, 2, 7, 7); // 인스턴스 좌표 수정
			org.showPosition();
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

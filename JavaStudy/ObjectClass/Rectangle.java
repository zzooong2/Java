package ObjectClass;

public class Rectangle implements Cloneable {
	private Point upperLeft; // 좌측 상단 좌표
	private Point lowerRight; // 우측 하단 좌표
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	
	public void changePos(int x1, int y1, int x2, int y2) { // 좌표 정보 수정
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	public Object clone() throws CloneNotSupportedException {
		//Object 클래스의 clone 메소드 호출을 통한 복사본 생성
		Rectangle copy = (Rectangle)super.clone();
		
		//깊은 복사의 형태로 복사본을 완성
		copy.upperLeft = (Point)upperLeft.clone();
		copy.lowerRight = (Point)lowerRight.clone();
		
		//완성된 복사본의 참조 값 반환
		return copy;
	}
	
	public void showPosition() { // 직사각형 좌표 정보 출력
		System.out.print("좌측 상단: ");
		upperLeft.showPosition();
		
		System.out.print("우측 하단: ");
		lowerRight.showPosition();
		System.out.println();		
	}
}

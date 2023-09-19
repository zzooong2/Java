package Generics2;

public class MoveBoxContents {
	public static void main(String[] args) {
		Box<Toy> box1 = new Box<>();
		box1.set(new Toy());
		Box<Toy> box2 = new Box<>();
		
		//box1 에 저장된 내용물을 bo2로 이동
		BoxContentsMover.moveBox(box2, box1);
		System.out.println(box2.get());
	}

}

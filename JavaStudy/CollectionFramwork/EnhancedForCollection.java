package CollectionFramwork;

import java.util.List;
import java.util.LinkedList;

public class EnhancedForCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		// 인스턴스의 저장
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		// 전체 인스턴스의 참조
		for(String s : list)
			System.out.print(s + '\t');
		System.out.println();
		
		list.remove(0);
		
		// 전체 인스턴스 참조
		for(String s : list)
			System.out.print(s + '\t');
		System.out.println();
		
		
	}

}

package StreamOfStream;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectStringStream {
	public static void main(String[] args) {
		String[] words = { "Hello", "Box", "Robot", "Toy" };
		Stream<String> ss = Arrays.stream(words);
		
		List<String> ls = ss.filter(s -> s.length() < 5)
				            .collect(() -> new ArrayList<>(), // 저장소생성
				            		 (c, s) -> c.add(s),      // 인스턴스 c, 스트림 데이터 s
				                	  (lst1, lst2) -> lst1.addAll(lst2));
		System.out.println(ls);
	}

}

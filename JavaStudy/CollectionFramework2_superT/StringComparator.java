package CollectionFramework2_superT;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("APPLE");
		list.add("BOX");
		
		StrComp cmp = new StrComp(); //  정렬과 탐색의 기준
		Collections.sort(list, cmp); // 정렬
		int idx = Collections.binarySearch(list, "Robot", cmp); // 탐색
		System.out.println(list.get(idx));
	}

}

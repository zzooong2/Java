package NonNestedAnonymousClass;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class SortComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("APPLE");
		list.add("BOX");
		
		StrComp cmp = new StrComp(); // 정렬 기준
		Collections.sort(list, cmp); // 정렬 기준 변경해서 정렬 진행
		System.out.println(list);
		
	}

}

package AnonymousInner;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Practice {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("SCOTT MCTOMINAY");
		list.add("ERIC TEN HAG");
		list.add("CHRISTIAN ERICKSEN");
		list.add("RASMUS HOJLUND");
		list.add("ALEJANDRO GARNACHO");
		
		Comparator<String> cmp = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};
		
		Collections.sort(list, cmp);
		System.out.println(list);
		
	}

}

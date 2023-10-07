package AnonymousInner;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class PlayerComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("McTOMINAY");
		list.add("BRUNO FERNANDES");
		list.add("CASEMIRO");
		list.add("ONANA");
		list.add("RAPHAEL VARANE");
		list.add("MARCUS RASHFORD");
		list.add("ANTONY");
		
		Comparator<String> cmp = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
			return s1.length() - s2.length();
			}
		};
		
		Collections.sort(list, cmp);
		System.out.println(list);
	}

}

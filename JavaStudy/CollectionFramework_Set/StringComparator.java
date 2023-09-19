package CollectionFramework_Set;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class StringComparator implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}

}

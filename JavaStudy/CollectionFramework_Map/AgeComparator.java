package CollectionFramework_Map;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;

public class AgeComparator implements Comparator<Integer> {
	public int compare(Integer n1, Integer n2) {
		return n2.intValue() - n1.intValue();
	}

}

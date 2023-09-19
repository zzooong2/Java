package CollectionFramework_Set;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class PersonComparator implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		return p2.age - p1.age;
	}

}

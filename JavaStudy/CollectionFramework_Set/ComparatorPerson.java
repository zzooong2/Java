package CollectionFramework_Set;

import java.util.TreeSet;

public class ComparatorPerson {
	public static void main(String[] args) {
		TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
		tree.add(new Person("YOON", 37));
		tree.add(new Person("HONG", 53));
		tree.add(new Person("PARK", 22));
		
		for(Person p : tree)
			System.out.println(p);
		
	}

}

package CollectionFramework_Set;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	@Override
	public String toString() { return name + " : " + age; }
	
	@Override
	public int compareTo(Person p) {
		return this.age - p.age;
	}

}

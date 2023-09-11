package ArraysClass;

import java.util.Arrays;

class Person implements Comparable {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	
	public int compareTo(Object o) {
		Person p = (Person)o;
		return this.age - p.age; // 나이가 같으면 0 반환
	}
	
	public String toString() {
		return name + ":" + age;
	}
}

package CollectionFramework_Set;

import java.util.HashSet;

public class HashSetEqualityTwo {
	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799));
		System.out.println("인스턴스의 수: " + set.size());
		
		
		for(Num n : set)
			System.out.print(n.toString() + '\t');
		System.out.println();
	}

}

package CollectionFramework_Set;

import java.util.TreeSet;
import java.util.Iterator;

public class SortedTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(3); tree.add(1);
		tree.add(2); tree.add(4);
		System.out.println("인스턴스의 수 : " + tree.size());
		
		//for-each 문의 반복
		for(Integer n : tree)
			System.out.print(n.toString() + '\t');
		System.out.println();
		
		
		// 반복자에 의한 반복
		for(Iterator<Integer> itr = tree.iterator(); itr.hasNext();)
			System.out.print(itr.next().toString() + '\t');
		System.out.println();
	}

}

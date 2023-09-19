package CollectionFramework_Map;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

public class TreeMapIteration {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// key만 담고 있는 인스턴스 생성
		Set<Integer> ks = map.keySet();
		
		// 전체 key 출력(for-each문 기반)
		for(Integer n : ks)
			System.out.print(n.toString() + '\t');
		System.out.println();
		
		// 전체 Value 출력(for-each문 기반)
		for(Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();
		
		// 전체 Value 출력(반복자 기반)
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();)
			System.out.print(map.get(itr.next()) + '\t');
		System.out.println();
		
	}

}

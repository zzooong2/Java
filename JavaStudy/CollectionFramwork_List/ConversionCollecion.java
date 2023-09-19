package CollectionFramwork_List;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.LinkedList;


public class ConversionCollecion {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		// ArrayList<E> 인스턴스 기반으로 LinkedList<E> 인스턴스 생성
		list = new LinkedList<>(list);
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
			System.out.print(itr.next() + '\t');
		System.out.println();
		
		
	}

}

package CollectionFramwork_List;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Arrays;

public class ListIteratorCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);
		
		ListIterator<String> Iitr = list.listIterator(); // 양방향 반복자 획득
		
		String str;
		while(Iitr.hasNext()) {
			str = Iitr.next();
			System.out.print(str + '\t');
			if(str.equals("Toy"))
				Iitr.add("Toy2");
			
		}
		
		System.out.println();
		
		while(Iitr.hasPrevious()) {
			str = Iitr.previous();
			System.out.print(str + '\t');
			if(str.equals("Robot"))
				Iitr.add("Robot2");
		}
		
		System.out.println();
		
		for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
			System.out.print(itr.next() + '\t');
		System.out.println();
	}

}

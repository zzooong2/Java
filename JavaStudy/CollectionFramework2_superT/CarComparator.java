package CollectionFramework2_superT;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class CarComparator{
	public static void main(String[] args) {
		List<Car> clist = new ArrayList<>();
		clist.add(new Car(1800));
		clist.add(new Car(1200));
		clist.add(new Car(3000));
		
		List<ECar> elist = new ArrayList<>();
		elist.add(new ECar(3000, 55));
		elist.add(new ECar(1800, 87));
		elist.add(new ECar(1200, 99));
		
		CarComp comp = new CarComp();
		
		// 각각 정렬
		Collections.sort(clist, comp);
		Collections.sort(elist, comp); // 이 문장이 예제의 핵심
		
		for(Iterator<Car> itr = clist.iterator(); itr.hasNext(); )
			System.out.println(itr.next().toString() + '\t');
		System.out.println();
		
		for(Iterator<ECar> itr = elist.iterator(); itr.hasNext(); )
			System.out.println(itr.next().toString() + '\t');
		
		
	}
}

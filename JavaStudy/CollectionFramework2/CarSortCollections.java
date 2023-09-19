package CollectionFramework2;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CarSortCollections {
	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();
		list.add(new Car(1200));
		list.add(new Car(3000));
		list.add(new Car(1800));
		Collections.sort(list); // 정렬

		for(Iterator<Car> itr = list.iterator(); itr.hasNext(); ) // 출
			System.out.print(itr.next().toString() + '\t');
			
		
	}

}

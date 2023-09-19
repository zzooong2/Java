package CollectionFramework2_superT;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class CarComp implements Comparator<Car> {
	@Override
	public int compare(Car o1, Car o2) { return o1.disp - o2.disp; }

}

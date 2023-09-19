package CollectionFramework2;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;


public class Car implements Comparable<Car>{
	int disp; // 배기량
	
	public Car(int d) { disp = d; }
	
	@Override
	public String toString() {
		return "cc: " + disp;
	}
	@Override
	public int compareTo(Car o) {
		return disp - o.disp;
	}

}

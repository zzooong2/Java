package CollectionFramework2_superT;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;


public class Car{
	protected int disp; // 배기량
	public Car(int d) { disp = d; }
	
	@Override
	public String toString() {
		return "cc: " + disp;
	}
}

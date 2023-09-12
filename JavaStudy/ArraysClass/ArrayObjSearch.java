package ArraysClass;

import java.util.Arrays;

public class ArrayObjSearch {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("lee", 29);
		ar[1] = new Person("kim", 15);
		ar[2] = new Person("sun", 37);
		
		Arrays.sort(ar); // 탐색에 앞서 정렬
		int idx = Arrays.binarySearch(ar, new Person("who are you?", 37));
		System.out.println(ar[idxd]);
	}

}

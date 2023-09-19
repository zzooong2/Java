package CollectionFramework_Set;

import java.util.HashSet;

public class Num {
	private int num;
	public Num(int n) { num = n; }
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num % 3; // num의 값이 같으면 부류도 같다.
	}
	
	@Override
	public boolean equals(Object obj) { // 값이 같으면 참 반환.
		if(num == ((Num)obj).num)
			return true;
		else
			return false;
	}

}

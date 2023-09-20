package NonNestedMemberClass;

public class Outer {
	private int num = 0 ;
	
	class Member { 
		void add(int n) { num = n; }
		int get() { return num; }
	}

}

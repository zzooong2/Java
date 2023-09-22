package Optional;

import java.util.Optional;

public class Friend {
	String name; //친구이름
	Company cmp; // null 일 수 있음
	
	public Friend(String n, Company c) {
		name = n;
		cmp = c;
	}
	public String getName() { return name;}
	public Company getCmp() { return cmp;}
}

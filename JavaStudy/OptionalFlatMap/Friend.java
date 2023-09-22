package OptionalFlatMap;

import java.util.Optional;

class Friend {
	String name; //친구이름
	Optional<Company> cmp; // null 일 수 있음
	
	public Friend(String n, Optional<Company> c) {
		name = n;
		cmp = c;
	}
	public String getName() { return name;}
	public Optional<Company> getCmp() { return cmp;}
}

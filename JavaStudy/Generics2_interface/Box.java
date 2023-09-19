package Generics2_interface;

public class Box<T> implements Getable<T> {
	private T ob;
	public void set(T o) { ob = o; }
	
	@Override
	public T get() {
		return ob;
	}

}

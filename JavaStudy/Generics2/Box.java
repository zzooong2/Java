package Generics2;

public class Box<T> {
	protected T ob;
	public void set (T o) { ob = o; }
	public T get() { return ob; }
	
	@Override
	public String toString() {
		return ob.toString();
	}

}

package Generics2;

public class Box<T> implements Getable<String> {
	protected T ob;
	public void set(T o) {ob = o;}
	
	@Override
	public String get() {return ob.toString();}

}
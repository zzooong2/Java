package Deprecated;

public class Viewer implements Viewable {
	@Override
	public void showIt(String str) {
		System.out.println(str);
	}
	
	@Override
	public void brShowIt(String str) {
		System.out.println(str);
	}

}

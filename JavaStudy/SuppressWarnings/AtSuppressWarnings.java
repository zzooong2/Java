package SuppressWarnings;

public class AtSuppressWarnings {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Viewable view = new Viewer();
		view.showIt("Hello Annotations");
		view.brShowIt("Hello Annotations");
	}

}

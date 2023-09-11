package Java;
class ChildAdder extends ParentAdder {
	@Override
	public double add(double a, double b) {
		System.out.println("덧셈을 진행합니다.");
		return a+b;
	}
}
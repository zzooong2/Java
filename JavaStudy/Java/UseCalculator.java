package Java;
 class UseCalculator {
	 public static void main(String[] args) {
		 SC sc = new SC();
		 System.out.println("3 + 4 = " + sc.add(3,  4));
		 System.out.println("반지름 2.2, 원의 넓이: " + sc.calCircleArea(2.2) + "\n");
		 
		 System.out.println("15 - 7 = " + sc.min(15, 7));
		 System.out.println("반지름 5.0, 원의 둘레: " + sc.calCirclePeri(5.0));
	 }
 }

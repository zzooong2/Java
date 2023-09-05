package JavaStudy;
 class SuperSubStatic {
	 public static void main(String[] args) {
		 SuperCLS obj1 = new SuperCLS(); // count 값 1 증가
		 SuperCLS obj2 = new SuperCLS(); // count 값 1 증가
		 
		 // 아래 인스턴스 생성 과정에서 SuperCLSF 생성자 호출되므로,
		 SubCLS obj3 = new SubCLS; // count 값 1 증가
		 obj3.showCount();
	 }
 }
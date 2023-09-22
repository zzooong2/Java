package MethodReferences;

import java.util.function.ToIntBiFunction;

public class NoObjectMethodRef {
	public static void main(String[] args) {
		IBox ib1 = new IBox(5);
		IBox ib2 = new IBox(7);
		
		// 두 상자에 저장된 값비교하여 더 큰 값 반환
		
		ToIntBiFunction<IBox, IBox> bf = IBox::larger;
		int bigNum = bf.applyAsInt(ib1, ib2);
		System.out.println(bigNum);
	}

}

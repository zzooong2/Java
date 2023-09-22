package MethodReferences;

import java.util.function.ToIntBiFunction;

public class IBox {
	private int n;
	public IBox(int i) { n = i; }
	public int larger(IBox b) {
		if (n > b.n)
			return n;
		else
			return b.n;
	}

}

package MethodReferences;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

class JustSort {
	public void sort(List<?> lst) {
		Collections.reverse(lst);
	}

}

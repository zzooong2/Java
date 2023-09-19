package CollectionFramework_Queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class DefinedStack {
	public static void main(String[] args) {
		DIStack<String> stk = new DCStack<>(new ArrayDeque<String>());
		
		// PUSH 연산
		stk.push("1. Box");
		stk.push("2. Toy");
		stk.push("3. Robot");
		
		// POP 연산
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		
		
	}

}

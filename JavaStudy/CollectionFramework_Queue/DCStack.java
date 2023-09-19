package CollectionFramework_Queue;

import java.util.Deque;

public class DCStack<E> implements DIStack<E> {
	private Deque<E> deq;
	
	public DCStack(Deque<E> d) {
		deq = d;
	}
	public boolean push(E item) {
		return deq.offerFirst(item);
	}
	public E pop() {
		return deq.pollFirst();
	}

}

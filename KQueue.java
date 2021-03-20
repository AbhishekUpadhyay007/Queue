package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class KQueue {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		Queue<Integer> q = new LinkedList<>();
		q.addAll(q);
		
		deque.add(10);
		deque.add(20);
		deque.add(30);
		deque.add(40);
		deque.add(50);
		System.out.println(deque);
		System.out.println(deque.removeLast());
			
	}

}

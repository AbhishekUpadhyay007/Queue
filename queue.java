package queue;

import java.util.*;

public class queue {

	public static void main(String[] args) throws Exception {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		
		Scanner sc = new Scanner(System.in);
	       PriorityQueue<Integer> queue = new PriorityQueue<>();
	       int q = sc.nextInt();
	       
	       for(int i=0; i<q; i++){
	           int c = sc.nextInt();
	           if(c==1){
	               int v = sc.nextInt();
	               queue.add(v);
	               
	           }
	           if(c==2){
	               int v = sc.nextInt();
	            //    System.out.print("inside delete: " + v);
	               queue.remove(v);
	           }
	           if(c==3){
	               for(int j : queue) System.out.println(j);
	           }
	       }
		
		
//		MyArrayDeque<Integer> q = new MyArrayDeque<Integer>();
		
//		q.addLast(12);
//		q.addLast(34);
//		q.addLast(48);
//		q.addLast(60);
//		q.addLast(72);
		
//		q.addFront(22);
//		q.addFront(34);
//		q.addFront(48);
//		q.addFront(60);
//		q.addFront(72);
		
//		System.out.println(q.removeLast());
//		System.out.println(q.peekLast());
//		System.out.println(q.removeLast());
//		System.out.println(q.removeLast());
//		System.out.println(q.peekLast());
//		
//		
//		ArrayDeque<Integer> array = new ArrayDeque<>();
//		
//		array.addLast(12);
//		array.addLast(24);
//		array.addLast(36);
//		array.addLast(48);
//		array.addLast(60);
		
//		Queue<Integer> queue = new LinkedList<>();
//		queue.add(12);
//		queue.add(13);
//		queue.add(14);
//		queue.add(15);
//		queue.add(16);
//		
//		
//		System.out.println(queue.peek());
		
//		System.out.println(array);
//		System.out.println(array.pollLast());
		
	}

}

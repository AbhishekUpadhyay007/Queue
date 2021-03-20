package queue;

public class MyArrayDeque<E> {
	
	Node<E> head,tail;
	
	public void addFront(E val) {
		
		Node<E> toAdd = new Node<E>(val);
		
		if(head == null && tail ==null) {
			
			head = toAdd;
			tail = toAdd;
			return;
		}
		
		if(head.next ==  null && tail.next==null) {
			
			head =  toAdd;
			tail.prev = toAdd;
			head.next = tail;
			return;
		}
		
		Node<E> temp = head;
		
		if(head.next!=null && head.prev == null) {
			
			head.prev = toAdd;
			head = toAdd;
			toAdd.next = temp;
			
		}
		
	}
	
	public E removeFront() {
		
		Node<E> temp = head; 
		
		if(head == null) {
			return null;
		}
		
		if(head.next ==  null && tail.next == null) {
			
			head = tail = null;
			return temp.data;
			
		}
		
		if(head.next!=null) {
			
			head = head.next;
			head.prev = null;
			return temp.data;
		
		}
		return null;
				
	}
	
	public E peekFront() {
		
		if(head == null) {
			return null;
		}
				
		return head.data;
		
	}
	
	public void addLast(E val) {
		
		Node<E> toAdd = new Node<E>(val);
		
		if(head == null && tail == null) {
			head = toAdd;
			tail = toAdd;
			return;
		}
		
		if(head.next==null && tail.next == null) {
			tail.next = toAdd;
			tail = tail.next;
			toAdd.prev = head;
			return;
		}
		
		if(head.next!=null && tail.next == null) {
			tail.next = toAdd;
			toAdd.prev = tail;
			tail = toAdd;
			return;
		}
		
	}
	
	public E removeLast() throws Exception {
		
		if(head == null && tail == null) {
			throw new Exception("No Element in the Queue!");
//			return null;
		}
		
		Node<E> temp = tail;
		
		if(head.next == null && tail.next == null) {
			
			head = tail = null;
//			return temp.data;
			
			
		}
		
		if(head.next!=null && tail.next==null) {
			
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
			return temp.data;
			
		}
		
		return null;
		
	}
	
	public E peekLast() {
		
		if(tail==null) {
			return null;
		}
		
		return tail.data;
		
	}
	
	
	public static class Node<E>{
		
		Node<E> prev ;
		Node<E> next ;
		E data;
		
		public Node (E val) { 
			prev = null;
			next = null;
			data = val;
			
		}
		
	}

}

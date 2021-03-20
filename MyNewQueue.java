package queue;

public class MyNewQueue<N>{
	
	Queue<N> front, rear;
	Queue<N> node;
	
	MyNewQueue(){
		front = rear = null;
	}
	
	void enqueue(N data) {
		
		node = new Queue(data);
		
		if(front == null && rear == null) {
			front = rear = node;
		}else {
			rear.next = node;
			rear = node;
		}
		
	}
	
	void deletion() {
		if(front == null && rear == null) {
			System.out.println("Empty Queue");
			return;
		}
		
		Queue<N> temp = front;
		front = front.next;
		
		if(front == null) {
			rear = null;
		}
		
		temp.next = temp = null;
		
	}
	
	N front() {
		if(front == null) return null;
		
		return front.data;
	}
	
	void display() {
		
		if(front == null) return;
		
		while(front.next != null) {
			System.out.print(front.data+" ");
			front = front.next;
		}
		System.out.print(front.data+" ");
		
	}
	
	class Queue<N>{
			
		N data;
		Queue<N> next;
		
		Queue(N data){
			this.data = data;
			next = null;
		}
		
	}

}

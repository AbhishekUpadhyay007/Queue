package queue;

public class CircularQueue {
	
	int queue[];
	int front, rear;
	
	public CircularQueue(int n) {
		queue = new int[n];
		front = rear = -1;
	}
	
	
	void enqueue(int x) {
		
		if(front == -1 && rear == -1) {
			front = rear = 0;
			queue[rear] = x;
		}else if(isFull()){
			System.out.println("Queue is full");
			return;
		}else {
			rear = (rear+1) % queue.length;
			queue[rear] = x;
		}
		
	}
	
	void dequeue() {
		
		if(front == -1 && rear == -1) {
			System.out.println("Queue is Empty");
		}else if(front == rear) {
			System.out.println(queue[front]);
			front = rear = -1;
		}else {
			System.out.println(queue[front]);
			front = (front + 1)%queue.length;
		}
	}
	
	void display() {
		
		if(front == -1 && rear == -1) {
			System.out.println("Queue is empty");
			return;
		}
		
		while(front != rear) {
			System.out.print(queue[front] + " ");
			front = (front+1)%queue.length;
		}
		System.out.print(queue[front]);
	}
	
	boolean isFull() {
		int len = queue.length;
		
		if((rear + 1) % len == front) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		CircularQueue circularQueue = new CircularQueue(10);
		circularQueue.enqueue(0);
		circularQueue.enqueue(1);
		circularQueue.enqueue(2);
		circularQueue.enqueue(3);
		circularQueue.enqueue(2);
		circularQueue.enqueue(3);
		
		circularQueue.dequeue();
		
		circularQueue.display();
				
		
	}
	
}

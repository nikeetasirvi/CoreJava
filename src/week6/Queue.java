package week6;

public class Queue {
	
	int front = -1;
	int rear = -1;
	int[] arr = new int[20];
	
	public boolean isFull() {
		if(rear == arr.length-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(rear < 0) {
			return true;
		}
		return false;
	}
	
	public void enqueue(int element) {
		if(isFull()) {
			System.out.println("Queue if full");
		} else {
			//System.out.println("added " +element);
			rear++;
			arr[rear] = element;
			if(front<0) {
				front++;
			}
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue if empty");
			return -1;
		} else {
			int del = arr[front];
			//System.out.println("deleted " +arr[front]);
			if(front == rear) {
				rear = -1;
				front = -1;
			} else {
				front++;
			}
			return del;
		}
	}
	
	public void printQueue() {
		if(!isEmpty()) {
			System.out.print("Queue: ");
			for(int i=front; i<=rear; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
		} else {
			System.out.println("no elements to print in queue");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.printQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.printQueue();
	}

}

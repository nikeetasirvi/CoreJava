package week6;

public class Stack {
	
	int[] arr = new int[5];
	int currentPointer = -1;
	
	public void push(int element) {
		if(currentPointer >= arr.length-1) {
			System.out.println("Stack overflow");
		} else {
			currentPointer++;
			arr[currentPointer] = element;
			System.out.println("pushed " +element);
		}
	}
	
	public void pop() {
		if(currentPointer < 0) {
			System.out.println("Stack underflow");
		} else {
			System.out.println("popped " +arr[currentPointer]);
			currentPointer--;
		}
	}
	
	public void printStack() {
		System.out.print("Stack: ");
		for(int i=0; i<=currentPointer; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public int minimum() {
		int min = arr[0];
		for(int i=1; i<=currentPointer; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.printStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(0);
		s.printStack();
		System.out.println("Minimun is " +s.minimum());
	}

}

package week6.codeeval.queue;

import java.util.Scanner;

public class PermutationsRotationRemoval {
	
	public static void rotate(int[] a,int front,int rear) {
		int temp = a[front];
		for(int i=front+1; i<=rear; i++) {
			a[i-1] = a[i];
		}
		a[rear] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size");
		int n = input.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int front=0,rear=n-1;
		
		System.out.println("Enter values in queue a");
		for(int i=0; i<n; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("Enter values in queue b");
		for(int i=0; i<n; i++) {
			b[i] = input.nextInt();
		}
		
		int operations = 0;
		
		while(front!=-1) {
			if(front == rear){
				front = -1;
				rear = -1;
				operations++;
			} else if(a[front] == b[front]) {
				front = front+1;
				operations++;
			} else {
				rotate(a,front,rear);
				operations++;
			}
		}
		System.out.println(operations);
		
	}

}

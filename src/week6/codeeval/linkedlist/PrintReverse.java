package week6.codeeval.linkedlist;

import java.util.Scanner;

public class PrintReverse {
	
	public static void printReverse(Node head) {
		if (head == null) {
			return;
		}
		printReverse(head.next);
		System.out.print(head.data + " ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter size");
		int n = sc.nextInt();
		System.out.println("enter values");
		Node head = new Node(sc.nextInt());
		Node tail = head;
		for(int i=1; i<n; i++){
			tail.next = new Node(sc.nextInt());
			tail = tail.next;
		}
		printReverse(head);
	}
}

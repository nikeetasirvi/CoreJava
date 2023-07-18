package week6.codeeval.linkedlist;

import java.io.*;
import java.util.*;

public class SumofLastNnode {
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);

		System.out.println("Enter size");
		int m = sc.nextInt();
		System.out.println("Enter n (last n numbers to be added)");
		int n = sc.nextInt();

		System.out.println("enter values");
		Node head = new Node(sc.nextInt());
		Node tail = head;
		for(int i=1; i<m; i++){
			tail.next = new Node(sc.nextInt());
			tail = tail.next;
		}
		
		Solution2 obj = new Solution2();
		System.out.println(obj.SumOfNode(head, n, m));

	}
}

class Solution2 {


	public int SumOfNode(Node head, int n,int m){
		//write code here
		int start = m-n;
		int sum = 0;
		int counter = 1;
		Node n1 = head;
		while(n1.next!=null) {
			n1 = n1.next;
			counter++;
			if(counter > start) {
				sum = sum+n1.data;
			}
		}
		
		return sum;
	}
}
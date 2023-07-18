package week6.codeeval.linkedlist;

import java.util.*;

class Delete_Kth_Node
{
	Node head;	

	void addToTheLast(Node node)
	{
		if(head == null)
			head = node;
		else
		{
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Delete_Kth_Node list = new Delete_Kth_Node();
		//int n=Integer.parseInt(br.readLine());
		int a1=sc.nextInt();
		Node head= new Node(a1);
		list.addToTheLast(head);
		for (int i = 1; i < n; i++) 
		{
			int a = sc.nextInt(); 
			list.addToTheLast(new Node(a));
		}
		int K = sc.nextInt();					  
		//System.out.println(list.head.data+" "+ k);
		list.head = new Code().delete(list.head,K); 
		Node temp = list.head;
		while(temp!=null)
		{
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

class Code
{

	Node delete(Node head, int K)
	{
		//write your code here
		Node n = head;
		Node n1 = null;
		int i=1;
		while(n.next!=null) {
			if(i % K == 0) {
				n1.next = n.next;
			}
			n1 = n;
			n = n.next;
			i++;
		}
		return head;
	}
}
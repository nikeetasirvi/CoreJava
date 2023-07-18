package week6.codeeval.linkedlist;

import java.util.*;

public class DeleteAlternate {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Node head1 = null,tail1 = null;

		int n1 = sc.nextInt();
		int d1 = sc.nextInt();		    
		head1 = new Node(d1);
		tail1 = head1;

		while(n1-- > 1){
			tail1.next = new Node(sc.nextInt());
			tail1 = tail1.next;
		}

		Solution1 obj = new Solution1();
		head1= obj.deleteAlternate(head1);
		while(head1 != null){
			System.out.print(head1.data + " ");
			head1 = head1.next;
		}
		System.out.println();

	}

}
class Solution1 {

	public Node deleteAlternate (Node head){
		//write your code here
		Node n = head;
		Node n1 = null;
		int i=1;
		while(n.next!=null) {
			if(i % 2 == 0) {
				n1.next = n.next;
			}
			n1 = n;
			n = n.next;
			i++;
		}
		n1.next = null;
		return head;
	}
}
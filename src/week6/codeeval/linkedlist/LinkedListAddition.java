package week6.codeeval.linkedlist;

import java.util.*;

class LinkedListAddition {

	void addTwolsts(Node head1, Node head2) {
		
		Node temp1 = head1;
		String str1 = "";
		while(temp1.next!=null) {
			str1 += temp1.data;
			temp1 = temp1.next;
		}
		str1 += temp1.data;
		
		Node temp2 = head2;
		String str2 = "";
		while(temp2.next!=null) {
			str2 += temp2.data;
			temp2 = temp2.next;
		}
		str2 += temp2.data;
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1+num2);
	}

  void printlst(Node head) {
    while (head != null) {
      System.out.print(head.data);
      head = head.next;
    }
  }

  Node insert(Node head, int item) {
    Node tmp = new Node(item);
    if (head == null) {
      head = tmp;
      return head;
    }

    Node tmp1 = head;
    
    while (tmp1.next != null)
      tmp1 = tmp1.next;
    
    tmp1.next = tmp;
    return head;
  }

  public static void main(String[] args) {
	  
    Scanner in = new Scanner(System.in);
    
    Node head1 = null, head2 = null;
    
    System.out.println("enter num 1");
    int n1 = in .nextInt();
    System.out.println("enter num 2");
    int n2 = in .nextInt();
    
    LinkedListAddition lst1 = new LinkedListAddition();
    LinkedListAddition lst2 = new LinkedListAddition();
    
    System.out.println("enter list 1");
    while (n1--> 0)
      head1 = lst1.insert(head1, in.nextInt());
    
    System.out.println("enter list 2");
    while (n2--> 0)
      head2 = lst2.insert(head2, in .nextInt());
    
    lst1.addTwolsts(head1, head2);
  }

}
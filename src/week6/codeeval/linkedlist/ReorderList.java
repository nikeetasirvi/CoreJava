package week6.codeeval.linkedlist;

import java.util.*;

public class ReorderList{

  static Node head;
  
  public void reorderList() {
	  Node slow = head;
	  Node fast = head.next;
	  while (fast != null && fast.next != null) {
		  slow = slow.next;
		  fast = fast.next.next;
	  }
	  Node secondHalf = reverse(slow.next);
	  slow.next = null;
	  Node p1 = head;
	  Node p2 = secondHalf;
	  while (p2 != null) {
		  Node next1 = p1.next;
		  Node next2 = p2.next;
		  p1.next = p2;
		  p2.next = next1;
		  p1 = next1;
		  p2 = next2;
	  }
  }

  public Node reverse(Node head) {
    Node curr = head, prev = null, nex = null;
    while (curr != null) {
      nex = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nex;
    }
    return prev;
  }

  void insert(int value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
      return;
    }

    newNode.next = null;

    Node tmp = head;
    while (tmp.next != null)
      tmp = tmp.next;

    tmp.next = newNode;
    return;
  }

  void display() {
    Node tmp = head;
    while (tmp != null) {
      System.out.println(tmp.data);
      tmp = tmp.next;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ReorderList ob = new ReorderList();
    int numberOfNodes = in.nextInt();
    while (numberOfNodes--> 0){
      ob.insert( in.nextInt());
    }
    ob.reorderList();
    ob.display();

  }

}
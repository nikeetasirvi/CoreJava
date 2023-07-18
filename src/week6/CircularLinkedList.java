package week6;

import week6.Node;

public class CircularLinkedList {

	private Node head = null;

	public void insertLast(int data) {
		Node node = new Node();
		node.data = data;
		if(head == null){
			head = node;
			node.next = node;
		} else{
			Node n = head;
			while(n.next != head){
				n = n.next;
			}
			n.next = node;
			node.next = head;
		}
	}
	
	public void insertFirst(int data){
		Node node = new Node();
		node.data = data;
		if(head == null) {
			head = node;
			node.next = node;
		} else {
			Node n = head;
			while(n.next != head) {
				n = n.next;
			}
			n.next = node;
			node.next = head;
			head = node;
		}	
	}
	
	public void insertAt(int index, int data){
		Node node = new Node();
		node.data = data;
		Node n = head;
		if(index == 0){
			insertFirst(data);
		} else{
			try {
				for(int i=0; i<index-1; i++){
					n = n.next;
				}
				node.next = n.next;
				n.next = node;
			} catch(NullPointerException e) {
				System.out.println("list is empty");
				return;
			}
		}
	}
	
	public void deleteFirst(){
		if(head == null) {
			return;
		} else if(head == head.next) {
			head = null;
		} else {
			Node n = head;
			while(n.next!=head) {
				n = n.next;
			}
			head = head.next;
			n.next = head;
		}
	}
	
	public void deleteAt(int index){
		if(index == 0){
			deleteFirst();
		} else{
			Node n = head;
			try {
				for(int i=0; i<index-1; i++){
					n = n.next;
				}
				Node n1 = n.next;
				n.next = n1.next;
				if(n1 == head) {
					head = n1.next;
				}
			} catch(NullPointerException e) {
				System.out.println("list is empty");
				return;
			}
		}
	}
	
	public void deleteLast(){
		if(head == null){
			return;
		} else if(head.next == head) {
			head = null;
		} else{
			Node n = head;
			Node previous = null;
			while(n.next != head){
				previous = n;
				n = n.next;
			}
			previous.next = head;
		}
	}
	
	public void show(){
		if(head == null){
			return;
		} else{
			Node n = head;
			while(n.next != head){
				System.out.println(n.data);
				n = n.next;
			}
			System.out.println(n.data);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.insertLast(10);
		circularLinkedList.insertLast(20);
		circularLinkedList.insertLast(30);
		circularLinkedList.insertLast(40);
		circularLinkedList.insertFirst(0);
		circularLinkedList.insertAt(8,25);
		circularLinkedList.deleteFirst();
		circularLinkedList.deleteFirst();
		circularLinkedList.deleteFirst();
		circularLinkedList.deleteFirst();
		circularLinkedList.deleteFirst();
		circularLinkedList.deleteAt(0);
		circularLinkedList.insertAt(1,25); // returns after message
		circularLinkedList.deleteFirst(); // return without message
		circularLinkedList.deleteAt(1); // returns after message
		circularLinkedList.insertLast(10);
		circularLinkedList.insertLast(20);
		circularLinkedList.insertLast(30);
		circularLinkedList.insertLast(40);
		circularLinkedList.deleteAt(4);
		circularLinkedList.deleteLast();
		circularLinkedList.deleteLast();
		circularLinkedList.deleteLast();
		circularLinkedList.insertLast(10);
		circularLinkedList.show();
	}

}

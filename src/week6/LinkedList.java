package week6;

class Node{
	public int data;
	public Node next;
}

public class LinkedList{

	private Node head;

	public void insertLast(int data){
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null){
			head = node;
		} else{
			Node n = head;
			while(n.next != null){
				n = n.next;
			}
			n.next = node;
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
				System.out.println("given index is out of linkedlist");
				return;
			}
		}
	}

	public void insertFirst(int data){
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	public void deleteLast(){
		if(head == null){
			return;
		} else if(head.next == null){
			head = null;
		} else{
			Node n = head;
			/*
		    while(n.next.next != null) {
		    	n = n.next;
		    }
		    n.next = null;
			*/
			Node previous = null;
			while(n.next != null){
				previous = n;
				n = n.next;
			}
			previous.next = null;
		}
	}

	public void deleteFirst(){
		if(head == null) {
			return;
		} else {
			head = head.next;
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
			} catch(NullPointerException e) {
				System.out.println("given index is out of linkedlist");
				return;
			}
		}
	}

	public void show(){
		if(head == null){
			return;
		} else{
			Node n = head;
			while(n.next != null){
				System.out.println(n.data);
				n = n.next;
			}
			System.out.println(n.data);
		}
	}

	public static void main(String[] args){

		LinkedList linkedlist = new LinkedList();
		linkedlist.insertLast(10);
		linkedlist.insertLast(20);
		linkedlist.insertLast(30);
		linkedlist.insertLast(40);
		linkedlist.insertAt(2,25);
		linkedlist.insertFirst(0);
		linkedlist.deleteFirst();
		linkedlist.deleteAt(2);
		linkedlist.deleteLast();
		linkedlist.deleteLast();
		linkedlist.deleteLast();
		linkedlist.deleteLast();
		linkedlist.show();
		linkedlist.deleteFirst();
		linkedlist.insertLast(10);
		linkedlist.deleteFirst();
		linkedlist.insertLast(20);
		linkedlist.insertAt(1,30);
		linkedlist.insertAt(3,30);
		linkedlist.show();
		linkedlist.deleteAt(2);
	}

}
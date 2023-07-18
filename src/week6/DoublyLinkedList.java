package week6;

class DoublyNode{
	public DoublyNode previous;
	public int data;
	public DoublyNode next;
}

public class DoublyLinkedList {
	
	private DoublyNode head;

	public void insertLast(int data){
		DoublyNode node = new DoublyNode();
		node.data = data;
		node.next = null;
		if(head == null){
			head = node;
		} else{
			DoublyNode n = head;
			while(n.next != null){
				n = n.next;
			}
			n.next = node;
			node.previous = n;
		}
	}
	
	public void insertFirst(int data){
		DoublyNode node = new DoublyNode();
		node.previous = null;
		node.data = data;
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index, int data){
		DoublyNode node = new DoublyNode();
		node.data = data;
		DoublyNode n = head;
		if(index == 0){
			insertFirst(data);
		} else{
			try {
				for(int i=0; i<index-1; i++){
					n = n.next;
				}
				if(n.next == null) {
					insertLast(data);
				} else {
					node.next = n.next;
					n.next = node;
					node.previous = n;
					node.next.previous = node;
				}
			} catch(NullPointerException e) {
				System.out.println("given index is out of linkedlist");
				return;
			}
		}
	}
	
	public void deleteLast(){
		if(head == null){
			return;
		} else if(head.next == null){
			head = null;
		} else{
			DoublyNode n = head;
			while(n.next != null){
				n = n.next;
			}
			n.previous.next = null;
		}
	}
	
	public void deleteFirst(){
		if(head == null) {
			return;
		} else {
			head = head.next;
			//head.previous = null;
		}
	}
	
	public void deleteAt(int index){
		if(index == 0){
			deleteFirst();
		} else{
			DoublyNode n = head;
			try {
				for(int i=0; i<index-1; i++){
					n = n.next;
				}
				DoublyNode n1 = n.next;
				if(n1.next == null) {
					n.next = n1.next;
				} else {
					n.next = n1.next;
					n1.next.previous = n;
				}
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
			DoublyNode n = head;
			while(n.next != null){
				System.out.println(n.data);
				n = n.next;
			}
			System.out.println(n.data);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertLast(10);
		doublyLinkedList.insertLast(20);
		doublyLinkedList.insertLast(30);
		doublyLinkedList.insertLast(40);
		doublyLinkedList.insertAt(2,25);
		doublyLinkedList.insertFirst(0);
		doublyLinkedList.deleteFirst();
		doublyLinkedList.deleteAt(4);
		doublyLinkedList.deleteLast();
		doublyLinkedList.deleteLast();
		doublyLinkedList.deleteLast();
		doublyLinkedList.deleteLast();
		doublyLinkedList.show();
		doublyLinkedList.deleteFirst();
		doublyLinkedList.insertLast(10);
		doublyLinkedList.deleteFirst();
		doublyLinkedList.insertLast(20);
		doublyLinkedList.insertAt(1,30);
		doublyLinkedList.insertAt(3,30);
		doublyLinkedList.show();
		doublyLinkedList.deleteAt(2);
	}

}

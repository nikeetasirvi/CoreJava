package week6.codeeval.linkedlist;

import java.util.Scanner;

public class DLLImp {

    private DoublyNode head;
	private DoublyNode tail;
	
	public void insertLast(int data){
		DoublyNode node = new DoublyNode();
		node.data = data;
		node.next = null;
		if(head == null){
			head = node;
			tail = node;
		} else{
			DoublyNode n = head;
			while(n.next != null){
				n = n.next;
			}
			n.next = node;
			node.previous = n;
			tail = node;
		}
	}
	
	public void show(){
		if(head == null){
			return;
		} else{
			DoublyNode n = head;
			while(n.next != null){
				System.out.print(n.data+ " ");
				n = n.next;
			}
			System.out.println(n.data);
		}
	}
	
	public void showReverse() {
		if(head == null){
			return;
		} else{
			DoublyNode n = tail;
			while(n.previous != null){
				System.out.print(n.data+ " ");
				n = n.previous;
			}
			System.out.println(n.data);
		}
	}

    public static void main(String[] args) {

        //write your answer here

        Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		DLLImp doublyLinkedList = new DLLImp();
		for(int i=0; i<num; i++) {
			doublyLinkedList.insertLast(input.nextInt());
		}
		
		doublyLinkedList.show();
		doublyLinkedList.showReverse();
    }
}
class DoublyNode{
	public DoublyNode previous;
	public int data;
	public DoublyNode next;
}

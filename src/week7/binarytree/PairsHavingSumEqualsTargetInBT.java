package week7.binarytree;

import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class PairsHavingSumEqualsTargetInBT {

	static Scanner input = new Scanner(System.in);
	Deque<Node> queue = new LinkedList<Node>();
	static Node root = null;

	class Node {
		int data;
		Node left;
		Node right;
	}

	public Node newNode(int value) {
		Node newNode = new Node();
		newNode.data = value;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}

	public void insertValue(int value) {
		Node newNode = newNode(value);
		if(root == null) {
			root = newNode;
			queue.add(newNode);
		} else {
			Node node = queue.remove();
			if(node.left == null) {
				node.left = newNode;
				queue.add(newNode);
				queue.addFirst(node);
			} else {
				node.right = newNode;
				queue.add(newNode);
			}
		}
	}

	public void print() {
		Queue<Node> queue1 = new LinkedList<Node>();
		queue1.add(root);
		while(!queue1.isEmpty()) {
			Node temp = queue1.poll();
			System.out.print(temp.data+ " ");
			if(temp.left!=null) {
				queue1.add(temp.left);
			}
			if(temp.right!=null) {
				queue1.add(temp.right);
			}
		}
		System.out.println();
	}

	public void findPairsOfGivenTarget(int target) {
		Queue<Node> queue2 = new LinkedList<Node>();
		queue2.add(root);
		Set<Node> visited = new LinkedHashSet<>();
		while(!queue2.isEmpty()) {
			Node temp = queue2.poll();
			visited.add(temp);

			Queue<Node> queue3 = new LinkedList<Node>();
			queue3.add(root);
			while(!queue3.isEmpty()) {
				Node temp1 = queue3.poll();
				if(!visited.contains(temp1)) {
					if(temp.data+temp1.data == target) {
						System.out.println(temp.data+ " + " +temp1.data);
					}
				}
				if(temp1.left!=null) {				
					queue3.add(temp1.left);
				}
				if(temp1.right!=null) {				
					queue3.add(temp1.right);
				}
			}

			if(temp.left!=null) {				
				queue2.add(temp.left);
			}
			if(temp.right!=null) {				
				queue2.add(temp.right);
			}
		}
	}
	
	// more optimized code in O(n) time complexity
	
//	public void findPairsOfGivenTarget(int target) {
//	    Queue<Node> queue = new LinkedList<>();
//	    Set<Integer> visited = new LinkedHashSet<>();
//	    queue.add(root);
//	    while(!queue.isEmpty()) {
//	        Node temp = queue.poll();
//	        int complement = target - temp.data;
//	        if (visited.contains(complement)) {
//	            System.out.println(temp.data + " + " + complement);
//	        }
//	        visited.add(temp.data);
//	        if (temp.left != null) {
//	            queue.add(temp.left);
//	        }
//	        if (temp.right != null) {
//	            queue.add(temp.right);
//	        }
//	    }
//	}

	public static void main(String[] args) {

		PairsHavingSumEqualsTargetInBT ps = new PairsHavingSumEqualsTargetInBT();
		int option;

		while(true) {
			System.out.println("------------------------------");
			System.out.println("Enter your option");
			System.out.println("0:Exit");
			System.out.println("1:Insert");
			System.out.println("2:Print Binary Tree");
			System.out.println("3:Find pairs of target");
			System.out.println("------------------------------");
			option = input.nextInt();
			if(option == 0) {
				System.out.println("Thank you...!!!");
				break;
			}
			switch(option) {
			case 1:{
				System.out.println("Enter value to be inserted");
				int value = input.nextInt();
				if(value!=0) {
					ps.insertValue(value);
				} else {
					System.out.println("Enter correct value");
				}
				break;
			}
			case 2:{
				if(root != null) {
					ps.print();
				} else {
					System.out.println("Tree is empty");
				}
				break;
			}
			case 3:{
				if(root!=null) {
					System.out.println("Enter the target");
					int target = input.nextInt();
					ps.findPairsOfGivenTarget(target);
				} else {
					System.out.println("Tree is empty");
				}
				break;
			}
			default:{
				System.out.println("Enter correct option");
				continue;
			}
			}
		}
		input.close();
	}
}

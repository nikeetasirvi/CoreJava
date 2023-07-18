package week7.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class LinkedListBinaryTree {

	static Node root = null;
	Deque<Node> queue = new LinkedList<Node>();
	static Scanner input = new Scanner(System.in);

	public static class Node {
		private int data;
		private Node left;
		private Node right;
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
				queue.add(node.left);
				queue.addFirst(node);
			} else {
				node.right = newNode;
				queue.add(node.right);
			}
		}
	}

	public void deleteValue(int key) {
		//if only one node in the list
		if(root.left == null && root.right == null) {
			if(root.data == key) {
				queue.clear(); // clear the main queue
				root = null;
				//System.out.println("Succesfully deleted");
				return;
			} else {
				System.out.println("Value if not present in tree");
				return;
			}
		}
		Queue<Node> queue3 = new LinkedList<Node>();
		queue3.add(root);
		Node keyNode = null,lastNode = null;
		while(!queue3.isEmpty()) {
			lastNode = queue3.remove();
			if (lastNode.data == key) {
				keyNode = lastNode;
			}
			if (lastNode.left != null) {
				queue3.add(lastNode.left);
			}
			if (lastNode.right != null) {
				queue3.add(lastNode.right);
			}
		}
		if(keyNode!=null) {
			keyNode.data = lastNode.data;
			delete(lastNode);
			System.out.println("Succesfully deleted");
		} else {
			System.out.println("Value is not present in tree");
		}
	}

	public void delete(Node lastNode) {
		Queue<Node> queue4 = new LinkedList<Node>();
		queue4.add(root);
		Node temp = null;
		while (!queue4.isEmpty()) {
			temp = queue4.remove();
			if (temp == lastNode) {
				temp = null;
				return;
			}
			if (temp.right != null) {
				if (temp.right == lastNode) {
					temp.right = null;
					queue.addFirst(temp); // need to add when we delete the last right element because it is not there in the main queue
					queue.remove(lastNode);//remove "last node variable" from the main queue or last element present in the main queue by "queue.removeLast();"
					return;
				} else
					queue4.add(temp.right);
			}
			if (temp.left != null) {
				if (temp.left == lastNode) {
					temp.left = null;
					//queue.addFirst(temp); // no need to add when we delete the last left element because the main queue already has this in the beginning
					queue.remove(lastNode);
					return;
				} else
					queue4.add(temp.left);
			}
		}
	}

	public void minMax() {
		int min = root.data;
		int max = root.data;
		Queue<Node> queue2 = new LinkedList<Node>();
		queue2.add(root);
		while(!queue2.isEmpty()) {
			Node temp = queue2.poll();
			if(temp.data<min) {
				min = temp.data;
			}
			if(temp.data>max) {
				max = temp.data;
			}
			if(temp.left!=null) {
				queue2.add(temp.left);
			}
			if(temp.right!=null) {
				queue2.add(temp.right);
			}
		}
		System.out.println("Min is " +min);
		System.out.println("Max is " +max);
	}

	public void specialOperation() {
		Queue<Node> queue5 = new LinkedList<Node>();
		queue5.add(root);
		int sqrt;
		while(!queue5.isEmpty()) {
			Node temp = queue5.poll();
			if(temp.left!=null) {
				queue5.add(temp.left);
			}
			if(temp.right!=null) {
				sqrt = temp.right.data*temp.right.data;
				deleteValue(temp.data);
				insertValue(sqrt%10);
				queue5.add(temp.right);
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
		System.out.println("Inorder");
		printInorder(root);
		System.out.println("\nPostorder");
		printPostorder(root);
		System.out.println("\nPreorder");
		printPreorder(root);
		System.out.println("\nPrint Spiral");
		printSpiral(root);
		System.out.println();
	}

	public void printInorder(Node root) {
		if(root!=null) {
			printInorder(root.left);
			System.out.print(root.data+ " ");
			printInorder(root.right);
		}
	}

	public void printPostorder(Node root) {
		if(root!=null) {
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(root.data+ " ");
		}
	}

	public void printPreorder(Node root) {
		if(root!=null) {
			System.out.print(root.data+ " ");
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}

	public void printSpiral(Node root) {
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		Node temp;
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				temp = s1.pop();
				System.out.print(temp.data+ " ");
				if(temp.right!=null) {
					s2.push(temp.right);
				}
				if(temp.left!=null) {
					s2.push(temp.left);
				}
			}
			while(!s2.isEmpty()) {
				temp = s2.pop();
				System.out.print(temp.data+ " ");
				if(temp.left!=null) {
					s1.push(temp.left);
				}
				if(temp.right!=null) {
					s1.push(temp.right);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListBinaryTree llbt = new LinkedListBinaryTree();
		int option;

		while(true) {
			System.out.println("------------------------------");
			System.out.println("Enter your option");
			System.out.println("0:Exit");
			System.out.println("1:Insert");
			System.out.println("2:Delete");
			System.out.println("3:Print Binary Tree");
			System.out.println("4:Print min and max");
			System.out.println("5:Special Operation");
			System.out.println("------------------------------");
			option = input.nextInt();
			if(option == 0) {
				System.out.println("Thank you...!!!");
				break;
			}
			switch(option) {
			case 1:{
				System.out.println("Enter value");
				int value = input.nextInt();
				if(value!=0) {
					llbt.insertValue(value);
				} else {
					System.out.println("Enter corrent value to be inserted");
				}
				break;
			}
			case 2:{
				if(root!=null) {
					System.out.println("Enter the value to be deleted");
					int key = input.nextInt();
					if(key!=0) {
						llbt.deleteValue(key);
					} else {
						System.out.println("Enter proper value to be deleted");
					}
				} else {
					System.out.println("Tree is empty");
				}
				break;
			}
			case 3:{
				if(root!=null) {
					llbt.print();
				} else {
					System.out.println("Tree is empty");
				}
				break;
			}
			case 4:{
				if(root!=null) {
					llbt.minMax();
				} else {
					System.out.println("Tree is empty");
				}
				break;
			}
			case 5:{
				/*
				 * For every Right Node found for a parent node P in the binary tree
				 * Find the square of the right node.
				 * Perform Binary Delete operation on the parent node P.
				 * Find modulus 10 of square root and insert in binary tree.
				 * 
				 * Example: 
				 * Binary tree after insertion
				 * 12 3 67 33 54 89
				 * Binary Tree after special operations...
				 * 89 9 67 33 54 6 
				 * 
				 */
				if(root!=null) {
					llbt.specialOperation();
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

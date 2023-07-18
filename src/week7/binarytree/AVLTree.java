package week7.binarytree;

import java.util.Scanner;

public class AVLTree {

	static Node root = null;
	static Scanner input = new Scanner(System.in);

	public static class Node {
		private int data,height;
		private Node left;
		private Node right;
	}

	public static Node newNode(int value) {
		Node newNode = new Node();
		newNode.data = value;
		newNode.height = 1;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
	
	public static int getHeight(Node root) {
		if(root == null) {
			return 0;
		}
		return root.height;
	}
	
	public static int getBalance(Node root) {
		if(root == null) {
			return 0;
		}
		return getHeight(root.left) - getHeight(root.right);
	}
	
	public static Node leftRotate(Node x) {
		Node y = x.right;
        Node T2 = y.left;
 
        // Perform rotation
        y.left = x;
        x.right = T2;
 
        //  Update heights
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
 
        // Return new root
        return y;
	}
	
	public static Node rightRotate(Node x) {
		Node y = x.left;
        Node T2 = y.right;
 
        // Perform rotation
        y.right = x;
        x.left = T2;
 
        // Update heights
        x.height = Math.max(getHeight(x.left), getHeight(x.right)) + 1;
        y.height = Math.max(getHeight(y.left), getHeight(y.right)) + 1;
 
        // Return new root
        return y;
	}
	
	public static Node insertValue(Node root,int value) {
		Node newNode = newNode(value);
		//perform normal BST insertion
		if(root == null) {
			root = newNode;
		}
		if(value < root.data) {
			root.left = insertValue(root.left,value);
		} else if(value > root.data) {
			root.right = insertValue(root.right,value);
		} else {
			//dublicates not allowed
			return root;
		}
		
		//calculating the height of the all ancestor nodes of the new node
		root.height = 1 + Math.max(getHeight(root.left),getHeight(root.right));
		
		//get balance of newNode to all ancestor nodes
		int balance = getBalance(root);
		
		// If this node becomes unbalanced, then there are 4 cases Left
		// Left Case also called RR rotation
        if (balance > 1 && value < root.left.data)
            return rightRotate(root);
 
        // Right Case also called LL rotation
        if (balance < -1 && value > root.right.data)
            return leftRotate(root);
 
        // Left Right Case also called LR rotation
        if (balance > 1 && value > root.left.data) {
        	root.left = leftRotate(root.left);
            return rightRotate(root);
        }
 
        // Right Left Case also called RL rotation
        if (balance < -1 && value < root.right.data) {
        	root.right = rightRotate(root.right);
            return leftRotate(root);
        }
 
        /* return the (unchanged) node pointer */
        return root;
	}
	
	public static void printInorder(Node root) {
		if(root!=null) {
			printInorder(root.left);
			System.out.print(root.data+ "{" +root.height+ "} ");
			printInorder(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {42,33,55,21,39,41};
		//int[] arr = {10,5,20,30,40,25};
		for(int i=0; i<arr.length; i++) {
			root = insertValue(root,arr[i]);
		}
		printInorder(root);
		System.out.println();
	}
}

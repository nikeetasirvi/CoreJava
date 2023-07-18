package week7.binarytree;

import java.util.Scanner;

public class FindLeftSkewInBST {

	static Node root = null;
	static Scanner input = new Scanner(System.in);
	
	public static class Node {
		private int data;
		private Node right;
		private Node left;
	}
	
	public static Node newNode(int value) {
		Node newNode = new Node();
		newNode.data = value;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
	
	public static Node insertValue(Node root,int value) {
		Node newNode = newNode(value);
		if(root == null) {
			root = newNode;
		} else if(value < root.data) {
			root.left = insertValue(root.left,value);
		} else if(value > root.data) {
			root.right = insertValue(root.right,value);
		}
		return root;
	}
	
	public static void leftSkew(Node root) {
		if(root != null) {
			System.out.print(root.data+ " ");
			leftSkew(root.left);
		}
	}
	
	public static void printInorder(Node root) {
		if(root!=null) {
			printInorder(root.left);
			System.out.print(root.data+ " ");
			printInorder(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {67, 55, 76, 89, -21, 12, -20, 38, 75};
		for(int i=0; i<arr.length; i++) {
			root = insertValue(root,arr[i]);
		}
		printInorder(root);
		System.out.println();
		leftSkew(root);
	}
}

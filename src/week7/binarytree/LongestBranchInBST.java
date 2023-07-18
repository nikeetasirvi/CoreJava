package week7.binarytree;

import java.util.Scanner;

public class LongestBranchInBST {

	static Node root = null;
	static Scanner input = new Scanner(System.in);

	public static class Node {
		private int data;
		private int height;
		private Node left;
		private Node right;
	}

	public Node newNode(int value) {
		Node newNode = new Node();
		newNode.data = value;
		newNode.height = 0;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}

	public int getHeight(Node node) {
		if(node == null) {
			return 0;
		}
		return node.height;
	}
	
	public int getBalanceFactor(Node node) {
		if(node == null) {
			return 0;
		}
		return getHeight(node.left) - getHeight(node.right);
	}
	
	public Node insertValue(Node root, int value) {
		Node newNode = newNode(value);
		if (root == null) {
			root = newNode;
		}
		if (value < root.data) {
			root.left = insertValue(root.left, value);
		} else if (value > root.data) {
			root.right = insertValue(root.right, value);
		} else {
			//dublicates not allowed
			return root;
		}
		root.height = 1 + Math.max(getHeight(root.left),getHeight(root.right));
		
		return root;
	}
	
	public void findLongestBranch(Node root) {
		System.out.print(root.data+ " ");
		if(root.left == null && root.right == null) {
			return;
		}
		if(root.left!=null && root.right!=null) {
			if(root.right.height > root.left.height) {
				findLongestBranch(root.right);
			} else if(root.left.height >= root.right.height) {
				findLongestBranch(root.left);
			}
		} else if(root.right!=null) {
			findLongestBranch(root.right);
		} else {
			findLongestBranch(root.left);
		}
	}

	public void printInorder(Node root) {
		if (root != null) {
			printInorder(root.left);
			System.out.print(root.data + " ");
			printInorder(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestBranchInBST lb = new LongestBranchInBST();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of values");
		int num = input.nextInt();
		int value;
		
		for(int i=1; i<=num; i++) {
			System.out.println("Enter value " +i);
			value = input.nextInt();
			root = lb.insertValue(root,value);
		}
		System.out.println("\nPrint Inorder");
		lb.printInorder(root);
		System.out.println();
		
		System.out.println("\nlongest branch is");
		lb.findLongestBranch(root);
	}

}

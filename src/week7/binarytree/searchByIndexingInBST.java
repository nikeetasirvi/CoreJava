package week7.binarytree;

import java.util.Scanner;

public class searchByIndexingInBST {

	static class Node {
		int key, refId;
		Node left, right;
	}

	static Node newNode(int data, int referenceId) {
		Node temp = new Node();

		temp.key = data;
		temp.refId = referenceId;

		temp.left = null;
		temp.right = null;

		return temp;
	}

	public Node insert(Node node, int key, int referenceId) {

		if (node == null) {
			return (newNode(key, referenceId));
		}

		if (key < node.key)
			node.left = insert(node.left, key, referenceId);
		else if (key > node.key)
			node.right = insert(node.right, key, referenceId);
		else {
			// Duplicate keys not allowed
			System.out.println("Cannot insert unique identification column value as it already exists!!!");
			return node;
		}
		return node;
	}

	public void search(Node node, int key) {
		node = search_Recursive(node, key);
		if (node != null) {
			System.out.println("Memory location of the given unique column value is: " + node.refId + "\n");
		} else {
			System.out.println("No search record exists!!!\n");
		}
	}

	public Node search_Recursive(Node root, int key) {
		// when root is null or key is present at root
		if (root == null || root.key == key) {
			return root;
		}
		// when value is greater than root's key
		if (root.key > key)
			return search_Recursive(root.left, key);
		// when value is less than root's key
		return search_Recursive(root.right, key);
	}

	public void Inorder(Node root) {
		if (root == null)
			return;
		else {
			Inorder(root.left);
			System.out.print(root.key + "{" + root.refId + "} ");
			Inorder(root.right);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int value, referenceId, ch = -1;

		searchByIndexingInBST dbIndexingWithBST = new searchByIndexingInBST();

		Node root = null;

		while (ch != 0) {
			System.out.println("Enter your choice.\n1. Insert\n2. Find memory location\n3. Print\n0. Exit");
			ch = sc.nextInt();

			switch (ch) {

			case 0:
				ch = 0;
				System.out.println("program completed successfully!!!");
				break;

			case 1:
				System.out.println("\nInsert value: ");
				value = sc.nextInt();

				System.out.println("\nInsert memory location for the value: ");
				System.out.println("(Every memory location is unique, which is given by the database.Hence enter unique number)");
				referenceId = sc.nextInt();

				root = dbIndexingWithBST.insert(root, value, referenceId);
				break;

			case 2:
				System.out.println("Enter value to find memory location");
				value = sc.nextInt();
				dbIndexingWithBST.search(root, value);
				break;

			case 3:
				System.out.println("Inorder");
				dbIndexingWithBST.Inorder(root);
				System.out.println("\n");
				break;

			default:
				System.out.println("Invalid Input!!\n");
			}
		}
		sc.close();
	}
}

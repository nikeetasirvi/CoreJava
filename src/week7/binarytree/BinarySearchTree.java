package week7.binarytree;

import java.util.Scanner;

public class BinarySearchTree {

	static Node root = null;
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
	
	public Node insertValue(Node root,int value) {
		Node newNode = newNode(value);
//		if(root==null) {
//			root = newNode;
//		} else {
//			Node x = root;
//			Node y = null;
//			while(x!=null) {
//				y=x;
//				if(value < x.data) {
//					x = x.left;
//				} else if(value > x.data) {
//					x = x.right;
//				} else {
//					//value is == x.data
//					System.out.println("value already exists");
//				}
//			}
//			if(value < y.data) {
//				y.left = newNode;
//			} else if(value > y.data) {
//				y.right = newNode;
//			}
//		}
		if(root == null) {
			root = newNode;
		} else if(value < root.data) {
			root.left = insertValue(root.left,value);
		} else if(value > root.data) {
			root.right = insertValue(root.right,value);
		}
		return root;
	}
	
	public boolean searchValue(Node root,int value) {
	    if(root == null) {
	        return false;
	    }
	    if(root.data == value) {
	        return true;
	    }
	    if(value < root.data) {
	        return searchValue(root.left,value);
	    } else {
	        return searchValue(root.right,value);
	    }
	}

	public Node deleteValue(Node root,int value) {
		if(value < root.data) {
			root.left = deleteValue(root.left,value);
		} else if (value > root.data){
			root.right = deleteValue(root.right,value);
		} else {
			//weather value not found and we got null or value found and we get that value root
			
			//node we want to delete have one child or no child
			if(root.left == null) {
				return root.right;
			} else if(root.right == null) {
				return root.left;
			}
			
			//node we want to delete have 2 children
			//we will find inorder successor(min value in right subtree) or inorder predecessor(max value in left subtree)
			root.data = minValue(root.right); // we are going for inorder successor
			
			//delete the Inorder successor
			root.right = deleteValue(root.right,root.data);
		}
		return root;
	}
	
	public int minValue(Node root) {
		// initially minval = root
		int minval = root.data;
		// find minval
		while (root.left != null) {
			// we are taking leftmost bacause the inorder successor will be there only
			minval = root.left.data;
			root = root.left;
		}
		return minval;
	}

	public int height(Node root) {
		if(root == null) {
			return 0;
		} else {
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);
			if(leftHeight > rightHeight) {
				return leftHeight+1; // cannot use ++ because ++ returns old value and then increments it 
			} else {
				return rightHeight+1;
			}
		}
	}
	
	public void printInorder(Node root) {
		// when we print BST in Inorder we get whole tree in ascending order
		if(root!=null) {
			printInorder(root.left);
			System.out.print(root.data+ " ");
			printInorder(root.right);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		int option;
		while(true) {
			System.out.println("------------------------------");
			System.out.println("Enter your option");
			System.out.println("0:Exit");
			System.out.println("1:Insert");
			System.out.println("2:Delete");
			System.out.println("3:Search");
			System.out.println("4:Find Height of Tree");
			System.out.println("5:Print Binary Search Tree");
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
					root = bst.insertValue(root,value);
				} else {
					System.out.println("Enter corrent value to be inserted");
				}
				break;
			}
			case 2:{
				if(root!=null) {
					System.out.println("Enter the value to be deleted");
					int value = input.nextInt();
					if(value!=0) {
						if(bst.searchValue(root,value)) {
							root = bst.deleteValue(root,value);
							System.out.println("Deleted successfully");
						}
					} else {
						System.out.println("Enter proper value to be deleted");
					}
				} else {
					//System.out.println("Tree is empty");
				}
				break;
			}
			case 3:{
				if(root!=null) {
					System.out.println("Enter value to be searched");
					int value = input.nextInt();
					if(value!=0) {
						if(bst.searchValue(root,value)) {
							System.out.println("Value found");
						} else {
							System.out.println("Value not found");
						}
					} else {
						System.out.println("Enter correct value to be searched");
					}
				} else {
					System.out.println("Tree is empty");
				}
				break;
			}
			case 4:{
				if(root!=null) {
					System.out.println(bst.height(root));
				} else {
					System.out.println("Tree is empty");
				}
				break;
			}
			case 5:{
				if(root!=null) {
					bst.printInorder(root);
					System.out.println();
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

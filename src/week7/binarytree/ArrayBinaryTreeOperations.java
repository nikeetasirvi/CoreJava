package week7.binarytree;

import java.util.Scanner;

public class ArrayBinaryTreeOperations {

	private static int[] tree = new int[2];
	private static int[] tempTree;
	private static int i;
	private int size,newValue,key,index;
	
	static Scanner input = new Scanner(System.in);
	
	public void insertValue() {
		System.out.println("Enter size");
		size = input.nextInt();
		tree = new int[size+1];
		for(i=1; i<=size; i++) {
			System.out.println("Enter value " +i);
			newValue = input.nextInt();
			if(newValue!=0) {
				tree[i] = newValue;
			} else {
				System.out.println("Cannot enter 0 value");
				i--;
			} 
		}
		i--;
	}

	public void insertNewValue() {
		System.out.println("Enter size");
		size = input.nextInt();
		if(i+size+1 > tree.length) {
			tempTree = new int[tree.length];
			System.arraycopy(tree,0,tempTree,0,tree.length);
			tree = new int[i+size+1];
			System.arraycopy(tempTree,0,tree,0,tempTree.length);
			for(int j=i+1; j<tree.length; j++) {
				System.out.println("Enter value " +j);
				newValue = input.nextInt();
				if(newValue!=0) {
					tree[j] = newValue;
					i++;
				} else {
					System.out.println("Cannot enter 0 value");
					j--;
				}
			}
		}
	}
	
	public void deleteValue() {
		System.out.println("Enter the value to be deleted");
		key = input.nextInt();
		if(key!=0) {
			index = searchIndex(key);
			if(index!=-1) {
				if(index == i) {
					tree[i] = 0;
					i--;
				} else {
					tree[index] = tree[i];
					tree[i] = 0;
					i--;
				}
				System.out.println("Successfully deleted");
			} else {
				System.out.println("Value is not present in tree");
			}
		} else {
			System.out.println("Enter valid value to be deleted");
		}
	}
	
	public int searchIndex(int key) {
		for(int j=1; j<=i; j++) {
			if(tree[j] == key) {
				return j;
			}
		}
		return -1;
	}
	
	public void print() {
		System.out.println("Binary tree with root " +tree[1]);
		for(int j=1; j<=i; j++) {
			System.out.print(tree[j]+ " ");
		}
		System.out.println();
	}
	
	public void printInorder(int index) {
	    if (index <= i) {
	        printInorder(index * 2);
	        System.out.print(tree[index] + " ");
	        printInorder(index * 2 + 1);
	    }
	}
	
	public void printPreorder(int index) {
	    if (index <= i) {
	    	System.out.print(tree[index] + " ");
	        printPreorder(index * 2);
	        printPreorder(index * 2 + 1);
	    }
	}
	
	public void printPostorder(int index) {
	    if (index <= i) {
	        printPostorder(index * 2);
	        printPostorder(index * 2 + 1);
	        System.out.print(tree[index] + " ");
	    }
	}
	
	public void printFamily() {
		for(int j=i; j>=1; j--) {
			if(tree[j]!=0) {
				System.out.println("Parent of " +tree[j]+ " is " +tree[j/2]);
				if(j*2 <= i) {
					System.out.println("Left child of " +tree[j]+ " is " +tree[j*2]);
				}
				if(j*2+1 <= i) {
					System.out.println("Right child of " +tree[j]+ " is " +tree[j*2+1]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayBinaryTreeOperations abto = new ArrayBinaryTreeOperations();
		
		int option;

		while(true) {
			System.out.println("------------------------------");
			System.out.println("Enter your option");
			System.out.println("0:Exit");
			System.out.println("1:Insert");
			System.out.println("2:Delete");
			System.out.println("3:Print Binary Tree");
			System.out.println("4:print Family");
			System.out.println("------------------------------");
			option = input.nextInt();
			if(option == 0) {
				System.out.println("Thank you...!!!");
				break;
			}
			switch(option) {
				case 1:{
					if(tree[1] == 0) {
						abto.insertValue();
					} else {
						abto.insertNewValue();
					}
					break;
				}
				case 2:{
					if(tree[1] != 0) {
						abto.deleteValue();
					} else {
						System.out.println("Tree is Empty");
					}
					break;
				}
				case 3:{
					if(tree[1]!=0) {
						abto.print();
						System.out.println("Inorder");
						abto.printInorder(1);
						System.out.println("\nPreorder");
						abto.printPreorder(1);
						System.out.println("\nPostorder");
						abto.printPostorder(1);
						System.out.println();
					} else {
						System.out.println("Tree is empty");
					}
					break;
				}
				case 4:{
					abto.printFamily();
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

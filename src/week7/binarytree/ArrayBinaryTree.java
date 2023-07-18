package week7.binarytree;

import java.util.Scanner;

public class ArrayBinaryTree {

	private int[] tree;
	private int size;
	private int i;
	
	public void insertValue() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of tree");
		size = input.nextInt();
		tree = new int[size+1];
		for(i=1; i<=size; i++) {
			System.out.println("Enter value " +i);
			tree[i] = input.nextInt();
		}
		i--;
		print();
	}
	
	public void print() {
		System.out.println("Binary tree with root " +tree[1]);
		for(int j=1; j<=i; j++) {
			System.out.print(tree[j]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayBinaryTree abt = new ArrayBinaryTree();
		abt.insertValue();
	}

}
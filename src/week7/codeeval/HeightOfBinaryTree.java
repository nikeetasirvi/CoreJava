package week7.codeeval;

import java.util.Scanner;

public class HeightOfBinaryTree {

	static Scanner input = new Scanner(System.in);
	private int[] tree;
	private static int size,i,newValue;

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
	
	public void height() {
		//when the tree is complete binary tree
		int height=0;
		for(int j=i; j>1; j=j/2) {
			height++;
		}
		System.out.println(height);
	}
	
	public void print() {
		System.out.println("Binary tree with root " +tree[1]);
		for(int j=1; j<=i; j++) {
			System.out.print(tree[j]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeightOfBinaryTree ht = new HeightOfBinaryTree();
		ht.insertValue();
		ht.print();
		ht.height();
	}

}

package week7.codeeval;

import java.util.Arrays;
import java.util.Scanner;

public class SumTree {
	
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
	
	public void sum() {
		int sum=0;
		int[] parents = new int[20];
		Arrays.fill(parents,0);
		if(i%2 == 0) {
			parents[i/2] = tree[i/2];
			tree[i/2] = tree[i];
			for(int j=i/2-1; j>=1; j--) {
				parents[j] = tree[j];
				sum = tree[j*2] + tree[j*2+1] + parents[j*2] + parents[j*2+1];
				tree[j] = sum;
			}
		} else {
			for(int j=i/2; j>=1; j--) {
				parents[j] = tree[j];
				sum = tree[j*2] + tree[j*2+1] + parents[j*2] + parents[j*2+1];
				tree[j] = sum;
			}
		}
		for(int j=i/2+1; j<=i; j++) {
			tree[j] = 0;
		}
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
	
	public static void main(String[] args) {
		SumTree st = new SumTree();
		st.insertValue();
		st.print();
		st.sum();
		st.print();
		st.printInorder(1);
	}
	
}

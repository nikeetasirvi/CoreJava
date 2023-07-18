package week7.codeeval;

import java.util.Scanner;

public class CheckIfMinHeap {

	static Scanner input = new Scanner(System.in);
	private int[] tree;
	private static int size,i,newValue;

	public void insertValue() {
		System.out.println("Enter size");
		size = input.nextInt();
		if(size == 0){
            System.out.println("invalid input");
        } else{
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
        	print();
        	checkMinHeap();
        }
	}
	
	public void checkMinHeap() {
		int min;
		if(i%2 == 0) {
			//last node is at left branch
			if(tree[i] < tree[i/2]) {
				System.out.println("The given binary tree is NOT a min-heap");
				return;
			}
			for(int j=i-1; j>1; j=j-2) {
				min = tree[j]<tree[j-1] ? j : j-1;
				if(tree[min] < tree[j/2]) {
					System.out.println("The given binary tree is NOT a min-heap");
					return;
				}
			}
		} else {
			//last node is at right branch
			for(int j=i; j>1; j=j-2) {
				min = tree[j]<tree[j-1] ? j : j-1;
				if(tree[min] < tree[j/2]) {
					System.out.println("The given binary tree is NOT a min-heap");
					return;
				}
			}
		}
		System.out.println("The given binary tree is a min-heap");
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
		CheckIfMinHeap mp = new CheckIfMinHeap();
		mp.insertValue();
	}

}

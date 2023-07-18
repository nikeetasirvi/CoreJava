package week7.binarytree;

import java.util.Scanner;

public class MinHeap {

	private static int[] arr;
	private static int i;
	private int size,newValue;
	static Scanner input = new Scanner(System.in);
	
	public void insertValue() {
		System.out.println("Enter size");
		size = input.nextInt();
		arr = new int[size+1];
		for(i=1; i<=size; i++) {
			System.out.println("Enter value " +i);
			newValue = input.nextInt();
			if(newValue!=0) {
				arr[i] = newValue;
				//checking condition of min heap with every precedent parent
				int j=i;
				while(j>1) {
					if(arr[j] < arr[j/2]) {
						int temp = arr[j];
						arr[j] = arr[j/2];
						arr[j/2] = temp;
					}
					j=j/2;
				}
			} else {
				System.out.println("Enter correct value");
				i--;
			}
		}
		i--;
	}
	
	public void deleteValue() {
		int deletedValue = arr[1];
		arr[1] = arr[i];
		i--;
		
		int j = 1;
		while(j<i) {
			if(j*2>i && j*2+1>i) {
				//if parent has no single child to compare with
				break;
			} else {
				/*
				 * if parent have one or two child to compare with
				 * when two child are there we can find swapIndex, but when
				 * single child is there then the single child value will be compared with
				 * the arr[j*2+1] which is the same value as arr[j] because when in starting we 
				 * deleted the root node we just changed the root node to last 
				 * value but we did not change the last value place to 0, 
				 * so it still conatins the last value which is same as arr[j],
				 * so it doesnt matter
				 */
				int swapIndex = arr[j*2]<arr[j*2+1] ? (j*2) : (j*2+1); // comparing two childs that which one is small
				if(arr[j] > arr[swapIndex]) { // now comparing the small value child to the parent
					int temp = arr[j];
					arr[j] = arr[swapIndex];
					arr[swapIndex] = temp;
				}
				j=swapIndex;
			}
		}
		arr[i+1] = deletedValue; //here we are changing the previous last value to the deleted value
	}
	
	public void print() {
		if(i!=0) {
			System.out.print("Tree looks like: ");
			for(int j=1 ;j<=i; j++) {
				System.out.print(arr[j]+ " ");
			}
			System.out.println();
		} else {
			System.out.println("Tree is empty");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap mh = new MinHeap();
		mh.insertValue();
		mh.print();
		mh.deleteValue();
		mh.print();
		// when we delete all elements from Min heap and add them in the same array from back side,the array automatically gets sorted in descending order
		//and when we put all the deleted values in some new array from starting in gets sorted in ascending order
	}

}

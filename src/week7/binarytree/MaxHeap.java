package week7.binarytree;

import java.util.Arrays;
import java.util.Scanner;

//method1:when values are added they are been checked for min heap property and then added at right place to create min heap tree
//method2:but when we are given whole tree which is not in min heap format we need to change the whole tree into min heap tree(check ConvertIntoMinHeap program)

//whether we take first method or second method, after that we need to apply delete method on all emements and make tree empty to do heap sort
public class MaxHeap {

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
				
				int j=i;
				while(j>1) {
					if(arr[j] > arr[j/2]) {
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
				break;
			} else {
				int swapIndex = arr[j*2]>arr[j*2+1] ? (j*2) : (j*2+1); 
				if(arr[j] < arr[swapIndex]) {
					int temp = arr[j];
					arr[j] = arr[swapIndex];
					arr[swapIndex] = temp;
				}
				j=swapIndex;
			}
		}
		arr[i+1] = deletedValue;
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
		MaxHeap mh = new MaxHeap();
		mh.insertValue(); //insert 5 elements to see the sorting
		mh.print();
		mh.deleteValue();
		mh.print();
		mh.deleteValue();
		mh.print();
		mh.deleteValue();
		mh.print();
		mh.deleteValue();
		mh.print();
		mh.deleteValue();
		mh.print();
		// when we delete all elements from Max heap and add them in the same array from back side,the array automatically gets sorted in ascending order
		//and when we put all the deleted values in some new array from starting in gets sorted in descending order
		System.out.println(Arrays.toString(arr));
	}

}

package week4_5.searching_sorting;

import java.util.Scanner;

public class BinarySearchInRotatedArray {

	int[] array;

	public BinarySearchInRotatedArray(int[] array) {
		this.array = array;
	}

	public int searchPivotLinear() {
		int pivotIndex = -1;
		if (array.length == 1) {
			return pivotIndex;
		}
		int firstElement = array[0];
		int lastElement = array[array.length - 1];
		if (firstElement < lastElement) {
			// Array has not undergone rotation
			return pivotIndex;
		}
		for (int index = 0; index < (array.length -1); index ++) {
			int currentElementValue = array[index];
			int nextElementValue = array[index + 1];
			if (nextElementValue < currentElementValue) {
				pivotIndex = index + 1;
				break;
			}
		}
		return pivotIndex;
	}

	public int searchPivotBinary() {
		int pivotIndex = -1;
		if (array.length == 1) {
			return pivotIndex;  // -1 will be returned if single element there in array
		}
		if (array[0] < array[array.length - 1]) {
			// Array has not undergone rotation
			return pivotIndex; // -1 will be returned if array is not rotated
		}
		int start = 0;
		int end = (array.length - 1);
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid + 1] < array[mid]) {
				return (mid + 1); // pivotIndex will be returned if array is rotated
			}else if (array[start] <= array[mid]) {
				// Left array is sorted, i.e., pivot present on Right side array
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return 0;
	}

	public static void binarySearch(int arr[], int start, int end,int key) {
		if(start > end){
			System.out.println("Number cant be found");
			return;
		}
		int mid = start + (end - start)/2;
		if(arr[mid] == key){
			System.out.println("Element found at index " +mid);
		} else if(arr[mid] > key){
			binarySearch(arr,start,mid-1,key);
		} else{
			binarySearch(arr,mid+1,end,key);
		}
	}

	public static void pivotedBinarySearch(int arr[],int n,int key,int pivotIndex) {
		if (pivotIndex == -1) {
			binarySearch(arr, 0, n, key);
			return;
		}
		if (arr[pivotIndex] == key) {
			System.out.println("Element found at index " +pivotIndex);
		} else if (arr[0] <= key) {
			binarySearch(arr, 0, pivotIndex-1, key);
		} else {
			binarySearch(arr, pivotIndex+1, n, key);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int[] array = {23, 27, 36, 39, 45, 9, 18, 20};
		BinarySearchInRotatedArray pivotSearcher = new BinarySearchInRotatedArray(array);
		int pivotIndex = pivotSearcher.searchPivotBinary();
		System.out.println("pivot is " +pivotIndex);
		System.out.println("Enter the number to be searched");
		int key = input.nextInt();
		pivotedBinarySearch(array,array.length-1,key,pivotIndex);
	}

}

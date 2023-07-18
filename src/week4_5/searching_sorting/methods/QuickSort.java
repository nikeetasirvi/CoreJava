package week4_5.searching_sorting.methods;

import java.util.Arrays;

public class QuickSort {

	public static int divide(int[] arr,int start,int end) {
		int pivot = arr[end];
		int i = start-1;
		for(int j=start; j<end; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		return i;
	}
	
	public static void quickSort(int[] arr,int start,int end) {
		if(start  < end) {
			int pivotIndex = divide(arr,start,end);
			System.out.println(Arrays.toString(arr));
			quickSort(arr,start,pivotIndex-1);
			quickSort(arr,pivotIndex+1,end);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {50,60,80,40,30,70,10,90,20};
		quickSort(arr,0,arr.length-1);
		
		//print
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

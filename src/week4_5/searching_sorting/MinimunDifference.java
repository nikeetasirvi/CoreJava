package week4_5.searching_sorting;

import java.util.Scanner;

import week4_5.searching_sorting.methods.MergeSort;

public class MinimunDifference extends MergeSort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of horses");
		int numberOfHorses = input.nextInt();
		int[] arr = new int[numberOfHorses];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		divide(arr,0,arr.length-1); // merge sort
		
		System.out.println("The sorted array is");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int min = arr[arr.length-1];
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i+1] - arr[i] < min) {
				min = arr[i+1] - arr[i];
			}
		}
		System.out.println("The minimun difference between the speed of horses is: " +min);
		
		input.close();
	}

}

package week4_5.searching_sorting;

import java.util.Scanner;

import week4_5.searching_sorting.methods.QuickSort;

public class SumOfHighestTwo extends QuickSort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		int num = input.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		quickSort(arr,0,arr.length-1); // quick sort
		
		int sum = arr[arr.length-1] + arr[arr.length-2];
		System.out.println("The sum of 2 highest is: " +sum);
		
		input.close();
	}

}

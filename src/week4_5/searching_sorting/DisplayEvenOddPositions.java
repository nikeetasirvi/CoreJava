package week4_5.searching_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class DisplayEvenOddPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = input.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr); // inbuilt sorting algorithm (uses quick sort)
		
		System.out.println("The sorted array is");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("The odd positions in array are");
		for(int i=0; i<arr.length; i=i+2) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("The even positions in array are");
		for(int i=1; i<arr.length; i=i+2) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		input.close();
	}

}

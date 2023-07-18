package week6.codeeval.queue;

import java.util.Scanner;

public class ReverseFirstKElemets {

	public static void reverseFirstKElemets(int[] arr,int n,int subLength) {
		int[] stack = new int[subLength];
		int currentPointer = -1;
		
		for(int i=0; i<subLength; i++) {
			stack[i] = arr[i];
			currentPointer++;
		}
		for(int i=0; currentPointer>=0; i++) {
			arr[i] = stack[currentPointer];
			currentPointer--;
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Enter size");
		int n = input.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter values");
		for(int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println("Enter subarray length");
		int subLength = input.nextInt();

		reverseFirstKElemets(arr,n,subLength);
	}

}

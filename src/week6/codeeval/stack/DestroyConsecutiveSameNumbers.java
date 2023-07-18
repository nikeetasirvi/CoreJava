package week6.codeeval.stack;

import java.util.Scanner;
import java.util.Stack;

public class DestroyConsecutiveSameNumbers {

	public static void removeConsecutiveSameElements(int[] arr,int n) {
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<n; i++) {
			if(!stack.isEmpty() && stack.peek() == arr[i]) {
				stack.pop();
			} else {
				stack.push(arr[i]);
			}
		}
		System.out.println(stack.size());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter size");
		int n = input.nextInt();
		int[] arr = new int[n];
		
		System.out.println("enter values");
		for(int i=0; i<n; i++) {
			arr[i] = input.nextInt();
		}
		
		removeConsecutiveSameElements(arr,n);
	}

}

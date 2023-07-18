package week6.codeeval.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NearestSmallestValue {
	
	public static int[] nearestSmallestNumber(int[] arr,int n) {
		int[] result = new int[n];
		Arrays.fill(result, -1); // fill the whole array with values -1;
		Stack<Integer> stack = new Stack<>();
		
		for (int i = n-1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (!stack.empty()) {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int n = input.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter values");
		for(int i=0; i<n; i++) {
			arr[i] = input.nextInt(); 
		}
		
		int[] result = nearestSmallestNumber(arr,n);
		for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
	}
}

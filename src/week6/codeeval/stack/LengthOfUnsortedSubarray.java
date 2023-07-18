package week6.codeeval.stack;

import java.util.Scanner;
import java.util.Stack;

public class LengthOfUnsortedSubarray {
	
	public static int findUnsortedSubarray(int[] arr,int n) {
		int start=-1,end=-1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        System.out.println(min+ " " +max);
		Stack<Integer> stack = new Stack<>();
		
		// find the first element from left that is out of order
		for(int i=0; i<n; i++) {
			if(!stack.isEmpty() && stack.peek() > arr[i]) {
				start = i-1;
				stack.clear();
				break;
			}
			stack.push(arr[i]);
		}
		
		// find the first element from right that is out of order
		for(int i=n-1; i>=0; i--) {
			if(!stack.isEmpty() && stack.peek() < arr[i]) {
				end = i+1;
				stack.clear();
				break;
			}
			stack.push(arr[i]);
		}
		
		//is the array is already sorted
		if(start==-1)
			return 0;

		/* for example arr = 1,5,4,0,2,3
		 * here we can get 5 and 0 as unsorted part by above code but actually this is not right
		 * hence we need the below code as well
		 */
		
		// find the minimum and maximum values in the unsorted subarray
		for (int i = start; i <= end; i++) {
	        min = Math.min(min, arr[i]);
	        max = Math.max(max, arr[i]);
	    }
		
		// expand the unsorted subarray to include any additional out of order elements
		while (start > 0 && arr[start - 1] > min) {
	        start--;
	    }
	    while (end < n - 1 && arr[end + 1] < max) {
	        end++;
	    }
        
		return (end-start)+1;
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
		
		System.out.println(findUnsortedSubarray(arr,n));
	}
}

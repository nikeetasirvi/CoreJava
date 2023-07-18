package week6.codeeval.queue;

import java.util.Scanner;

public class SumOfMinMaxOfAllSubarrayOfSizeK {

	public static int SumOfMinMaxOfAllSubarray(int[] arr,int n,int subLength) {
		
		int start=-1,end=-1;
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		int total = 0;
		
		for(int i=0; end!=n-1; i++) {
			start = i;
			end = start+subLength-1;
			for(int j=start; j<=end; j++) {
				if(arr[j] < min) {
					min = arr[j];
				}
				if(arr[j] > max) {
					max = arr[j];
				}
			}
			total += max+min;
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
		}
		return total;
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
		
		System.out.println(SumOfMinMaxOfAllSubarray(arr,n,subLength));
	}

}

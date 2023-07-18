package week6.codeeval.queue;

import java.util.Scanner;

public class FirstNegativeOfSubarray {

	public static void firstNegativeOfSubarray(int[] arr,int n,int subLength) {
		int start=-1,end=-1;
		boolean flag = false;
		
		for(int i=0; end!=n-1; i++) {
			start = i;
			end = start+subLength-1;
			for(int j=start; j<=end; j++) {
				if(arr[j] < 0) {
					flag = true;
					System.out.print(arr[j]+ " ");
					break;
				}
			}
			if(!flag) {
				System.out.print("0 ");
			}
			flag = false;
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

		firstNegativeOfSubarray(arr,n,subLength);
	}

}

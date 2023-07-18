package week6.codeeval.queue;

import java.util.*;

public class EveryInputMedian {

	static public int[] solve(int[] A, int n) {

//		int ans[] = new int[n];
//		for(int rear=0; rear<n; rear++) {
//			ans[rear] = A[rear/2];
//		}
//		return ans;
		
		
		//the above same code can be written like this also hence, both are same
		int front=0,rear;
		int ans[] = new int[n];
		for(int i=0; i<n; i++) {
			rear = i;
			int mid = front+(rear-front)/2;
			ans[i] = A[mid];
		}
		return ans;
		
	}

	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		int n = in.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter values");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		
		int[] ans = solve(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(ans[i]+" ");
		}

	}
}
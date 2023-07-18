package week7.strings;

public class MiddleIndexBothEndsSumEqual {

	public static int findMiddleIndex(int[] arr) {
		int rightSum = 0;
		int leftSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			rightSum += arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			leftSum += arr[i];
			rightSum -= arr[i];
			if(leftSum == rightSum) {
				return i;
			}	
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,50};
		int ans = findMiddleIndex(arr);
		if(ans != -1) {
			System.out.println("Middle index found at " +ans);
		} else {
			System.out.println("Not Found");
		}
	}

}

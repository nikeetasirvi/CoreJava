package week7.strings;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,2,4,7,5,9,8};
		int n = arr.length;
		
		int sum = ((n+1)*(n+2))/2;
		int sumOfArray = 0;
		
		for(int i=0; i<arr.length; i++) {
			sumOfArray += arr[i];
		}
		
		System.out.println("Missing element is " +(sum-sumOfArray));
	}

}

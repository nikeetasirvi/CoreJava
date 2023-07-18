package week7.strings;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int[] arr = {10,20,30,40,50,60,100,2,5,85};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("min=" +min);
		System.out.println("max=" +max);
	}

}

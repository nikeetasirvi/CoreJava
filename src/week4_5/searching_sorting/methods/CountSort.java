package week4_5.searching_sorting.methods;

public class CountSort {

	public static void countSort(int[] arr) {
		
		int max = maxNumber(arr);
		int[] count = new int[max+1];
		int[] b = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			++count[arr[i]];
		}
		for(int i=1; i<count.length; i++) {
			count[i] = count[i] + count[i-1];
		}
		for(int i=arr.length-1; i>=0; i--) {
			b[--count[arr[i]]]= arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = b[i];
		}
	}
	
	public static int maxNumber(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
		countSort(arr);
		
		//print
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}

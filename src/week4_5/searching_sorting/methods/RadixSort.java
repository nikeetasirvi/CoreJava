package week4_5.searching_sorting.methods;

public class RadixSort {

	public static void radixSort(int[] arr) {
		int max = maxNumber(arr);
		for(int pos=1; max/pos>0 ; pos=pos*10) {
			count(arr,pos);
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
	public static void count(int[] arr,int pos) {
		int[] count = new int[10];
		int[] b = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			++count[(arr[i]/pos)%10];
		}
		for(int i=1; i<count.length; i++) {
			count[i] = count[i] + count[i-1];
		}
		for(int i=arr.length-1; i>=0; i--) {
			b[--count[(arr[i]/pos)%10]]= arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			arr[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {432,8,530,90,88,231,11,45,677,199};
		radixSort(arr);
		
		//print
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}

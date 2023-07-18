package week7.strings;

public class Top2Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,90,40,30,1000,2,1};
		
		int max=-1;
		int secondMax=-1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
		}
		System.out.println(max+ "," +secondMax);
	}

}

package week7.strings;

public class MoveAll0AtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,0,4,0,3,2,1,0,8,0};
		int[] temp = new int[arr.length];
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				temp[j] = arr[i];
				j++;
			}
		}
		arr = temp;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}

package week7.strings;

import java.util.Arrays;

public class ArraysEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,20,3,0,4,50,100};
		int[] arr2 = {10,20,3,0,4,50,100};

		//method1
		System.out.println(Arrays.equals(arr1, arr2));
		
		//method2
		if(arr1.length != arr2.length) {
			System.out.println("not equal");
		} else {
			boolean isEqual = true;
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i] != arr2[i]) {
					System.out.println("Not equal");
					isEqual = false;
					break;
				}
			}
			if(isEqual) {
				System.out.println("Equal");
			}
		}
	}

}

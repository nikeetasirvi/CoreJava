package week7.strings;

import java.util.Scanner;

public class PairsOfSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Enter the sum");
		int sum = input.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
					System.out.println(arr[i]+ "+" +arr[j]);
				}
			}
		}
		input.close();
	}

}

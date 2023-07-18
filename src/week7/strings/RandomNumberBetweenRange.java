package week7.strings;

import java.util.Scanner;

public class RandomNumberBetweenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		 
		System.out.println("enter starting number");
		int start = input.nextInt();
		System.out.println("enter ending number");
		int end = input.nextInt();
		
		int r = (int)(Math.random()*(end-start+1)+start);
		System.out.println(r);
	}

}

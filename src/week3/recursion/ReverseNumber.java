package week3.recursion;

import java.util.Scanner;

public class ReverseNumber {

	public static int reverseNumber(int Quotient,int Remainder,int IntermediateResult,int TempNumber) {
		if(Quotient == 0) {
			return IntermediateResult;
		}

		Quotient = TempNumber / 10;
		Remainder = TempNumber % 10;

		IntermediateResult = Remainder + (IntermediateResult * 10);

		TempNumber = Quotient;
		return reverseNumber(Quotient,Remainder,IntermediateResult,TempNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to be reversed");
		int Number = input.nextInt();

		int TempNumber = Number;
		int Quotient = -1;
		int Remainder = -1;
		int IntermediateResult = 0;

		IntermediateResult = reverseNumber(Quotient,Remainder,IntermediateResult,TempNumber);

		System.out.println("The reverse number for " + Number + " is " + IntermediateResult);
	}

}

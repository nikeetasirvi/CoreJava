package week3.recursion;

import java.util.Scanner;
public class RecursionSumOfDigits {

    public static int sumOfDigits(int Quotient,int Remainder,int Sum,int TempNumber) {
		if(Quotient == 0) {
			return Sum;
		}

		Quotient = TempNumber / 10;
		Remainder = TempNumber % 10;

		Sum = Remainder + Sum;

		TempNumber = Quotient;
		return sumOfDigits(Quotient,Remainder,Sum,TempNumber);
	}

    public static void main(String[] args) {

        //write your answer here

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
		int Number = input.nextInt();
		int TempNumber = Number;
		int Quotient = -1;
		int Remainder = -1;
		int Sum = 0;

		Sum = sumOfDigits(Quotient,Remainder,Sum,TempNumber);

		System.out.println("The sum of digits is " +Math.abs(Sum)); // to remove nagative sign and make it positive integer
    }
}

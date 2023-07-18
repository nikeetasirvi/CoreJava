package week1.practicequestions;

import java.util.Scanner;

public class NSCInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the investment amount:");
        double principal = sc.nextDouble();

        System.out.println("Enter the number of certificates purchased:");
        int numCertificates = sc.nextInt();

        double interestRate = 0.05; // 5% per year
        double interest = principal * Math.pow(1 + interestRate, numCertificates);

        double taxRate;
        if (interest <= 100000) {
            taxRate = 0.05;
        } else if (interest <= 500000) {
            taxRate = 0.1;
        } else if (interest <= 1000000) {
            taxRate = 0.2;
        } else {
            taxRate = 0.3;
        }
        double tax = interest * taxRate;
        double netInterest = interest - tax;

        System.out.printf("Investment Amount: Rs. %.2f\n", principal);
        System.out.printf("Number of Certificates Purchased: %d\n", numCertificates);
        System.out.printf("Interest Rate: %.2f%%\n", interestRate * 100);
        System.out.printf("Interest Earned: Rs. %.2f\n", interest);
        System.out.printf("Tax Applicable: Rs. %.2f (%.2f%%)\n", tax, taxRate * 100);
        System.out.printf("Net Interest Earned: Rs. %.2f\n", netInterest);

        sc.close();
    }
}

/*
	The formula used here is the compound interest formula:
	A = P * (1 + r/n)^(nt)
	Where:
	
	A = final amount (including interest)
	P = principal (initial investment)
	r = annual interest rate (in decimal form)
	n = number of times interest is compounded per year
	t = time (in years)
	In this case, we have a fixed annual interest rate of 5%, compounded once per year (i.e., n = 1). We also have the number of certificates purchased (numCertificates), which represents the time period for which the investment is held. Therefore, we can simplify the formula to:
	
	A = P * (1 + r)^t
	
	Where:
	
	t = numCertificates (since we're compounding once per year)
	Substituting the values we have:
	
	interest = principal * (1 + 0.05)^numCertificates
	
	This gives us the total interest earned on the investment, assuming no taxes are applicable yet.
*/
package week1.practicequestions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int salary;
		
		while(true) {
			try {
				System.out.println("Enter your salary:");
				salary = input.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Invalid input. Please enter a numeric value for salary.");
                input.next(); // we wrote this so that the previous value of salary is cleared from the buffer
                continue; // we wrote this because we will again print the above line to enter the salary
			}
			
			if(salary<=0) {
				System.out.println("enter valid salary\n");
				continue;
			} else if(salary >=10000 && salary<=15000) {
				System.out.println("Your bonus is: " +salary*0.1);
			} else if(salary >15000 && salary<=25000) {
				System.out.println("Your bonus is: " +salary*0.08);
			} else if(salary>25000) {
				System.out.println("Your bonus is: " +salary*0.06);
			} else {
				System.out.println("Salary not in specified range");
			}
			System.out.println("\nDo you want to calculate bonus for another employee? (y/n)");
            String choice = input.next();

            if (choice.equalsIgnoreCase("n")) {
            	System.out.println("Thank You");
                break;
            }
		}
		input.close();
	}

}

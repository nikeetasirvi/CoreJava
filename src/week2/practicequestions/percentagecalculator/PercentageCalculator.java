package week2.practicequestions.percentagecalculator;

import java.util.Scanner;

public class PercentageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Student student = new Student();
		
		while(true) {
			
			System.out.println("Enter option:");
			System.out.println("1: Calculate percentage");
			System.out.println("2: Update subject marks");
			System.out.println("3: Display marks");
			System.out.println("0: Exit");
			int option = input.nextInt();
			
			if(option == 0) {
				System.out.println("Thank you.....");
				break;
			}
			
			switch(option) {
				case 1:{
					System.out.println("Enter number of subjects:");
					int numSubjects = input.nextInt();
					student.setMarks(numSubjects);
					student.getMarks();
					System.out.println("Percentage is : " +student.calculatePercentage());
					break;
				}
				case 2:{
					if(student.getMarks()) {
						break;
					}
					System.out.println("Enter subject number to change marks:");
					int num = input.nextInt();
					System.out.println("Enter correct marks:");
					int updatedMarks = input.nextInt();
					student.updateMarks(num-1,updatedMarks);
					student.getMarks();
					System.out.println("Percentage is : " +student.calculatePercentage());
					break;
				}
				case 3:{
					student.getMarks();
					break;
				}
				default:{
					System.out.println("Enter correct option");
				}
			}
		}
		input.close();
	}
}
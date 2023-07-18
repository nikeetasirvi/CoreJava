package week2.practicequestions.percentagecalculator;

import java.util.Scanner;

public class Student {
	
	private int[] marks;
	
	Scanner input = new Scanner(System.in);
	
	public void setMarks(int numSubjects) {
		marks = new int[numSubjects];
		for(int i=0; i<numSubjects; i++) {
			System.out.println("Enter marks for subject " +(i+1));
			marks[i] = input.nextInt();
		}
	}
	
	public boolean getMarks() {
		if(marks != null) {
			for(int i=0; i<marks.length; i++) {
				System.out.println("marks for subject " +(i+1)+ " is " +marks[i]);
			}
			return false;
		} else {
			System.out.println("No records to display");
			return true;
		}
	}
	
	public double calculatePercentage() {
		int totalMarks = 0;
		for(int i=0; i<marks.length; i++) {
			totalMarks += marks[i];
		}
		return (totalMarks*100) / (marks.length * 100);
	}
	
	public void updateMarks(int num,int updatedMarks) {
		marks[num] = updatedMarks;
	}
	
	public void displayMarks() {
		
	}
	
}

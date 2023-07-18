package week1.practicequestions;

import java.util.Scanner;

public class SuplementaryMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int numSubjects = 0;
		System.out.println("Enter num of students");
		int numStudents = input.nextInt();
		
		Scores scores = new Scores(numStudents);
		
		for(int i=0; i<numStudents; i++) {
			System.out.println("Num of subjects student " +(i+1)+ " gave");
			numSubjects = input.nextInt();
			scores.setSubjects(i,numSubjects);
			for(int j=1; j<=numSubjects; j++) {
				System.out.println("Enter marks for student " +(i+1)+ " in subject " +(j));
				int marks = input.nextInt();
				scores.setScores(i,j,marks);
			}
		}
		
		for(int i=0; i<numStudents; i++) {
			System.out.printf("Student ");
			for (int j = 0; j < scores.getScores()[i].length; j++) {
			    System.out.print(scores.getScores()[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

class Scores {
	int[][] scores;

	public Scores(int numStudents) {
		scores = new int[numStudents][];
	}
	
	public void setSubjects(int studentNumber,int numSubjects) {
		scores[studentNumber] = new int[numSubjects+1];
	}
	
	public void setScores(int studentNumber,int subjectNumber,int marks) {
		scores[studentNumber][0] = studentNumber+1;
		scores[studentNumber][subjectNumber] = marks;
	}

	public int[][] getScores() {
		return scores;
	}
}

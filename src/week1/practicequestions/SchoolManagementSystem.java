package week1.practicequestions;
import java.util.*;

public class SchoolManagementSystem {
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter no of subjects");
    int numSubjects = input.nextInt();
    input.nextLine();
    
    System.out.println("Enter teacher name:");
    String teacherName = input.nextLine();
    
    Teacher teacher = new Teacher(teacherName);
    
    System.out.println("Enter no of students");
    int numStudents = input.nextInt();
    input.nextLine();
    
    for(int i=1; i<=numStudents; i++){
      System.out.println("Enter name of student " +i);
      String studentName = input.nextLine();
      teacher.addStudent(studentName,numSubjects);
    }
  
    teacher.addMarks(numSubjects,input);
    teacher.displayMarks(numSubjects);
  }
}

class Teacher{
	private String teacherName;
	private ArrayList<Student> students = new ArrayList<>();
	Teacher(String teacherName){
		this.teacherName = teacherName;
	}
	public void addStudent(String studentName, int numSubjects){
		Student student = new Student(studentName,numSubjects);
		students.add(student);
	}
	public void addMarks(int numSubjects,Scanner input) {
		for(int i=0; i<numSubjects; i++) {
			System.out.println("Enter name of subject " +(i+1));
			String subject = input.nextLine();
			for(Student student : students){
				System.out.println("Enter marks for of "+subject+" for student " +student.getStudentName());
				int marks = input.nextInt();
				input.nextLine();
				student.setScores(subject,marks,i);
			}
		}
	}
	public void displayMarks(int numSubjects) {
		System.out.printf("%-10s", "Student"); //-10 means 10 padding space will be given on the right side(10 for left side) of word and s stands for string type
		for(int i=0; i<numSubjects; i++) {
			System.out.printf("%-10s", "Subject " + (i+1));
		}
		System.out.println();
		for(Student student : students) { 
			// will give each student
			System.out.printf("%-10s", student.getStudentName());
			for (int[] score : student.getScores()) {
				
				/*will give all marks in all subjects as {(1,25),(2,56)} so,
				 * we will take each subject marks((1,25)) 1 by 1 in int[] score and
				 * print the score[1] which have marks 25.
				 * if i print score[0] it has the subject index which is 1
				 */
				
				System.out.printf("%-10d", score[1]);
            }
            System.out.println();
		}
	}
}

class Student{
	private String studentName;
	private int[][] scores;
	Student(String studentName, int numSubjects){
		this.studentName = studentName;
		scores = new int[numSubjects][2];
	}
	public String getStudentName() {
		return studentName;
	}
	public void setScores(String subject,int marks,int index) {
		scores[index][0] = index+1;
		scores[index][1] = marks;
	}
	public int[][] getScores() {
		return scores;
	}
}
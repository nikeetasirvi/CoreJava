package selfpractice;

import java.util.Arrays;
import java.util.Comparator;

class CustomComparator implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
		return s1.rollno - s2.rollno; // for ascending and return s2.rollno - s1.rollno; for descending
		
		// write the above single line or else this below code
//		if (s1.rollno == s2.rollno) {
//			return 0;
//		}else if (s1.rollno < s2.rollno) {
//			return -1;
//		}else {
//			return +1;
//		}
	}
	
}

class Student{
	int rollno;
	String name;
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
}

public class ComparatorTutorial {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arr[] = new Student[5];
		arr[0] = new Student(7,"Nikeeta");
		arr[1] = new Student(1,"Bhumi");
		arr[2] = new Student(5,"Lalita");
		arr[3] = new Student(10,"Manoj");
		arr[4] = new Student(6,"Shweta");
		
		Arrays.sort(arr,new CustomComparator());
		
		for(int i=0; i<5; i++) {
			System.out.println(arr[i].rollno+ " " +arr[i].name);
		}
	}

}

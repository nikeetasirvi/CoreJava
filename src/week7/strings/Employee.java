package week7.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub

		int nameComp = e1.getName().compareTo(e2.getName());
		if (nameComp != 0) {
			// if names are different return name comparision
			return nameComp;
		}

		int deptComp = e1.getDepartment().compareTo(e2.getDepartment());
		if (deptComp != 0) {
			// if names are same but dept are different return dept comparision
			return deptComp;
		}

		// if name and dept are same then return age comparision
		return e1.getAge() - e2.getAge();
	}

}

public class Employee {

	String name;
	String Department;
	int age;

	public Employee(String name, String department, int age) {
		this.name = name;
		Department = department;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return Department;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Nikeeta", "IT", 25));
		employees.add(new Employee("Lalita", "HR", 23));
		employees.add(new Employee("Manoj", "Sales", 27));
		employees.add(new Employee("Nikeeta", "Marketing", 22));
		employees.add(new Employee("Lalita", "HR", 26));
		
		Collections.sort(employees,new EmployeeComparator());
		
		//print sorted list
		for(Employee emp : employees) {
			System.out.println(emp.getName()+ " " +emp.getDepartment()+ " " +emp.getAge());
		}
	}

}

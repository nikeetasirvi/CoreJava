package week1.practicequestions.SalaryCalculator;

public class ContractEmployee extends Employee{
	
	private int noOfHours;
	private int incentives;
	private int totalEmoluments;

	public ContractEmployee(String employeeCode, String name, String department, String designation, int noOfHours,
			int incentives,int totalEmoluments) {
		this.employeeCode = employeeCode;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.noOfHours = noOfHours;
		this.incentives = incentives;
		this.totalEmoluments = totalEmoluments;
	}

	public int calculateSalary() {
		//each hour salary is 100 rupees
		return (noOfHours * 100) + incentives + totalEmoluments;
	}
}

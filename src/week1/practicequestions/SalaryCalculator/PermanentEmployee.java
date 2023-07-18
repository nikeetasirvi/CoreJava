package week1.practicequestions.SalaryCalculator;

public class PermanentEmployee extends Employee{
	
	private int basic;
	private int hra;
	private int cca;
	private int allowances;
	private int deductions;
	
	public PermanentEmployee(String employeeCode, String name, String department, String designation, int basic, int hra,
			int cca, int allowances, int deductions) {
		this.employeeCode = employeeCode;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.basic = basic;
		this.hra = hra;
		this.cca = cca;
		this.allowances = allowances;
		this.deductions = deductions;
	}

	public int calculateSalary() {
		return basic + hra + cca + allowances - deductions;
	}
	
}

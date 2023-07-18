package week1.practicequestions.SalaryCalculator;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PermanentEmployee employee1 = new PermanentEmployee("E01","Nikeeta","Tech","SE",50000,3000,4000,1000,2000);
		PermanentEmployee employee2 = new PermanentEmployee("E02","Lalita","Hr","SeniorHr",40000,5000,8000,5000,1000);
	
		System.out.println("Total Salary of permanent employee1 is: " +employee1.calculateSalary());
		System.out.println("Total Salary of permanent employee2 is: " +employee2.calculateSalary());
		
		ContractEmployee employee3 = new ContractEmployee("E03","Manoj","Tech","SE",50,3000,4000);
		ContractEmployee employee4 = new ContractEmployee("E04","Vinod","Hr","SeniorHr",40,5000,8000);
	
		System.out.println("Total Salary of contract employee3 is: " +employee3.calculateSalary());
		System.out.println("Total Salary of contract employee4 is: " +employee4.calculateSalary());
	}

}

package week1.practicequestions.customers;

import java.util.Scanner;

public class Agent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Customers customer = new Customers();
		customer.addCustomer("C01","Nikeeta","Surat","1234567895","nikeeta@gmail.com",20000,200);
		customer.addCustomer("C02","Lalita","Bangalore","1234567895","lalita@gmail.com",40000,400);
		customer.addCustomer("C03","Nikeeta","Surat","1234567895","nikeeta@gmail.com",10000,200);
		customer.addCustomer("C04","Lalita","Bangalore","1234567895","lalita@gmail.com",50000,400);
		customer.addCustomer("C05","Nikeeta","Surat","1234567895","nikeeta@gmail.com",1000,200);
		customer.addCustomer("C06","Lalita","Bangalore","1234567895","lalita@gmail.com",5000,400);
		
		while(true) {
			
			System.out.println("\nSelect an option:");
			System.out.println("1: add customer");
			System.out.println("2: search customer by area");
			System.out.println("3: Find average purchase value of all customer");
			System.out.println("4: Categorize customers based on purchase value");
			System.out.println("0: Exit");
			int option = input.nextInt();
			input.nextLine();
			
			if(option == 0) {
				System.out.println("Thank you......");
				break;
			}
			
			switch(option) {
				case 1:{
					System.out.println("Enter customerId: ");
					String customerId  = input.nextLine();
					System.out.println("Enter customerName: ");
					String customerName  = input.nextLine();
					System.out.println("Enter customerAddress: ");
					String customerAddress  = input.nextLine();
					System.out.println("Enter customerPhone: ");
					String customerPhone  = input.nextLine();
					System.out.println("Enter customereMail: ");
					String customereMail  = input.next();
					System.out.println("Enter purchaseValue: ");
					int purchaseValue  = input.nextInt();
					System.out.println("Enter salesTax: ");
					int salesTax  = input.nextInt();
					customer.addCustomer(customerId,customerName,customerAddress,customerPhone,customereMail,purchaseValue,salesTax);
					customer.getCustomer();
					break;
				}
				case 2:{
					System.out.println("Enter customerAddress: ");
					String customerAddress  = input.nextLine();
					customer.searchByArea(customerAddress);
					break;
				}
				case 3:{
					System.out.println(customer.findAveragePurchaseValue());
					break;
				}
				case 4:{
					customer.categorizeCustomers();
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

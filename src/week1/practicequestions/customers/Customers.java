package week1.practicequestions.customers;

import java.util.ArrayList;

public class Customers {
	
	ArrayList<Customer> customers = new ArrayList<>();
	
	public void addCustomer(String customerId, String customerName, String customerAddress, String customerPhone,
			String customereMail, int purchaseValue, int salesTax) {
		
		Customer customer = new Customer(customerId,customerName,customerAddress,customerPhone,customereMail,purchaseValue,salesTax);
		customers.add(customer);
	}
	
	public void getCustomer() {
		System.out.println("\n");
		System.out.println("List of all Customers:_________________");
		for(Customer customer: customers) {
			System.out.println("\n");
			customer.getCustomer();
		}
	}
	
	public void searchByArea(String customerAddress) {
		boolean flag = false;
		for(Customer customer: customers) {
			if(customer.getCustomerAddress().equals(customerAddress)) {
				flag = true;
				customer.getCustomer();
				System.out.println();
			}
		}
		if(!flag) {
			System.out.println("No records found..............");
		}
	}
	
	public double findAveragePurchaseValue() {
		int totalPurchaseValue = 0;
		for(Customer customer: customers) {
			totalPurchaseValue += customer.getPurchaseValue();
		}
		return totalPurchaseValue/customers.size();
	}
	
	public void categorizeCustomers() {
		double averagePruchaseValue = findAveragePurchaseValue();
		
		System.out.println("------------Low Valued Customers--------------------");
		for(Customer customer: customers) {
			if(customer.getPurchaseValue() < averagePruchaseValue*0.8) {
				//if purchase value of customer is less than 80% of average purchase value
				customer.getCustomer();
				System.out.println();
			}
		}
		
		System.out.println("------------Average Customers--------------------");
		for(Customer customer: customers) {
			if(customer.getPurchaseValue() > averagePruchaseValue*0.8 && customer.getPurchaseValue() < averagePruchaseValue*1.2) {
				//if purchase value of customer is greater than 80% and less than 120% of average purchase value
				customer.getCustomer();
				System.out.println();
			}
		}
		
		System.out.println("------------High Valued Customers--------------------");
		for(Customer customer: customers) {
			if(customer.getPurchaseValue() > averagePruchaseValue*1.2) {
				//if purchase value of customer is more than 120% of average purchase value
				customer.getCustomer();
				System.out.println();
			}
		}
	}
}

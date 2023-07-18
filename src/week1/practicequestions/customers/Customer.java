package week1.practicequestions.customers;

public class Customer {

	private String customerId;
	private String customerName;
	private String customerAddress;
	private String customerPhone;
	private String customereMail;
	private int purchaseValue;
	private int salesTax;
	
	public Customer(String customerId, String customerName, String customerAddress, String customerPhone,
			String customereMail, int purchaseValue, int salesTax) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		this.customereMail = customereMail;
		this.purchaseValue = purchaseValue;
		this.salesTax = salesTax;
	}
	
	public void getCustomer() {
		System.out.println("customerId: " +customerId);
		System.out.println("customerName: " +customerName);
		System.out.println("customerAddress: " +customerAddress);
		System.out.println("customerPhone: " +customerPhone);
		System.out.println("customereMail: " +customereMail);
		System.out.println("purchaseValue: " +purchaseValue);
		System.out.println("salesTax: " +salesTax);
	}

	public String getCustomerAddress() {
		return customerAddress;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public int getPurchaseValue() {
		return purchaseValue;
	}
	
}

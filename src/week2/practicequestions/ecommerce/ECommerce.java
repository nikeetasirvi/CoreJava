package week2.practicequestions.ecommerce;

import java.util.Scanner;

public class ECommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Vendors vendors = new Vendors();
		Products products = new Products();
		
		while(true) {

			System.out.println("Enter the option:");
			System.out.println("1: Add product");
			System.out.println("2: Add new vendor");
			System.out.println("3: print product details");
			System.out.println("4: print vendor details");
			System.out.println("0: Exit");
			int option = input.nextInt();
			input.nextLine();
			
			if(option == 0) {
				System.out.println("Thank you....");
				break;
			}

			switch(option) {
				case 1:{
					System.out.println("Enter vendor id:");
					int vendorId = input.nextInt();
					if(vendors.searchVendorId(vendorId)) {
						System.out.println("Enter product Id:");
						int productId = input.nextInt();
						input.nextLine();
						System.out.println("Enter product Name");
						String productName = input.nextLine();
						products.setProduct(productId,productName,vendorId);
					}
					break;
				}
				case 2:{
					System.out.println("Enter vendor name:");
					String vendorName = input.nextLine();
					int vendorId = vendors.setVendor(vendorName);
					System.out.println("Vendor added successfully!!!....Id is " +vendorId);
					break;
				}
				case 3:{
					products.getProducts();
					break;
				}
				case 4:{
					vendors.getVendors();
					break;
				}
				default:{
					System.out.println("Enter the correct option");
					continue;
				}
			}
		}
		input.close();
	}

}

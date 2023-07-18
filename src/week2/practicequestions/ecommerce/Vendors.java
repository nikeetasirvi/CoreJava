package week2.practicequestions.ecommerce;

import java.util.ArrayList;

public class Vendors {
	
	private ArrayList<String> vendorsName = new ArrayList<String>();
	
	public int setVendor(String vendorName) {
		vendorsName.add(vendorName);
		return vendorsName.indexOf(vendorName)+1;
	}
	
	public boolean searchVendorId(int vendorId) {
		if(vendorId-1 < vendorsName.size()) {
			System.out.println("Vendor found....");
			return true;
		} else {
			System.out.println("Vendor not found....");
			return false;
		}
	}
	
	public void getVendors() {
		if(!vendorsName.isEmpty()) {
			for(String s: vendorsName) {
				System.out.println("Vendor Id: " +(vendorsName.indexOf(s)+1));
				System.out.println("Vendor Name: " +s+ "\n");
			}
		} else {
			System.out.println("No vendors added yet....");
		}
	}
}

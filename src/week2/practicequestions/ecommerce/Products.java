package week2.practicequestions.ecommerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Products {
	
	HashMap<String,ArrayList<Integer>> products = new HashMap<String,ArrayList<Integer>>();
//	private int productId;
//	private String productName;
//	private int vendorId;
	
	public void setProduct(int productId, String productName,int vendorId) {
		ArrayList<Integer> ids = new ArrayList<Integer>();
//		this.productId = productId;
//		this.productName = productName;
//		this.vendorId = vendorId;
		ids.add(productId);
		ids.add(vendorId);
		products.put(productName,ids);
		System.out.println("product added successfully!!!.....");
	}
	
	public void getProducts() {
		if(!products.isEmpty()) {
			for(Map.Entry<String,ArrayList<Integer>> entry : products.entrySet()) {
				System.out.println("Product Name: " +entry.getKey());
				System.out.print("Product Id and Vendor Id: ");
				for (int i : entry.getValue()) {
					System.out.print(i+ "  ");
				}
				System.out.println();
				System.out.println();
			}
		} else {
			System.out.println("No products added yet.....");
		}
	}
	
}

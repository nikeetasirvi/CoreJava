package week1.practicequestions;

public class Product {

	 private String productId,productName,productDescription,productCategory;
	 private int productPrice,qoh;
	 
	public Product(String productId,String productName,String productDescription,String productCategory,int productPrice,int qoh) throws PriceException{
		/*try{
			if(productPrice > 100000) {
				throw new PriceException("price is above 1 lakh__________");
			}
		} catch(PriceException e) {
			System.out.println(e);
		}*/
		
		// above code will show the error and continue program but we cam also throw exception like below and by throws word after method signature
		
		if(productPrice > 100000) {
			throw new PriceException("price is above 1 lakh__________");
		}
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.qoh = qoh;
	}
	
	public void display() {
		System.out.println("productId: " +productId);
		System.out.println("productName: " +productName);
		System.out.println("productDescription: " +productDescription);
		System.out.println("productCategory: " +productCategory);
		System.out.println("productPrice: " +productPrice);
		System.out.println("qoh: " +qoh);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product("P01","Laptop","Gaming Laptop","Electronic",200000,20);
		product.display();
	}

}

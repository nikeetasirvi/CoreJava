package week1;
public class Customer{
  
  int age;
  String name;

  public static void main(String[] args){
  
    Customer c = new Customer();
    c.name = "Nikeeta Sirvi";
    c.age = 24;
    System.out.println("customer name = " + c.name);
    System.out.println("customer age = " + c.age);
    
  }
}
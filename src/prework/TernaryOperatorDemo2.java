package prework;
public class TernaryOperatorDemo2{

  public static void main(String[] args){
  
    int NoOfLaptops = 5;
    
    System.out.println("order confirmation :");
    System.out.println("you want to order " + NoOfLaptops + " " + Grammer(NoOfLaptops));
    
  }
  
  private static String Grammer(int temp){
  
    return temp == 1 ? "laptop" : "laptops";
    
  } 
}
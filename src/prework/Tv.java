package prework;
import java.util.Scanner;

public class Tv{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of a TV: ");
    int size = input.nextInt();;
    System.out.println("Enter the cost of a TV: ");
    int cost = input.nextInt();
    System.out.println("Enter the type of a TV (BW/color): ");
    String tvType = input.next();
    //System.out.println("Enter the type of a TV (BW/color): ");
    //String tvType = input.nextLine();
    int discount = 0;
    int finalCost = 0;
    
    if(size == 14 && tvType.equals("BW")){
    
      discount = (cost * 8 / 100);
      finalCost = cost - discount;
      
    } else if(size == 14 && tvType.equals("color")){
    
      discount = (cost * 10 / 100); 
      finalCost = cost - discount;
      
    } else if(size == 20 && tvType.equals("BW")){
    
      discount = (cost * 12 / 100);
      finalCost = cost - discount;
      
    } else if(size == 20 && tvType.equals("color")){
    
      discount = (cost * 14 / 100);
      finalCost = cost - discount;
      
    } else{
    
      System.out.println("Enter correct size and type");
    }
    
    System.out.println("Cost " + cost);
    System.out.println("Discount " + discount);
    System.out.println("Finalcost " + finalCost);
    
  }
}
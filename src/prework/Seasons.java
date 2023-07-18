package prework;
import java.util.Scanner;

public class Seasons{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a month: ");
    String Month = input.nextLine();
    
    if(Month.equals("December") || Month.equals("January" ) || Month.equals("February")){
    
      System.out.println(Month + " has a Winter season");
      
    } else if(Month.equals("March") || Month.equals("April" ) || Month.equals("May")){
    
      System.out.println(Month + " has a Summer season");
      
    } else if(Month.equals("June") || Month.equals("July" ) || Month.equals("August") || Month.equals("September")){
    
      System.out.println(Month + " has a Rainy season");
      
    } else{
    
      System.out.println(Month + " has a Autumn season");
    }
    
  }
}
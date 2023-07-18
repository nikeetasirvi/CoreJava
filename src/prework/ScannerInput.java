package prework;
import java.util.Scanner;

public class ScannerInput{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    boolean isAnInteger = input.hasNextInt();
    
    if(isAnInteger){
    
      int Value = input.nextInt();
      System.out.println("The value you entered is " + Value);
    } else{
    
      System.out.println("Please enter integer value");
    }
    
  }
}
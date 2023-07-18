package prework;
import java.util.Scanner;
public class Factorial{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int Number = input.nextInt();
    int factorial = 1;
    
    for(int i = Number; i > 0; i -- ){
    
      factorial = factorial * i;
    }
    
    System.out.println("Factorial is: " + factorial);
    
  }
}
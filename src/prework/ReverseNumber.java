package prework;
import java.util.Scanner;

public class ReverseNumber{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number to be reversed");
    int Number = input.nextInt();
    
    int TempNumber = Number;
    int Quotient = -1;
    int Remainder = -1;
    int IntermediateResult = 0;
    
    while(Quotient != 0){
    
      Quotient = TempNumber / 10;
      Remainder = TempNumber % 10;
      
      IntermediateResult = Remainder + (IntermediateResult * 10);
        
      TempNumber = Quotient;
    }
    
    System.out.println("The reverse number for " + Number + " is " + IntermediateResult);
  }
}
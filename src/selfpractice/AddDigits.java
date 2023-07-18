package selfpractice;
import java.util.Scanner;

public class AddDigits{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a integer number between 0 and 1000");
    int Number = input.nextInt();
    
    if(Number < 0 || Number > 1000){
    
      System.out.println("chal Dafa ho yaha se.....idiot");
      
    } else{
      /*
      int FirstNumber = Number % 10;
      int Remaining = Number / 10;
      int SecondNumber = Remaining % 10;
      Remaining = Remaining / 10;
      int ThirdNumber = Remaining % 10;
      Remaining = Remaining / 10;
      int FourthNumber = Remaining % 10;
      System.out.println("sum=" + (FirstNumber+SecondNumber+ThirdNumber+FourthNumber));
      */
      int Quotient = -1;
      int Remainder = -1;
      int tempNumber = Number;
      int Sum = 0;
      while(Quotient != 0){
      
        Quotient = tempNumber / 10;
        Remainder = tempNumber % 10;
        Sum = Sum + Remainder;
        tempNumber = Quotient;
      }
      
      System.out.println("The Sum of digits of " + Number + " is " + Sum);
    }
    
  }
}
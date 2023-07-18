package prework;
import java.util.Scanner;

public class SwitchCaseCalculator{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter number 1: ");
    int Number1 = input.nextInt();
    System.out.println("Enter number 2: ");
    int Number2 = input.nextInt();
    
    System.out.println("Select the Operation you want to perform(+, -, /, * or %): ");
    char Operator = input.next().charAt(0);
    
    switch(Operator){
    
      case '+' :{
      
        System.out.println("The " + Operator + " of " + Number1 + " and " + Number2 + " is :" + (Number1+Number2));
        break;
      }
      case '-' :{
      
        System.out.println("The " + Operator + " of " + Number1 + " and " + Number2 + " is :" + (Number1-Number2));
        break;
      }
      case '/' :{
        
        if(Number2 ==0){
          System.out.println("The Denominator cannot be 0");
          break;
        } else{
          System.out.println("The " + Operator + " of " + Number1 + " and " + Number2 + " is :" + (Number1/Number2));
          break;
        }
        
      }
      case '*' :{
      
        System.out.println("The " + Operator + " of " + Number1 + " and " + Number2 + " is :" + (Number1*Number2));
        break;
      }
      case '%' :{
      
        System.out.println("The " + Operator + " of " + Number1 + " and " + Number2 + " is :" + (Number1%Number2));
        break;
      }
      default :{
      
        System.out.println("Enter correct operator");
        break;
      }
    }
    
  } 
}
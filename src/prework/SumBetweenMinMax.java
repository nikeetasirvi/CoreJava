package prework;
import java.util.Scanner;
public class SumBetweenMinMax{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter minimun number: ");
    int Number1 = input.nextInt();
    System.out.println("Enter maximum number: ");
    int Number2 = input.nextInt();
    int Sum = 0;
    if(Number1 > Number2){
    
      System.out.println("The minimum number cannot be greater than maximum");
    } else{
    
      for(int i = Number1; i <= Number2; i ++ ){
    
        Sum = Sum + i;
      }
      System.out.println("Sum is: " + Sum);
      
    }
    
  }
}
package prework;
import java.util.Scanner;
public class CountOddEvenTotalBetweenMinMax{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter minimun number: ");
    int Number1 = input.nextInt();
    System.out.println("Enter maximum number: ");
    int Number2 = input.nextInt();
    int Odd = 0;
    int Even = 0;
    int Total = 0;
    
    for(int i = Number1; i <= Number2; i ++ ){
    
      if(i % 2 == 0){
        
        Odd ++;
        
      } else{
        
        Even ++;
        
      }
      
      Total ++;
    }
    System.out.println("odd is: " + Odd);
    System.out.println("even is: " + Even);
    System.out.println("total is: " + Total);
  }
}
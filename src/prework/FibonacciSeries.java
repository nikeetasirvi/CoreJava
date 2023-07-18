package prework;
import java.util.Scanner;

public class FibonacciSeries{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("How many numbers you want to print? : ");
    int Number = input.nextInt();
    
    int FirstNumber = 0;
    int SecondNumber = 1;
    
    System.out.print(FirstNumber + ", ");
    System.out.print(SecondNumber + ", ");
    
    for(int Count = 3; Count <= Number; Count ++){
    
      int SummedNumber = FirstNumber + SecondNumber;
      
      if(Count == Number){
      
        System.out.println(SummedNumber);
        
      } else{
      
        System.out.print(SummedNumber + ", ");
        
      }
      
      FirstNumber = SecondNumber;
      SecondNumber = SummedNumber;
      
    }
    
  }
}
package prework;
import java.util.Scanner;

public class StarPatternRightTriangle{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print: ");
    int Row = input.nextInt();
    
    for(int RowCount = 1; RowCount <= Row; RowCount ++){
    
      for(int Stars = 1; Stars <= RowCount; Stars ++){
      
        System.out.print("* ");
      }
      
      System.out.println();
      
    }
    
  }
}

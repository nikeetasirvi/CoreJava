package prework;
import java.util.Scanner;

public class StarPatternDensePyramid{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print: ");
    int Row = input.nextInt();
    int temp = 1;
    
    for(int RowCount = 1; RowCount <= Row; RowCount ++){
    
      for(int Space = Row - RowCount; Space > 0; Space --){
      
        System.out.print(" ");
      }
      
      for(int Stars = 1; Stars <= temp; Stars ++){
        
        System.out.print("*");
      }
      
      temp = temp + 2;
      System.out.println();
    }
  }
}
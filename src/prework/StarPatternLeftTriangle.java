package prework;
import java.util.Scanner;

public class StarPatternLeftTriangle{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print: ");
    int Row = input.nextInt();
    
    for(int RowCount = 1; RowCount <= Row; RowCount ++){
      
      /*int Space = Row - RowCount;
      while(Space != 0){
        
        System.out.print(" ");
        Space --;
          
      }*/
      /*for(int Space = RowCount; Space < Row; Space ++){
      
        System.out.print("&");
      }*/
      for(int Space = Row - RowCount; Space > 0; Space --){
      
        System.out.print(" ");
      }
    
      for(int Stars = 1; Stars <= RowCount; Stars ++){
      
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}

package prework;
import java.util.Scanner;
public class Polygon{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length ");
    int length = input.nextInt();
    System.out.println("Enter the width ");
    int width = input.nextInt();
    
    if(length == width){
    
      System.out.println("The area of square is: " + (length * width));
      
    } else{
    
      int perimeter = 2 * (length + width);
      System.out.println("The perimeter of rectangle is: " + perimeter);
    }
    
  }
}
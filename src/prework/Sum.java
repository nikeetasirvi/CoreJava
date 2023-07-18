package prework;
import java.util.Scanner;
public class Sum{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 5 numbers: ");
    int Number1 = input.nextInt();
    int Number2 = input.nextInt();
    int Number3 = input.nextInt();
    int Number4 = input.nextInt();
    int Number5 = input.nextInt();
    
    System.out.println("Sum is: " + (Number1+Number2+Number3+Number4+Number5));
  }
}
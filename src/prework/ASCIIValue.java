package prework;
import java.util.Scanner;

public class ASCIIValue{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("enter the character for ASCII value: ");
    char Character = input.next().charAt(0);
    
    int ASCIIValue = Character;
    System.out.println("The ASCII value of " + Character + " is " + ASCIIValue);
  }
}
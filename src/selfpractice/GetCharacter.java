package selfpractice;
import java.util.Scanner;

public class GetCharacter{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a string");
    String Text = input.nextLine();
    System.out.println("Enter the index you want to search starting from 0");
    int index = input.nextInt();
    char c = Text.charAt(index);
    System.out.println("At index "+ index + " we have character " + c);
    
  }
}
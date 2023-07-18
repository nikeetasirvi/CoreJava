package selfpractice;
import java.util.Scanner;

public class EndsWithString{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a String");
    String Text1 = input.nextLine();
    System.out.println("Enter ends with string");
    String Text2 = input.nextLine();
    System.out.println(Text1.endsWith(Text2));
    
  }
}
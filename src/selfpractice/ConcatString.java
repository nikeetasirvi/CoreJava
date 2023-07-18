package selfpractice;
import java.util.Scanner;

public class ConcatString{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a String");
    String Text1 = input.nextLine();
    System.out.println("Enter string to be concated after above string");
    String Text2 = input.nextLine();
    String finalString = Text1.concat(" ").concat(Text2);
    
    System.out.printf("The final string after concatenating is \"%s\" ",finalString);
    
  }
}
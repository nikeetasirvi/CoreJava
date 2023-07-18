package selfpractice;
import java.util.Scanner;

public class FindString{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a String");
    String Text1 = input.nextLine();
    System.out.println("Enter a string to be found");
    String Text2 = input.nextLine();
    System.out.println(Text1.contains(Text2));
    //run in command prompt not in drjava
    
  }
}
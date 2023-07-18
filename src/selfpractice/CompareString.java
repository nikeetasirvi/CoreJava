package selfpractice;
import java.util.Scanner;

public class CompareString{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter String_1");
    String Text1 = input.nextLine();
    System.out.println("Enter String_2");
    String Text2 = input.nextLine();
    int value = Text1.compareTo(Text2);
    //int value = Text1.compareToIgnoreCase(Text2);
    
    if(value < 0){
      System.out.println("String_1 is less than String_2");
    } else if(value == 0){
      System.out.println("String_1 is equal to String_2");
    } else{
      System.out.println("String_1 is greater than String_2");
    }
    
    System.out.println(Text1.equals(Text2));
    System.out.println(Text1.equalsIgnoreCase(Text2));
    
  }
}
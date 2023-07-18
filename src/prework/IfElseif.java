package prework;
import java.util.Scanner;

public class IfElseif{

  public static void main(String[] args){
  
    System.out.println("Enter a code from option");
    System.out.println("________________________");
    System.out.println("1: English movie (code-EN)");
    System.out.println("2: Hindi movie (code-HN)");
    
    Scanner input = new Scanner(System.in);
    String MovieCode = input.nextLine();
    
    if(MovieCode.equals("EN")){
    
      System.out.println("Anaconda");
      System.out.println("Final Destination");
      
    } else if(MovieCode.equals("HN")){
    
      System.out.println("Tiranga");
      System.out.println("Border");
    
    } else{
    
      System.out.println("Wrong code");
      
    }
  }
}
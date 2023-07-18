package prework;
import java.util.Scanner;

public class SwitchCase{

  public static void main(String[] args){
  
    System.out.println("Select one option");
    System.out.println("_________________");
    System.out.println("1: Burger");
    System.out.println("2: Juice");
    System.out.println("3: Cake");
    
    Scanner input = new Scanner(System.in);
    int Option = input.nextInt();
    
    switch(Option){
    
      case 1:{
      
        System.out.println("Types of Burger:");
        System.out.println("_________________");
        System.out.println("Lola Burger");
        System.out.println("King Burger");
        System.out.println("Deep Fried Burger");
        break;
      }
      
      case 2:{
      
        System.out.println("Types of Juices:");
        System.out.println("_________________");
        System.out.println("Orange Juice");
        System.out.println("Mango Juice");
        System.out.println("Pineapple Juice");
        break;
      }
      
      case 3:{
      
        System.out.println("Types of Cakes:");
        System.out.println("_________________");
        System.out.println("Red Velvet Cake");
        System.out.println("Choco Lava Cake");
        System.out.println("Black Forest Cake");
        break;
      }
      
      default :{
      
        System.out.println("incorrect option");
        break;
      }
    }
    
  }
}
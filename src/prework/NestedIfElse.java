package prework;
//import java.util.Scanner;

public class NestedIfElse{
  
  public static void main(String[] args){
  
    //Scanner input = new Scanner(System.in);
    //String DayOfWeek = input.nextLine();
    
    //if you take user input then the objects will be compared rather that its value so the == will not work, only .equals will work.
    
    String DayOfWeek = "Saturday";
    
    if(DayOfWeek == "Saturday" || DayOfWeek == "Sunday"){
      
      if(DayOfWeek == "Saturday"){
      
        System.out.println("Watch Movie"); 
        
      } else{
      
        System.out.println("Go for a walk");  
        
      }
    } else{
      
      if(DayOfWeek.equals("Monday") || DayOfWeek.equals("Wednesday") || DayOfWeek.equals("Friday")){
        
        System.out.println("Go to Gym");
        
      } else{
        
        System.out.println("Go to temple");
        
      }  
      
    }
    
  }
}
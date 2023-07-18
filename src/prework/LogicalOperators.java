package prework;
public class LogicalOperators{
  
  public static void main(String[] args){
  
    int Marks = 80;
    String Course = "FSD";
    float ProjectScore = 8.0f;
    boolean iLikeArmy = true;
    
    if (Marks > 80 && Course == "FSD"){
      System.out.println("eligible for campus placement - 1");
    }
    
    if (Marks >= 80 || ProjectScore > 8.0){
      System.out.println("eligible for campus placement - 2");
    }
    
    System.out.println("Negation of iLikeArmy is " + !iLikeArmy);
    
    /* XOR example
     * We want a condition that the car can either be diesel or manual, but not both
     * if we do this with && and || it willbe as...
     * (diesel && !manual) || (!diesel && manual)
     * here comes the XOR
     * if different value of operands it will return true else false
     */
    
    boolean diesel = true;
    boolean manual = true;
    
    if(diesel ^ manual){
    
      System.out.println("passed");
      
    } else{
    
      System.out.println("Failed");
    }
    
  }
}
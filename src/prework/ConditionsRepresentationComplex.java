package prework;
public class ConditionsRepresentationComplex{
  
  public static void main(String[] args){
  
    boolean Condition1 = false;
    boolean Condition2 = (10 < 5);
    boolean Condition3 = (5 <= 6);
    boolean finalCondition = (((!Condition1 && Condition2) || (!Condition1 && Condition3)) && (!Condition2 ||Condition3));
    
    if(finalCondition){
      System.out.println("true");  
    } else{
      System.out.println("false");  
    }
    
  }
}
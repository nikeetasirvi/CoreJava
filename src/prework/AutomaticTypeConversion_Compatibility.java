package prework;
public class AutomaticTypeConversion_Compatibility{

  public static void main(String[] args){
  
    // This will work as both int to float is compatible
    int i = 10;
    float f = i;
    System.out.println("f = " + f);
    
    // This all below 3 will not work as they are not compatible with each other
    float f1 = 10.2f;
    //int i1 = f1;
    
    boolean Condition = true;
    //float f2 = Condition;
    
    double d = 100.347;
    //char c = d;
    
  } 
}
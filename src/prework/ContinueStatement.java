package prework;
public class ContinueStatement{

  public static void main(String[] args){
  
    for(int Count = 0; Count < 10; Count ++){
      
      if(Count == 5){
      
        continue;
      }
    
      System.out.println("Number " + Count);
      
    }
  }
}
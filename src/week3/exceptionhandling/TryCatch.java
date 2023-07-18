package week3.exceptionhandling;
import java.util.ArrayList;
// it is a unchecked exception so we are not bound to import the exception classes

public class TryCatch{

  public static void main(String[] args){
    
    Demo d = new Demo();
    d.array();
    
  }
}
class Demo{

  public void array(){
  
    try{
      ArrayList<Integer> list = new ArrayList<>();
      list.add(10);
      System.out.println("accessed first element = " +list.get(0));
    } catch(IndexOutOfBoundsException e){
      System.err.println("caught IndexOutOfBoundsException: " +e.getMessage());
    } finally{
      System.out.println("this will always be executed");
    }
    
  }
}
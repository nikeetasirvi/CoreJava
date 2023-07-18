package week3.exceptionhandling;
public class Throw{

  public static void main(String[] args){
  
    try{
      try{
        int a = 100/0;
        System.out.println(a);
      } catch(ArithmeticException e){
        //will through the exception to the outer block
        throw e;
        //throw new ArithmeticException("my custom ArithmeticException message");
        //throw new MyCustomException();
      }
    } catch(ArithmeticException e){
      System.out.println("outer block : " +e.getMessage());
    }
    
  }
}
package week3.exceptionhandling;
public class MultipleCatch{

  public static void main(String[] args){
  
    try{
      
      int[] arr = new int[10];
      arr[0] = 20/0; // divide by zero exception
      arr[10] = 20; // ArrayIndexOutOfBoundsException
      String a = null;
      a.charAt(0); // Exception
      
      System.out.println("try block ends here");
      
    } catch(ArithmeticException | ArrayIndexOutOfBoundsException e){ // this both can be written in different catch blocks also
      System.out.println("caught ArithmeticException or ArrayIndexOutOfBoundsException: " +e.getMessage());
    } catch(Exception e){
      System.out.println("caught Exception: " +e.getMessage());
    } 
    
  }
}
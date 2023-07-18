package week3.exceptionhandling;
public class NestedTryCatch{

  public static void main(String[] args){
    
    try{
      try{
        try{
          int[] arr = {1,2,3,4,5};
          System.out.println(arr[10]);
        } catch(NullPointerException e){
          System.out.println("caught NullPointerException: " +e.getMessage());
        }
      } catch(StringIndexOutOfBoundsException e){
        System.out.println("caught StringIndexOutOfBoundsException: " +e.getMessage());
      }
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println("caught ArrayIndexOutOfBoundsException: " +e.getMessage());
    }
    
  }
}
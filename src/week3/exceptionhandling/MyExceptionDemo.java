package week3.exceptionhandling;
public class MyExceptionDemo{

  public static void main(String[] args) /*throws MyException*/ {
  
    try{
      int[] arr = new int[1];
      System.out.println(arr[1]);
    } catch(MyException e){
      throw e;
      //throw new MyException("My custom Excepion");
    }
    
  }
}
class MyException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	MyException(){}
	
	MyException(String str){
		super(str);
	}
  
}
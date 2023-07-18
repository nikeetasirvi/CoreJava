package week3.recursion;
public class Recursion{

  public void demo(int num){
    if(num < 1){
      System.out.println("Number is less than 1");
    }else{
      
      System.out.println(num); // just interchage this 2 statements and see the huge difference
      demo(num-1);
    }
  }
  
  public static void main(String[] args){
  
    Recursion r = new Recursion();
    r.demo(5);
  }
}
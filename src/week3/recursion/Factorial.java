package week3.recursion;
public class Factorial{

  public int factorial(int num){
    if(num == 1 || num == 0){
      return 1;
    } else if(num < 0){
      return -1;
    }else{
      return num * factorial(num-1);
    }
  }
  
  public static void main(String[] args){
  
    Factorial r = new Factorial();
    System.out.println(r.factorial(5));
    
  }
}
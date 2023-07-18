package week3.recursion;
public class FindBinary{

  public static void findBinary(int num){
    if(num < 1){
      return;
    }
    findBinary(num/2);
    System.out.print(num%2);
  }
  
  public static void main(String[] args){
    findBinary(50);
  }
}
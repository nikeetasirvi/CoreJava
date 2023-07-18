package prework;
public class TernaryOperatorDemo1{

  public static void main(String[] args){
  
    int a = 50;
    int b = 20;
    
    int SmallerNumber = (a < b) ? a : b;
    int LargerNumber = (a > b) ? a : b;
    
    System.out.println("Smaller number is " + SmallerNumber);
    System.out.println("Larger number is " + LargerNumber);
    
  }
}
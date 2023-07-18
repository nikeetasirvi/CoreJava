package prework;
public class UnaryOperator{

  public static void main(String[] args){
  
    int a = 10;
    int b = a++; // First assign the value of a to b then increment a by 1 
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    
    int c = 30;
    int d = c--; // First assign the value of c to d then decreement c by 1 
    System.out.println("c = " + c);
    System.out.println("d = " + d);
    
    int e = 10;
    int f = ++e; // First increement e by 1 then assign it to f 
    System.out.println("e = " + e);
    System.out.println("f = " + f);
    
    int g = 30;
    int h = --g; // First decreement g by 1 then assign it to h 
    System.out.println("g = " + g);
    System.out.println("h = " + h);
    
  }
}
package prework;
public class AssignmentOperators{
  
  public static void main(String[] args){
    
    int a = 10;
    int b = 20;
    int c = 30;
    
    //a=10
    System.out.println("initial value of a is " + a);
    
    //a=50
    a = b + c;
    System.out.println("the value of a is " + a);
    
    //a=a+b a=70
    a += b;
    System.out.println("the value of a is " + a);
    
    //a=a+20 a=90
    a += 20;
    System.out.println("the value of a is " + a);
    
    //a=a-20 a=70
    a -= 20;
    System.out.println("the value of a is " + a);
    
    //a=a%8 a=6
    a %= 8;
    System.out.println("the value of a is " + a);
    
    //at this point the value of a and b were 8 and 20 but the below operation is assigning b's value to a
    //a=b
    a =+ b;
    System.out.println("the value of a is " + a);
    System.out.println("the value of b is " + b);
    
    //a=2
    a =+ 2;
    System.out.println("the value of a is " + a);
    System.out.println("the value of b is " + b);
    
  }
}
package week2;

public class MethodOverriding extends ParentClass{
  int a=30,b=40;
  void printWhile(){
    System.out.println("child class method");
    System.out.println("child class add = " +(a+b));
  }
  
  public static void main(String[] args){
  
    ParentClass m = new ParentClass();
    m.printWhile(); // parent will be printed 
    
    MethodOverriding m1 = new MethodOverriding();
    m1.printWhile(); // child will be printed
    
    ParentClass m2 = new MethodOverriding();// also called upcasting
    m2.printWhile(); // child will be printed
    //run time polymorphism
  }
}

class ParentClass{

  int a=10,b=20;
  void printWhile(){
    System.out.println("parent class method");
    System.out.println("parent class add = " +(a+b));
  }
}
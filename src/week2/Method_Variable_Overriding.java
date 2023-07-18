package week2;

public class Method_Variable_Overriding extends Bike{
  int speedlimit = 150;
  void run(){
    System.out.println("Child class method");
  }
  
  public static void main(String[] args){
    Bike b = new Bike(); //parent will be printed
    System.out.println(b.speedlimit);
    b.run();
    
    Method_Variable_Overriding h = new Method_Variable_Overriding(); //child will be printed
    System.out.println(h.speedlimit);
    h.run();
    
    Bike b1 = new Method_Variable_Overriding(); 
    System.out.println(b1.speedlimit); //parent will be printed because the data member can not be overridden by base class
    b1.run(); //child will be printed because the method can be overridden by base class
  }
}
class Bike{
  int speedlimit = 75;
  void run(){
    System.out.println("Parent class method");
  }
}
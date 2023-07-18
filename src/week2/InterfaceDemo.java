package week2;

public class InterfaceDemo{
  public static  void main(String[] args){
    Dog3 obj = new Dog3();
    obj.makeSound();
    obj.sleep();
    
    Animal3 a = new Dog3();
    a.makeSound();
    a.sleep();
  }
}
interface Animal3{
  public void makeSound();
  public void sleep();
}

class Dog3 implements Animal3{
  public void makeSound(){
    System.out.println("Dog Barks");
  }
  public void sleep(){
    System.out.println("Sleeps as Zzzz");
  }
}

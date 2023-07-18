package week2;

public class PartialAbstraction{
  
  public static  void main(String[] args){
    Animal2 a = new Dog2();
    a.Sound();
    a.Sleep();
    
    Dog2 obj = new Dog2();
    obj.Sound();
    obj.Sleep();
  }
}
abstract class Animal2{
  //Constructor method
  Animal2(){
    System.out.println("default constructor");
  }
  // abstract method
  public abstract void Sound();
  // Regular method
  public void Sleep(){
    System.out.println("Sleeps as ‘Zzzz’ ");
  }
}

class Dog2 extends Animal2{
  public void Sound(){
    System.out.println("Dog Barks");
  }
}

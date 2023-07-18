package week2;
public class InheritanceConstructor{
  public static void main(String args[]) {
    Animal5 a = new Animal5();
    System.out.println();
    Dog5 d = new Dog5();
    System.out.println();
    Animal5 d1 = new Dog5();
  }
}
class Animal5{
  Animal5(){
    System.out.println("Parent class constructor");
  }
}
class Dog5 extends Animal5{
  Dog5(){
    System.out.println("child class constructor");
  }
}
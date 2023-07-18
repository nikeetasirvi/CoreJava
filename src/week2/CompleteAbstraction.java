package week2;
public class CompleteAbstraction{
  public static  void main(String[] args){
    Animal a = new Dog();
    a.makeSound();
    Animal a1 = new Cat();
    a1.makeSound();
    
    Dog d = new Dog();
    d.makeSound();
    Cat c = new Cat();
    c.makeSound();
  }
}
abstract class Animal{
  abstract void makeSound();
}
class Dog extends Animal{
  void makeSound(){
    System.out.println("Bark");
  }
}
class Cat extends Animal{
  void makeSound(){
    System.out.println("Meow");
  }
}


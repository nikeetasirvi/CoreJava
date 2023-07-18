package week2;

public class SuperDemo1{
  public static void main(String args[]) {
    Animal4 a = new Animal4();
    a.animalSound(); 
    System.out.println();
    
    Dog4 d = new Dog4();
    d.animalSound();
    System.out.println();
    
    Animal4 d1 = new Dog4();
    d1.animalSound(); 
  }
}
class Animal4{
  String type = "land animal";
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}
class Dog4 extends Animal4{
  public void animalSound() {
    super.animalSound(); // calling parent class method
    System.out.println("type = " + super.type); // calling parent class attribute
    System.out.println("The dog says: bow wow");
  }
}
package week2;

public class SuperDemo2{
  public static void main(String args[]) {
    Name n = new Name("nikeeta");
    System.out.println();
    Age a = new Age(24);
    System.out.println();
    Name n1 = new Age(24);
  }
}
class Name{
  String studentName;
  Name(String s){
    studentName = s;
    System.out.println("name = "+studentName);
  }
}
class Age extends Name{
  int studentAge;
  Age(int a){
    super("nikeeta"); // calling super class constructor
    studentAge = a;
    System.out.println("age = "+studentAge);
  }
}
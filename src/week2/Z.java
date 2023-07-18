package week2;

public class Z extends Y{
  public static void main(String[] args){
    X x = new Z();
    x.run();
    X x1 = new Y();
    x1.run();
  }
}
class X{
  void run(){
    System.out.println("Parent class method");
  }
}
class Y extends X{
  void run(){
    System.out.println("Middle class method");
  }
}
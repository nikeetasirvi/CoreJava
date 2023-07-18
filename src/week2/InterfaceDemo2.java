package week2;

public class InterfaceDemo2{
  public static  void main(String[] args){
    Main m = new Main();
    m.print();
    
    show1 m1 = new Test();
    m1.print();
    
    print1 m2 = new Test();
    m2.print();
  }
}
interface print1{
  public void print();
}
interface show1{
  public void print();
}
class Test implements print1,show1{
  public void print(){
    System.out.println("print");
  }
}

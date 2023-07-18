package week2;

public class InterfaceDemo1{
  public static  void main(String[] args){
    Main m = new Main();
    m.print();
    m.show();
    
    show m1 = new Main();
    //m1.print(); // will give error
    m1.show();
    
    print m2 = new Main();
    m2.print();
    //m2.show();  // will give error
  }
}
interface print{
  public void print();
}
interface show{
  public void show();
}
class Main implements print,show{
  public void print(){
    System.out.println("print");
  }
  public void show(){
    System.out.println("show");
  }
}

package week2;
public class B extends A{
  public void hello(){
    System.out.println("Child hello");
  }
  public void show(){
    System.out.println("show");
  }
  public static void main(String[] args){
    A a = new A();
    a.hello();
    
    B b = new B();
    b.hello();
    b.show();
    
    /*B class will be searched for the methods called but those methods should be there in A class also
     * hence show is not there in A class it will give error.
     */
    A a1 = new B();// B class object and A class reference
    a1.hello();
    //a1.show();
  }
}
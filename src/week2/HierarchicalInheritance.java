package week2;
class HierarchicalInheritance{

  void print(){
  
    System.out.println("parent class method");
  }
  
  public static void main(String[] args){
  
    A1 a1 = new A1();
    a1.print();
    a1.printA1();
    
    A2 a2 = new A2();
    a2.print();
    a2.printA2();
    
  }
}
class A1 extends HierarchicalInheritance{

  void printA1(){
  
    System.out.println("class A1 method");
  }
}
class A2 extends HierarchicalInheritance{

  void printA2(){
  
    System.out.println("class A2 method");
  }
}
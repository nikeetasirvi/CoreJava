package week2;

class MethodOverloading{
  public static void main(String[] args){
    System.out.println(TestOverloading.add(11,11));
    System.out.println(TestOverloading.add(11,11,11));
    
    //compile time polymorphism
  }
}
class TestOverloading{
  static int add(int a,int b){
    return a+b;
  }
  static int add(int a,int b,int c){
    return a+b+c;
  }  
} 
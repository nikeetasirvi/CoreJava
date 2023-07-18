package week1;
public class StaticDemo{
  
  int var1 = 10;
  static int var2 = 10;
  
  public void method(int o){
  
    var1++;
    System.out.println("var1 for object " +o+ " = " +var1);
    var2++;
    System.out.println("var2 for object " +o+ " = " +var2);
    System.out.println();
  }

  public static void main(String[] args){
  
    StaticDemo sd1 = new StaticDemo();
    sd1.method(1);
    StaticDemo sd2 = new StaticDemo();
    sd2.method(2);
    StaticDemo sd3 = new StaticDemo();
    sd3.method(3);
    System.out.println(+var2);
    
  }
}
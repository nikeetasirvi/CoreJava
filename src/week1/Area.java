package week1;
public class Area{

  float radius,result;
  final float pi = 3.14f;
  
  public static void main(String[] args){
  
    Area a = new Area();
    a.radius = 12.2f;
    a.result = a.radius * a.radius * a.pi;
    System.out.println("Area is " +a.result);
    
  }
}
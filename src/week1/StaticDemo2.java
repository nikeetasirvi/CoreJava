package week1;
public class StaticDemo2{

  static int count = 0;
  int i = 0;
  
  StaticDemo2(){
  
    count++;
    System.out.print(count);
    i++;
    System.out.println(" " +i);
  }
  
  public static void main(String[] args){
	  
	  StaticDemo2 c1 = new StaticDemo2();
	  StaticDemo2 c2 = new StaticDemo2();
	  StaticDemo2 c3 = new StaticDemo2();
    
  }
}
package week1;

class Addition{

	  static int add(int a, int b, int c){
	  
	    return a+b+c;
	  }
	  static int add(int a, int b){
	  
	    return a+b;
	  }
}
public class MethodOverloading{

	  public static void main(String[] args){
	  
	    System.out.println(Addition.add(10,20));
	    System.out.println(Addition.add(10,20,30));
	    
	  }
}
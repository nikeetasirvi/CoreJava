package week1;
public class StaticDemo1{

  static int count = 10;
  
  public static void CheckStatic(){
  
    int i = 5;
    i++;
    System.out.print(i);
    System.out.println(" " +count);
  } 
  
  public static void main(String[] args){
  
    while(count-- > 0){ //first compare the count value with 0, then decreement
      CheckStatic(); //this is a static method so, it doesnt need object i.e  sd.CheckStatic() or class i.e   StaticDemo1.CheckStatic()
    }
    /*the above thing can be written in this way also
    while(count > 0){
      count--;
      CheckStatic();
    }*/
    
  }
}
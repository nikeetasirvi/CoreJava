package week2.collections;
import java.util.*;

public class Enumerator{

  public static void main(String[] args){
  
    Vector a = new Vector();
    a.add("Nikeeta");
    a.add("Lalita");
    
    Enumeration e = a.elements();
    while(e.hasMoreElements()){
      System.out.println(e.nextElement());
    }
  }
}
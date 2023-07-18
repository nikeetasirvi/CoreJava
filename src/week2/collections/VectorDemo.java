package week2.collections;
import java.util.Vector;

public class VectorDemo{

  public static void main(String[] args){
  
    Vector<String> v = new Vector<String>(25); // starting capacity 25 
    v.add("Alice");
    System.out.println("size : " +v.size());
    System.out.println("capacity : " +v.capacity());
    
    Vector<String> v1 = new Vector<String>(3,10); // starting capacity 3 but always increment it by 10 when elements exceed the capacity 
    v1.add("Alice");
    v1.add("nikeeta");
    v1.add("lalita");
    v1.add("manoj");
    System.out.println("size : " +v1.size());
    System.out.println("capacity : " +v1.capacity());
    
    System.out.println(v1.get(2));
    System.out.println(v1.elementAt(2));
    
    System.out.println(v1.firstElement());
    System.out.println(v1.lastElement());
    
    v1.removeElementAt(2);
    v1.insertElementAt("jonh", 2);  
    
    System.out.println(v1);
    
    // this will also run but in dr java not in cmd
    /*Vector v = new Vector(); // default capacity is 10
    v.add("Alice");
    v.add(25);
    v.add(10.5);
    v.add(new student());
    System.out.println("size : " +v.size());
    System.out.println("capacity : " +v.capacity());*/
  }
}
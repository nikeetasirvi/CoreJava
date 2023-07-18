package week2.collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo{

  public static void main(String[] args){
  
    //order not maintained
    HashSet<Integer> h = new HashSet<>();
    h.add(10);
    h.add(20);
    h.add(30);
    h.add(20);
    h.add(null);
    h.add(null); // allow single null
    System.out.println(h);
    
    //order maintained
    LinkedHashSet<Integer> h1 = new LinkedHashSet<>();
    h1.add(10);
    h1.add(20);
    h1.add(30);
    h1.add(20);
    h1.add(null);
    h1.add(null);
    System.out.println(h1.contains(20));
    System.out.println(h1);
    
    // sorted
    TreeSet<Integer> h2=new TreeSet<>();  
    h2.add(30);
    h2.add(20);
    h2.add(60);
    //h2.add(null); // give runtime error because no null allowed
    System.out.println(h2);
    
    System.out.println(h2.first());
    System.out.println(h2.last());
    System.out.println(h2.higher(30));
    System.out.println(h2.lower(30));
  }
}
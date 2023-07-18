package week2.collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.Enumeration;
import week2.A;

public class MapDemo{

  public static void main(String[] args){
  
    //order not maintained
    HashMap<Integer,String> h = new HashMap<>();
    h.put(101,"Nikeeta");
    h.put(102,"Lalita");
    h.put(103,"Manoj");
    h.put(103,"Manoj");
    h.put(105,null);
    h.put(null,null); //allowed single null key and allowed multiple null values
    h.put(null,"eeee"); //will overwrite null value at above null key as single null key is allowed
    h.put(103,"Bhumi"); // this will overwrite manoj at index 103
    System.out.println(h);
    System.out.println(h.get(101));
    
    //order maintained
    LinkedHashMap<Integer,String> h1 = new LinkedHashMap<>();
    h1.put(101,"Nikeeta");
    h1.put(102,"Lalita");
    h1.put(103,"Manoj");
    h1.put(null,null);
    System.out.println(h1);
    System.out.println(h1.get(101));
    
    LinkedHashMap<Integer,A> h2 = new LinkedHashMap<>();
    h2.put(101,new A());
    h2.put(102,new A());
    h2.put(103,new A());
    System.out.println(h2);
    A a = h2.get(101);
    a.hello();
    
    // sorted keys naturally
    TreeMap<Integer,String> h3 = new TreeMap<>();
    h3.put(101,"Sunday");
    h3.put(105,"Monday");
    h3.put(103,"tuesday");
    h3.put(106,"wednesday");
    //h3.put(null,"xyz"); //give error as null keys not allowed
    h3.put(106,"Thursday"); //override
    System.out.println(h3);
    
    //synchronized(thread safe)
    Hashtable<Integer,String> h4 = new Hashtable<>();
    h4.put(101,"jan");
    h4.put(102,"feb");
    h4.put(105,"march");
    h4.put(103,"april");
    h4.put(103,"may"); //override
    //h4.put(null,"xyz"); //give error as null keys not allowed
    System.out.println(h4);
    h4.remove(105);
    System.out.println(h4);
    System.out.println(h4.get(101));
    
    Hashtable<String,Integer> h5 = new Hashtable<String,Integer>();
    h5.put("Nikeeta",2000);
    h5.put("Lalita",9000);
    h5.put("Manoj",6000);
    Enumeration e = h5.keys(); // by this we can store keys
    // Enumeration e = h5.elements(); //by this we can store values
    int value,max=0;
    String key,name = null;
    while(e.hasMoreElements()){
      key = (String)e.nextElement();
      value = h5.get(key);
      if(value > max){
        max=value;
        name=key;
      }
    }
    System.out.println("Maximum salary is of " +name+ " : " +max);
    
  }
}
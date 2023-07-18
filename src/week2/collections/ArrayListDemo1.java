package week2.collections;
import java.util.ArrayList;
import week2.A;
public class ArrayListDemo1{

  public static void main(String[] args){
  
    ArrayList<Object> list = new ArrayList<>();
    // object is the parent class of all primitive datatype classes hence it will take all type of data
    list.add("Nikeeta");
    list.add(25);
    list.add(10.5);
    list.add(new A()); 
    A a = (A)list.get(3); //typecasting done
    a.hello();
    for(Object o:list){
      System.out.println(o);
    }
    System.out.println();
    
    ArrayList<A> list1 = new ArrayList<>();
    list1.add(new A());
    A a1 = list1.get(0); // no typecasting required
    a1.hello();
  }
}
// class A is there in program B
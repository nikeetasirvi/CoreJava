package week2.collections;
import java.util.Stack;

public class StackDemo{

  public static void main(String[] args){
  
    // allow null and dublicates
    //maintains order
    Stack<Integer> s = new Stack<Integer>();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(null);
    s.push(null);
    s.push(10);
    System.out.println(s);
    s.pop();
    System.out.println(s);
  }
}
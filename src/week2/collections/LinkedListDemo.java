package week2.collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedListDemo{

  public static void main(String[] args){
    
    LinkedList<Integer> list = new LinkedList<>();
    List<Integer> list1 = new LinkedList<>();
    System.out.println(list);
    System.out.println(list.peek());
    
    list.add(10);
    list.add(1,20);
    list1.addAll(list);
    list1.addAll(2,list);
    System.out.println(list+ "\n" +list1);
    
    list.addFirst(0);
    list.addLast(30);
    System.out.println(list+ "\n" +list1);
    
    System.out.println(list.contains(100));
    System.out.println(list.element());
    System.out.println(list1.size());
    
    System.out.println(list.get(2));
    System.out.println(list.getFirst());
    System.out.println(list.getLast());
    
    System.out.println(list1.indexOf(20));
    System.out.println(list1.lastIndexOf(20));
    
    list.offer(30); //adds element at the tail
    list.offerFirst(0);
    list.offerLast(40);
    System.out.println(list+ "\n" +list1);
    
    System.out.println(list.peek()); //retrives first element
    System.out.println(list.peekFirst());
    System.out.println(list.peekLast());
    
    list.poll(); //retrives and remove the first element
    list.pollFirst();
    list.pollLast();
    System.out.println(list+ "\n" +list1);
    
    list.pop();
    list.push(40);
    System.out.println(list+ "\n" +list1);
    
    list.remove();
    System.out.println(list+ "\n" +list1);
    list.remove(2);
    System.out.println(list+ "\n" +list1);
    System.out.println(list.removeFirst());
    System.out.println(list.removeLast());
    System.out.println(list+ "\n" +list1);
    list.add(10);
    list.add(20);
    list.add(10);
    list.add(20);
    list.removeFirstOccurrence(20);
    list.removeLastOccurrence(10);
    System.out.println(list+ "\n" +list1);
    
    ListIterator<Integer> itr = list.listIterator();
    while(itr.hasNext()){
      System.out.println(itr.next()+ " ");
    }
    
    Iterator<Integer> itr1 = list.descendingIterator();
    while(itr1.hasNext()){
      System.out.println(itr1.next()+ " ");
    }
    
    System.out.println(list1);
    Collections.sort(list1); // directly ascending order conversion
    System.out.println(list1);
    Collections.reverse(list1); // first we converted to ascending(above) and now reverses it so it is descending order
    System.out.println(list1);
    //Collections.sort(list1,Collections.reverseOrder()); //directly descending order conversion
    //Arrays.sort(arr,Collections.reverseOrder()); // this also workes if arr is Integer type
  }
}
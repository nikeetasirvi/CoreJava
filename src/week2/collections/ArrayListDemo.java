package week2.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class ArrayListDemo{

  public static void main(String[] args){
    
    //method1
    ArrayList<Integer> list1 = new ArrayList<>(20); // initial size of array is 20(parameterized constructor). By default 10
    list1.ensureCapacity(50); //new capacity 50
    
    //method2
    // p p=new c (by this we can only use methods present in List class, but the methods specific to ArrayList class cannot be accessed)
    List<Integer> list2 = new ArrayList<>();
    
    //method3
    ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3));
    System.out.println("list3 : " +list3);
    
    //method4
    ArrayList<Integer> list4 = new ArrayList<Integer>(20);
    
    //method4 (this will also run but in dr java not in cmd)
    //ArrayList list4 = new ArrayList();
    //list4.add("Nikeeta");
    //list4.add(25);
    //list4.add(10.5);*/
    //list4.add(new student());
    
    System.out.println("list1 : " +list1+ "\nlist2 : " +list2);
    
    list1.add(1);
    list1.add(2);
    System.out.println("list1 :" +list1);
    
    list1.add(0,3);
    System.out.println("list1 :" +list1);
    
    list2.add(7);
    list2.add(8);
    System.out.println("list2 :" +list2);
    
    list2.addAll(list1);
    System.out.println("Added all elements of list1 in list2 " +list2);
    
    System.out.println("list2 contains list1? : " +list2.containsAll(list1));
    
    list2.set(2,101);
    System.out.println("list2 :" +list2);
    
    list1.remove(0);
    System.out.println("list1 :" +list1);
    
    System.out.println("get the element at index 3 of list2 : " +list2.get(3));
    
    list1.addAll(1,list2);
    System.out.println("added all elements of list2 in list1 from index 1: " +list1);
    
    System.out.println("list1 conatins 101? : " +list1.contains(101));
    
    System.out.println("index of 101 in list1 is : " +list1.indexOf(101));
    
    list1.add(101);
    System.out.println("list1 :" +list1);
    
    System.out.println("last index of 101 in list1 : " +list1.lastIndexOf(101));
    System.out.println("is list1 empty? : " +list1.isEmpty());
    System.out.println("size of list1 : " +list1.size());
    System.out.println("sublist of list1 from index 3-6 : " +list1.subList(3,6));
    
    Collections.sort(list1);
    System.out.println("sorted list1 :" +list1);
    
    Collections.reverse(list1);
    System.out.println("reversed list1 :" +list1);
    
    System.out.println("max of list1 :" +Collections.max(list1));
    System.out.println("min of list1 :" +Collections.min(list1));
    
    //example of toArray
    Integer[] arr = {};
    arr = list1.toArray(arr);
    System.out.print("transfered all elements of list1 toarray : ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
    
    //printing whole list by ourself
    System.out.print("printing whole list by for each : ");
    for (int i : list1) {
      System.out.print(i+ " ");
    }
    System.out.println();
    System.out.println();
    
    list1.add(95);
    System.out.println("list1 :" +list1);
    System.out.println("list2 :" +list2);
    list1.retainAll(list2);
    System.out.println("retainedAll list2 elements in list1 and remove rest of all :" +list1);
    System.out.println();
    
    list1.removeAll(list2);
    System.out.println("removed all elements of list2 from list1 :" +list1);
    
    //clear whole list
    list1.clear();
    System.out.println("cleared list1 : " +list1);
    if(list1.isEmpty()){
      System.out.println("list1 isEmpty? : yes");
    }
    
  }
}
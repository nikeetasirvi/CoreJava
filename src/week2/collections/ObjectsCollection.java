package week2.collections;
import java.util.ArrayList; 

public class ObjectsCollection{
  int acno;
  String actypye; 
 
  ObjectsCollection(int a, String b)
  { 
    acno = a; 
    actypye = b; 
  }
  
  void display()
  {
    System.out.println(acno+ " " +actypye); 
  } 
  
  public static void main(String args[]){
    
    ArrayList<ObjectsCollection> Accountlist = new ArrayList<ObjectsCollection>();
  
    ObjectsCollection a1 = new ObjectsCollection(1,"Vishwa"); 
    ObjectsCollection a2 = new ObjectsCollection(2,"Prajwal"); 
    ObjectsCollection a3 = new ObjectsCollection(3,"Shubham"); 

    Accountlist.add(a1); 
    Accountlist.add(a2); 
    Accountlist.add(a3);
    
    for(int i=0;i<Accountlist.size();i++)
    {
      Accountlist.get(i).display();
    } 
 }
}
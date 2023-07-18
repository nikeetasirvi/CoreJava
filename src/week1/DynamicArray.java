package week1;
public class DynamicArray{

  int[] arr;
  int capacity;
  int size;
  
  DynamicArray(int capacity){
  
    this.capacity = capacity; //"this.capacity" is the above capacity & "capacity" is the argument capacity
    size = 0;
    arr = new int[capacity];   
  }
  
  void InsertAtIndex(int index,int value){
    
    if(capacity == size){
      GrowArray();
    }
    for(int i=size; i>index; i--){
      arr[i] = arr[i-1];
    }
    arr[index] = value;
    size++;
  }
  
  void InsertAtEnd(int value){
  
    if(capacity == size){
      GrowArray();
    }
    arr[size] = value;
    size++;
  }
  
  void GrowArray(){
  
    int[] temp = new int[capacity*2];
    for(int i=0; i<size; i++){
      temp[i] = arr[i];
    }
    capacity = capacity*2;
    arr = temp;
  }
  
  void DeleteAtEnd(){
    
    arr[size-1] = 0;
    size--;
  }
  
  void DeleteAtIndex(int index){
  
    if (index >= size){
      System.out.println("cannot delete item");
    } else{
      for(int i=index+1; i<size; i++){
        arr[i-1] = arr[i];
      }
      arr[size-1] = 0;
      size--;
    }
  }
  
  void Display(){
  
    for(int i=0; i<size; i++){
      System.out.println("size array " +arr[i]);
    }
    for(int i=0; i<capacity; i++){
      System.out.println("capacity array " +arr[i]);
    }
  }
  
  public static void main(String[] args){
  
    DynamicArray da = new DynamicArray(3);
    da.InsertAtEnd(10);
    da.InsertAtEnd(20);
    da.InsertAtEnd(30);
    da.InsertAtEnd(40);
    da.Display();
    System.out.println();
    da.DeleteAtIndex(1);
    da.Display();
    da.DeleteAtEnd();
    da.Display();
    da.InsertAtEnd(40);
    da.Display();
    da.InsertAtIndex(1,20);
    da.Display();
    da.InsertAtEnd(50);
    da.InsertAtEnd(60);
    da.Display();
    System.out.println(da.size);
    System.out.println(da.capacity);
    da.DeleteAtIndex(5);
    da.Display();
  }
}
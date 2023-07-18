package week1;
class ThreeDimensionShape{
  
  int length, bredth, height;
  
  ThreeDimensionShape(){
    
    length = bredth = height = 0;
  }
  
  ThreeDimensionShape(int l){
  
    length = bredth = height = l;
  }
  
  ThreeDimensionShape(int l, int b, int h){
  
    length = l;
    bredth = b;
    height = h;
  }
  
  int volume(){
  
    return length*bredth*height;
  }
  
}

public class Main{
  
  //above code can also be written here

  public static void main(String[] args){
  
    int volume;
    
    ThreeDimensionShape shape1 = new ThreeDimensionShape();
    volume = shape1.volume();
    System.out.println("Volume = " +volume);
    
    ThreeDimensionShape shape2 = new ThreeDimensionShape(2);
    volume = shape2.volume();
    System.out.println("Volume = " +volume);
    
    ThreeDimensionShape shape3 = new ThreeDimensionShape(2, 8, 4);
    volume = shape3.volume();
    System.out.println("Volume = " +volume);
    
  }
}
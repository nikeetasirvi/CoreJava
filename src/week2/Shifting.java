package week2;

public class Shifting{

  int performLeftShift(){
    int num = 10;
    return num<<2;
  }
  void performRightShift(int value,int digitsToShift){
    System.out.println(value>>digitsToShift);
  }
  
  public static void main(String[] args){
  
    Shifting s = new Shifting();
    System.out.println(s.performLeftShift());
    s.performRightShift(10,2);
  }
}
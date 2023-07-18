package week1;
public class Array1D{

  public static void main(String[] args){
  
    //method 1
    int[] rollNo = new int[5];
    
    rollNo[0] = 27;
    rollNo[1] = 201;
    rollNo[2] = 116;
    rollNo[3] = 59;
    rollNo[4] = 90;
    
    for(int i=0; i<5; i++){
    
      System.out.println(rollNo[i]);
    }
    
    //method 2
    String[] name = {"Nikeeta","Lalita","Tina","Meena","Reena"};
    
    for(int i=0; i<rollNo.length; i++){  //using length
    
      System.out.println(name[i]);
    }
    
  }
}
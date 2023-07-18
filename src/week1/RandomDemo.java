package week1;
import java.util.Random;

public class RandomDemo{

  public static void main(String[] args){
  
    Random rn = new Random();
    int[] arr = new int[5];
    
    for(int i=0; i<arr.length ; i++){
      //generate random numbers between 0 to 99
      arr[i] = rn.nextInt(100);
      System.out.print(arr[i]+ " ");
    }
    
    //rn.nextFloat, Double, Long, Boolean can also be used
  }
}
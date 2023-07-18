package week1;
public class Array2DNonRectangle{

  public static void main(String[] args){
  
    int[][] arr = new int[5][];
    
    //method 1
    arr[0] = new int[1]; //row 0 will have 1 columns
    arr[1] = new int[2]; //row 2 will have 2 columns
    arr[2] = new int[3];
    arr[3] = new int[4];
    arr[4] = new int[5];
    
    //method 2
    for(int i=0; i<5; i++){
      arr[i] = new int[i+1];
    }
    
    for(int i=0; i<5; i++){
    
      for(int j=0; j<=i; j++){
      
        System.out.print(" " +arr[i][j]);
      }
      System.out.println();
    }
  }
}
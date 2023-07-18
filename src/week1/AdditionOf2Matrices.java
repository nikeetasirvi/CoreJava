package week1;
public class AdditionOf2Matrices{

  public static void main(String[] args){
  
    int[][] a = {{1,2,3},{4,5,6}};
    int[][] b = {{1,2,3},{4,5,6}};
    
    int rows = a.length;
    int cols = a[0].length;
    
    int[][] c = new int[rows][cols];
    
    for(int i=0; i<rows; i++){
    
      for(int j=0; j<cols; j++){
      
        c[i][j] = a[i][j] + b[i][j];
        System.out.print(c[i][j]+ "  ");
      }
      System.out.println();
    }
    
  }
}
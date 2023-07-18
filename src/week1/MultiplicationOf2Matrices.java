package week1;
public class MultiplicationOf2Matrices{

  public static void main(String[] args){
  
    int[][] a = {{1,2},{4,5}};
    int[][] b = {{1,2},{4,5}};
    
    int arows = a.length;
    int acols = a[0].length;
    int brows = b.length;
    int bcols = b[0].length;
    
    int[][] c = new int[arows][bcols];
    
    if(acols != brows){
      
      System.out.println("Matrix cannot be multiplied");
      
    } else{
      
      for(int i=0; i<arows; i++){
        
        for(int j=0; j<bcols; j++){
          
          int sum = 0;
          
          for(int k=0; k<acols; k++){
            sum = sum + a[i][k]*b[k][j];
          }
          c[i][j] = sum;
        }
      }
      
      for (int i=0; i<arows; i++) {
            for (int j=0; j<bcols; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
      
    }
    
  }
}
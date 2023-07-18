package week1;
import java.util.Scanner;

public class Array2D{

  public static void main(String[] args){
  
    //method 1
    int[][] numbers = {{1,2},{3,4},{5,6}};
    
    for(int i=0; i<3; i++){
    
      for(int j=0; j<2; j++){
      
        System.out.print(" " +numbers[i][j]);
      }
      System.out.println();
    }
    
    //method 2
    Scanner input = new Scanner(System.in);
    System.out.println("enter no of rows");
    int rows = input.nextInt();
    System.out.println("enter no of columns");
    int columns = input.nextInt();
    
    int[][] numbers1 = new int[rows][columns];
    
    for(int i=0; i<rows; i++){
    
      System.out.println("enter values for row " +i);
      
      for(int j=0; j<columns; j++){
      
        System.out.println("enter values for column " +j);
        numbers1[i][j] = input.nextInt();
      }
    }
    
    for(int i=0; i<rows; i++){
    
      for(int j=0; j<columns; j++){
      
        System.out.print(" " +numbers1[i][j]);
      }
      System.out.println();
    }
    input.close();
  }
}
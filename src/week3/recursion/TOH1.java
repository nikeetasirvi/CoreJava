package week3.recursion;
public class TOH1{

  public static void minSteps(int n, char s, char d, char a){
    if(n==1){
      System.out.println("move disk 1 from pole " +s+ " to pole " +d);
      return;
    }
    minSteps(n-1,'s','a','d');
    System.out.println("move disk " +n+ " from pole " +s+ " to pole " +d);
    minSteps(n-1,'a','d','s');
  }
  
  public static void main(String[] args){
    minSteps(3,'s','d','a');
  }
}
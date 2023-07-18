package week3.recursion;
public class TOH{

  public static int minSteps(int n, char s, char d, char a){
    if(n==0 || n==1){
      return n;
    }
    int move1 = minSteps(n-1,'s','a','d');
    int move2 = 1;
    int move3 = minSteps(n-1,'a','d','s');
    return move1+move2+move3;
  }
  
  public static void main(String[] args){
    System.out.println(minSteps(2,'s','d','a'));
  }
}
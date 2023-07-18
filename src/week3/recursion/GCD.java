package week3.recursion;
public class GCD{

  public static int gcd(int n1, int n2){
    if(n2==0){
      return n1;
    }
    return gcd(n2,n1%n2);
  }
  
  public static void main(String[] args){
  
    int n1=60,n2=24;
    System.out.println(gcd(n1,n2));
  }
}
package prework;
public class Printf{

  public static void main(String[] args){
  
    int i = 10;
    String s = "Nikeeta Sirvi";
    float f = 30.3589f;
    double d = 100.254587965478596;
    boolean b = true;
    char c = 'A';
    
    System.out.printf("i,s,f,d,b,c = %d %s %.2f %.2f %b %c %n", i,s,f,d,b,c);
    System.out.printf("%% %e %n",d); //%% to print %, %e to print exponential form of double or float and %n for newline
    
  }
}
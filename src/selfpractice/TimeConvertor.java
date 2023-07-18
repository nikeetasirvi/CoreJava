package selfpractice;
import java.util.Scanner;

public class TimeConvertor{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter minutes");
    long Minutes = input.nextLong();
    
    double Days = (double) Minutes / 1440;
    double Years = Days / 365;
    
    System.out.printf("%d minutes is approximately %.1f days & %.1f years",Minutes,Days,Years);
    
  }
}
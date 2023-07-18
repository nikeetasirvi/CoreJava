package selfpractice;
import java.util.Scanner;

public class TemperatureConvertor{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the temperature in Farenheit");
    double Farenheit = input.nextDouble();
    
    double Celcius = (Farenheit - 32) * 5/9;
    System.out.println(Farenheit + " degree Farenheit in Celcius is equal to " + Celcius + " degree Celcius");
    
  }
}
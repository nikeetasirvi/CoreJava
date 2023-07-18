package selfpractice;
import java.util.Scanner;

public class MeasurementConvertor{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter inches");
    double Inches = input.nextDouble();
    
    double Meters = Inches * 0.0254;
    //double Meters = Inches / 39.37;
    System.out.println(Inches + " inches is " + Meters + " meters");
    System.out.printf("%.2f inches is %.2f meters",Inches,Meters);
    
  }
}
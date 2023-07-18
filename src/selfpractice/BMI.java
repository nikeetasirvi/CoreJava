package selfpractice;
import java.util.Scanner;

public class BMI{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your weight in pounds");
    double Weight = input.nextDouble();
    System.out.println("Enter your height in inches");
    double Height = input.nextDouble();
    
    double BMI1 = Weight/(Height*Height); //to calculate in lbs/in2
    double BMI2 = 703 * Weight / (Height*Height); //to convert lbs/in2 into kg/m2
    
    System.out.printf("BMI is %.2f lbs/in2 %n",BMI1);
    System.out.printf("BMI is %.2f kg/m2 %n",BMI2);
  }
}
package prework;
import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        boolean isAnInteger = input.hasNextInt();
    
        if(isAnInteger){

            int Year = input.nextInt();

            if((Year % 400 == 0) || (Year % 4 == 0 && Year % 100 !=0)){

                System.out.println(Year + " is LeapYear");
            } else{

                System.out.println(Year + " is NotLeapYear");
            }
        } else{

            System.out.println("please enter an integer value");
        }
    }
}
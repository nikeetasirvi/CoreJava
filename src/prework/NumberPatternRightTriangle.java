package prework;
import java.util.Scanner;
public class NumberPatternRightTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int Row = input.nextInt();

        if(Row <= 0){

            System.out.println("Invalid Input");

        } else{

            for(int RowCount = 1; RowCount <= Row; RowCount ++){

                for(int Numbers = 1; Numbers <= RowCount; Numbers ++){

                    System.out.print(RowCount + " ");

                }
        
                System.out.println();
            }

        }

    }
}
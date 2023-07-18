package prework;
import java.util.Scanner;
public class BinaryPatternSquare{

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int Row = input.nextInt();
        int num;

        if(Row <= 0){
            System.out.println("Invalid Input");
        } else{

            for(int RowCount = 1; RowCount <= Row; RowCount ++){

                if(RowCount % 2 == 0){
                    num = 0;
                    for(int Numbers = 1; Numbers <= Row; Numbers ++){
                        System.out.print(+ num);
                        num = (num == 0) ? 1 : 0;
                    }
                } else{
                    num = 1;
                    for(int Numbers = 1; Numbers <= Row; Numbers ++){
                        System.out.print(+ num);
                        num = (num == 1) ? 0 : 1;
                    }
                }

                System.out.println();
            }

        }

    }
}
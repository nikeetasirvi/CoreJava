package prework;
import java.util.Scanner;
public class StarPatternPyramid{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Row = input.nextInt();

        if(Row <= 0){

            System.out.println("Invalid Input");

        } else{

            int temp = 1;
            
            for(int RowCount = 1; RowCount <= Row; RowCount ++){
            
                for(int Space = Row - RowCount; Space > 0; Space --){
                
                    System.out.print(" ");
                }
                
                for(int Stars = 1; Stars <= temp; Stars ++){
                    
                    if(Stars % 2 == 0){
                        
                        System.out.print(" ");
                    } else{

                        System.out.print("*");
                    }
                }
                
                temp = temp + 2;
                System.out.println();
            }
        }
    }
}

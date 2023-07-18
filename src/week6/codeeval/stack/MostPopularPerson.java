package week6.codeeval.stack;

//import java.util.Arrays;
import java.util.Scanner;

public class MostPopularPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of students in the class:");
        int n = input.nextInt();
        input.nextLine(); // consume the newline character
        
        int[] knows = new int[n]; // number of people each person knows
        int[] isKnownBy = new int[n]; // number of people who know each person
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the string for student " + i + ":");
            String line = input.nextLine();
            for (int j = 0; j < n; j++) {
                if (line.charAt(j) == '1') {
                    knows[i]++;
                    isKnownBy[j]++;
                }
            }
        }
//        System.out.println(Arrays.toString(knows));
//        System.out.println(Arrays.toString(isKnownBy));
        int famousIndex = -1;
        for (int i = 0; i < n; i++) {
            if (knows[i] == 1 && isKnownBy[i] == n) {
                famousIndex = i;
                break;
            }
        }
        
        if (famousIndex == -1) {
            System.out.println("No famous person in class");
        } else {
            System.out.println("famous person index is " +famousIndex);
        }
        
        input.close();
    }
}
/*
 * we can also do this program as:
 * 			nikeeta lalita manoj bhumi
 * nikeeta  | 1    |      0      0      0     // all zero
 * 			|______|______________________
 * lalita   |1     |     0      1      1
 * manoj    |1     |     1      0      1
 * bhumi    |1     |     1      1      0
 *          //all one
 *          
 * in this nikeeta will be the answer because nikeeta row has all 0 and nikeeta column has all 1
 * 
 */
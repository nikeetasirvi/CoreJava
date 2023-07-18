package prework;
import java.util.Scanner;
public class Parity{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Number = input.nextInt();
        String Parity = (Number % 2 == 0) ? "No is Even" : "No is odd";
        System.out.println(Parity);
    }
}
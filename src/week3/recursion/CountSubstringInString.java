package week3.recursion;
import java.util.Scanner;

public class CountSubstringInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String t = sc.nextLine();

		int count = 0;
		
		for (int i = 0; i <= s.length() - t.length(); i++) {
			if (s.substring(i, i + t.length()).equals(t)) {
				count++;
			}
		}

		System.out.println(count);
	}
}

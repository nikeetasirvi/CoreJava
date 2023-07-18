package week4_5.searching_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOfAddIsMin {

	public static void main(String[] args) {
		System.out.println("enter the value of N");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int boys[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter the height of boy " + (i + 1));
			boys[i] = sc.nextInt();
		}

		int girls[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter the height of girl " + (i + 1));
			girls[i] = sc.nextInt();
		}

		Arrays.sort(boys);
		Arrays.sort(girls);

		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (boys[i] + girls[n - 1 - i] > sum) {
				sum = boys[i] + girls[n - 1 - i];
			}
		}
		System.out.println(sum);

	}
}

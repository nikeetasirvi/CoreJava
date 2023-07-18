package week6.codeeval.queue;

import java.util.Scanner;

public class ShortestSubarrayAtleastSumIsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter k");
        int k = sc.nextInt();

        int left = 0;
        int right = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE; // Initialize answer to maximum integer value

        while (right < n) {
            sum += arr[right];
            while (sum >= k) {
                length = Math.min(length, right - left + 1);
                sum -= arr[left];
                left++;
            }
            right++;
        }

        if (length == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(length);
        }
    }
}

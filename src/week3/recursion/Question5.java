package week3.recursion;

import java.util.*;

public class Question5 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " +n+ " numbers");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter target sum");
		int targetSum = sc.nextInt();

		// find all subsets that add up to the target sum
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		printTargetSumSubsets(arr, 0, new ArrayList<>(), result, targetSum);

		// print the subsets that add up to the target sum
		for (ArrayList<Integer> subset : result) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < subset.size(); i++) {
				sb.append(subset.get(i));
				if (i != subset.size() - 1) {
					sb.append(", ");
				}
			}
			System.out.println(sb.toString());
		}

	}

	// set is the subset
	// sos is sum of subset
	// tar is target
	public static void printTargetSumSubsets(int[] arr, int index, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result, int targetSum) {

		// base case: if we have checked all elements, check if the current subset adds up to the target sum
		if (index == arr.length) {
			int sum = 0;
			for (int num : current) {
				sum += num;
			}
			if (sum == targetSum) {
				result.add(new ArrayList<>(current));
			}
			return;
		}

		// recursive case 1: include the current element in the subset
		current.add(arr[index]);
		printTargetSumSubsets(arr, index + 1, current, result, targetSum);
		current.remove(current.size() - 1);

		// recursive case 2: exclude the current element from the subset
		printTargetSumSubsets(arr, index + 1, current, result, targetSum);
	}

}
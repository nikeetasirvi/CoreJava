package week6.codeeval.linkedlist;

import java.util.*;

class CountPairs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size 1");
		int n1 = sc.nextInt();
		Integer arr1[] = new Integer[n1];

		System.out.println("Enter values for array 1");
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter size 2");
		int n2 = sc.nextInt();
		Integer arr2[] = new Integer[n2];

		System.out.println("Enter values for array 2");
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}

		LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr1));
		LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));

		System.out.println("enter the sum to be found");
		int k= sc.nextInt();
		Solution Code = new Solution();
		System.out.println(Code.countPairs(head1, head2, k));
	}

}

class Solution {

	public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,int k) {
		// add your code here
		int count = 0;
		
		ListIterator<Integer> itr1 = head1.listIterator();
		ListIterator<Integer> itr2 = head2.listIterator();
		
	    while(itr1.hasNext()){
	    	int i = itr1.next();
		    while(itr2.hasNext()){
		    	if((i + itr2.next()) == k) {
		    		count++;
		    	}
		    }
		    itr2 = head2.listIterator();
	    }
		return count;
	}
}

//6
//6 7 1 2 8 8 
//3
//11 12 13
//18

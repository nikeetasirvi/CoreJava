package week6.codeeval.stack;

import java.util.Scanner;

public class LargestBalancedSubstring {

	char[] arr;
	int currentPointer = -1;

	public void push(char element) {
		if(currentPointer >= arr.length-1) {
			System.out.println("Stack overflow");
		} else {
			currentPointer++;
			arr[currentPointer] = element;
		}
	}
	
	public char pop() {
		char ch = arr[currentPointer];
		currentPointer--;
		return ch;
	}
	
	public String findSubstring(String string) {
	    arr = new char[string.length()];
	    String largestSubstring = "";
	    int largestStart = -1;
	    int largestEnd = -1;
	    int currentStart = -1;
	    for(int i=0; i<string.length(); i++) {
	        char ch = string.charAt(i);
	        if(ch == '[') {
	            push(ch);
	            if(currentStart == -1) {
	                currentStart = i;
	            }
	        } else if(ch == ']') {
	            if(currentPointer != -1) {
	                char popped = pop();
	                if(popped == '[') {
	                    if(currentPointer == -1 && i - currentStart > largestSubstring.length()) {
	                        largestSubstring = string.substring(currentStart, i+1);
	                        largestStart = currentStart;
	                        largestEnd = i;
	                    }
	                }
	            } else {
	                currentStart = -1;
	            }
	        }
	    }
	    if(largestStart != -1 && largestEnd != -1) {
	        return string.substring(largestStart, largestEnd+1);
	    } else {
	        return largestSubstring;
	    }
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.nextLine();
		
		LargestBalancedSubstring lbs = new LargestBalancedSubstring();
		System.out.println((lbs.findSubstring(string)).length());
	}

}

package week6.codeeval.stack;

import java.util.Scanner;

public class ReverseStringWords {
	
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

	public String reverseString(String string) {
		arr = new char[string.length()];
		String finalString = "";
		for(int i=0; i<string.length(); i++) {
			char ch = string.charAt(i);
			if(Character.isLetter(ch)) {
				push(ch);
			} else if(ch == '.') {
				for(int j=currentPointer; j>=0; j--) {
					finalString += pop();
				}
				finalString += '.';
			}
		}
		while(currentPointer >= 0) {
	        finalString += pop();
	    }
		return finalString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.nextLine();
		ReverseStringWords rsw = new ReverseStringWords();
		
		System.out.println(rsw.reverseString(string));
	}

}

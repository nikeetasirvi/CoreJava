package week6;

import java.util.Scanner;
import java.util.Stack;

// all same as InfixToPostfix
public class InfixToPrefix {

	public static int precedence(char ch) {
		
		switch (ch) {
			case '^':
				return 3;
			case '/':
			case '*':
				return 2;
			case '+':
			case '-':
				return 1;
		}
		return -1;
	}
	
	public static String infixToPrefix(String infix) {
		StringBuilder prefix = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for(int i=infix.length()-1; i>=0; i--) { // changed this
			char ch = infix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				prefix.append(ch);
			} else if(ch == ')') { // changed this
				stack.push(ch);
			} else if(ch == '(') { // changed this
				while(!stack.isEmpty() && stack.peek()!=')') { // changed this
					prefix.append(stack.pop());
				}
				stack.pop();
			} else {
	            while(!stack.isEmpty() && (precedence(ch)<precedence(stack.peek()))) {
	            	prefix.append(stack.pop());
	            }
	            stack.push(ch);
	        }
		}
		while(!stack.isEmpty()) {
			prefix.append(stack.pop());
		}
		prefix.reverse(); // added this
		return prefix.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String infix = input.nextLine();
		System.out.println(infixToPrefix(infix));
		input.close();
	}
}

//x+y*(p-q) = +x*y-pq
//v+w*x+(y*z) = ++v*wx*yz
//2*4/(2-1)+6*4 = +/*24-21*64(program output) or +*2/4-21*64 (ppt output) because ppt uses <= in precedence
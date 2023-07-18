package week6;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

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
	
	public static String infixToPostfix(String infix) {
		//String postfix = "";
		StringBuilder postfix = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<infix.length(); i++) {
			char ch = infix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				//postfix += ch;
				postfix.append(ch);
			} else if(ch == '(') {
				stack.push(ch);
			} else if(ch == ')') {
				while(!stack.isEmpty() && stack.peek()!='(') {
					//postfix += stack.pop();
					postfix.append(stack.pop());
				}
				stack.pop();
			} else {
	            while(!stack.isEmpty() && (precedence(ch)<precedence(stack.peek()))) {
	                //postfix += stack.pop();
	            	postfix.append(stack.pop());
	            }
	            stack.push(ch);
	        }
		}
		
		while(!stack.isEmpty()) {
			//postfix += stack.pop();
			postfix.append(stack.pop());
		}
		return postfix.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String infix = input.nextLine();
		System.out.println(infixToPostfix(infix));
		input.close();
	}

}
//x+y*(p-q) = xypq-*+ (xy+pq-*)
//v+w*x+(y*z) = vwx*yz*++ or vwx*+yz*+ (program will give first one as output)
//2*4/(2-1)+6*4 = 2421-/*64*+ (program will give first one as output) or 24*21-/64*+ (ppt has this output) because

/* ppt does has precedence(ch)<=precedence(stack.peek())
 * this means in ppt when upmost operator in stack is having equal precedence as the new operator been inserted in stack we
 * they remove the upmost operator in stack and then add new one
 * but in my program if both have same precedence we do not remove from stack and directly add the new operator above the old one in the stack
 * */
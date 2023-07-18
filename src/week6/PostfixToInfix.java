package week6;

import java.util.Stack;

public class PostfixToInfix {

	public static String postfixToInfix(String postfix) {
		Stack<String> stack = new Stack<String>();
		for(int i=0; i<postfix.length(); i++) {
			char ch = postfix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				stack.push("" + ch); // converted char into string
			} else {
				String op1 = stack.pop();
				String op2 = stack.pop();
				stack.push("(" +op2+ "" +ch+ "" +op1+ ")");
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String postfix = "xyzp^q-*+";
		System.out.println(postfixToInfix(postfix));
	}

}

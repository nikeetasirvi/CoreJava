package week6;

import java.util.Stack;

//same as PostfixToInfix
public class PrefixToInfix {

	public static String prefixToInfix(String prefix) {
		Stack<String> stack = new Stack<String>();
		for(int i=prefix.length()-1; i>=0; i--) { // changed this
			char ch = prefix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				stack.push("" + ch);
			} else {
				String op1 = stack.pop();
				String op2 = stack.pop();
				stack.push("(" +op1+ "" +ch+ "" +op2+ ")"); // changed position of op1 and 2
			}
		}
		
		return stack.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prefix = "*-A/BC-/AKL";
		System.out.println(prefixToInfix(prefix));
	}
}

package week6;

import java.util.Stack;

// same as postfixEvaluator
public class PrefixEvaluator {

	public static int evaluate(String prefix){
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=prefix.length()-1; i>=0; i--) { // changed this
			char ch = prefix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				stack.push(ch - '0');
			} else {
				int op1 = stack.pop();
				int op2 = stack.pop();
				switch(ch) {
					case '+':{
						stack.push(op1+op2); //changed the place of op1 and op2
						break;
					}
					case '-':{
						stack.push(op1-op2); //changed the place of op1 and op2
						break;
					}
					case '*':{
						stack.push(op1*op2); //changed the place of op1 and op2
						break;
					}
					case '/':{
						stack.push(op1/op2); //changed the place of op1 and op2
						break;
					}
					case '^':{
						stack.push((int) Math.pow(op1,op2)); //changed the place of op1 and op2
						break;
					}
				}
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		//String prefix = "-+2*34/6^13";
		//String prefix = "+9*26";
		//String prefix = "-+8/632";
		String prefix = "-+7*45+20";
		System.out.println(evaluate(prefix));
	}

}

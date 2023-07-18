package week6;

import java.util.Stack;

public class PostfixEvaluator {

	public static int evaluate(String postfix){
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0; i<postfix.length(); i++) {
			char ch = postfix.charAt(i);
			if(Character.isLetterOrDigit(ch)) {
				stack.push(ch - '0'); //we converted ch into int by doing subtraction operation on it 
				//stack.push((int)ch); //if we converted ch into int like this then the ASCII value of ch is stored into stack so this is wrong
				System.out.println(stack.peek());
			} else {
				int op1 = stack.pop();
				int op2 = stack.pop();
				switch(ch) {
					case '+':{
						stack.push(op2+op1);
						break;
					}
					case '-':{
						stack.push(op2-op1);
						break;
					}
					case '*':{
						stack.push(op2*op1);
						break;
					}
					case '/':{
						stack.push(op2/op1);
						break;
					}
					case '^':{
						stack.push((int) Math.pow(op2,op1)); // math.pow returns double type hence we converted into int
						break;
					}
				}
			}
		}
		return stack.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String postfix = "1230^5-*+";
		System.out.println(evaluate(postfix));
	}

}

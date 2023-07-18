package week6;

import java.util.Stack;

public class RedudantBracketOrNot {

	public static boolean checkRedundancy(String str) {
		Stack<Character> stack = new Stack<Character>();
		char[] charArr = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			if(charArr[i] != ')') {
				stack.push(charArr[i]);
			} else {
				boolean flag = true;
				char topChar = stack.pop();
				while(topChar != '(') {
					if(topChar == '+' || topChar == '-' || topChar == '/' || topChar == '*') {
						flag = false;
					}
					topChar = stack.pop();
				}
				if(flag) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void findRedundant(String str) {
		boolean ans = checkRedundancy(str);
		if(ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(x+y)";
		findRedundant(str);
		
		String str1 = "((x+y))";
		findRedundant(str1);
		
		String str2 = "(z+(x-(s*y)))";
		findRedundant(str2);
		
		String str3 = "(z)";
		findRedundant(str3);
	}

}

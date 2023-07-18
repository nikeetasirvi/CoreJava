package week7.strings;

public class ExpressionForStringIsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1.23e-4";
		//boolean isNumber = str.matches("-?\\d+(\\.\\d+)?");
		boolean isNumber = str.matches("-?\\d+(\\.\\d+)?([eE]-?\\d+)?");
		if(isNumber) {
			System.out.println("String is a number");
		} else {
			System.out.println("String is not a number");
		}
	}

}

/*
 * -?          optional minus sign
 * \\d+        one or more digits
 * (\\.\\d+)?  optional decimal or one or more digits
 * ([eE]       optional e or E
 * 
 */
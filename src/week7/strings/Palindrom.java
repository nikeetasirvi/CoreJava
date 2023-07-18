package week7.strings;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//method1
		String str = "radarr";
		boolean isPalindrom = true;
		int forwardPointer = 0;
		int backwardPointer = str.length() - 1;

		while (forwardPointer != backwardPointer && forwardPointer < backwardPointer) {
			if (str.charAt(forwardPointer) == str.charAt(backwardPointer)) {
				forwardPointer++;
				backwardPointer--;
			} else {
				isPalindrom = false;
				break;
			}
		}

		if (isPalindrom) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not a palindrom");
		}

		//method2
		String originalStr = "abcba";

		StringBuilder reverseSB = new StringBuilder(originalStr);
		
		reverseSB.reverse();
		String reversedStr = reverseSB.toString();

		if (originalStr.equals(reversedStr)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}
}

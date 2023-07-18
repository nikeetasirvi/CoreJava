package week7.strings;

import java.util.ArrayList;
import java.util.Comparator;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		String str = "GEEKSFORGEEKS";

		if (str.length() == 1) {
			System.out.println(str);
		} else {
			String test = "";
			int maxLength = -1;
			for (char c : str.toCharArray()) {
				String current = String.valueOf(c);
				if (test.contains(current)) {
					list.add(test);
					test = test.substring(test.indexOf(current) + 1);
				}
				test = test + current;
				maxLength = Math.max(test.length(), maxLength);
			}
			
			//finding lengthiest string from arraylist
			// we have 2 same length string in arraylist but only one which occur first will be printed
			System.out.println(list.stream().max(Comparator.comparing(String::length)).get());
			
			//finding lengthiest string length from arraylist
			System.out.println(list.stream().map(String::length).max(Integer::compare).get());
			
			//finding length of lengthiest string manually
			System.out.println(maxLength);
		}
	}

}

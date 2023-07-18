package week7.strings;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Race";
//		str1 = "earth";
//		str1 = "ton";
//		str1 = "hello";
		
		String str2 = "Care";
//		str2 = "heart";
//		str2 = "not";
//		str2 = "olle";
		
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		boolean isAnagram = true;
		
		if(str1.length() != str2.length()) {
			
			isAnagram = false;
			
		} else {
			
			for(int i=0; i<str1.length(); i++) {
				char ch = str1.charAt(i);
				int foundIndex = str2.indexOf(ch);
				if(foundIndex != -1) {
					// character is present in str2
					String part1 = str2.substring(0,foundIndex);
					String part2 = str2.substring(foundIndex+1);
					str2 = part1 + part2;
				} else {
					isAnagram = false;
					break;
				}
			}
		}
		
		if(isAnagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

}

package week7.strings;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = " hello";
		String str2 = " good morning";
		String str3 = " have a wonderfule day";

		// hello good morning
		String result1 = str1.concat(str2);
		System.out.println(result1);

		String result2 = result1.concat(str3);
		System.out.println(result2);

		String result3 = str1.concat(str2).concat(str3).concat(str2).concat(str1);
		System.out.println(result3);
	}

}

package week7.strings;

public class StartsWithEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "have a good day";

		String startsWithkeyword = "have a";
		boolean outcome = str.startsWith(startsWithkeyword);
		System.out.println("String [" + str + "] starting with [" + startsWithkeyword + "] ->" + outcome);

		String endsWithKeyword = "a day";
		outcome = str.endsWith(endsWithKeyword);
		System.out.println("String [" + str + "] ending with [" + endsWithKeyword + "] ->" + outcome);
	}

}

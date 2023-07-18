package week7.strings;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ide = "    Eclipse";

		String result = ide.trim();

		System.out.println(ide);
		System.out.println(result);

		ide = "Eclipse Software          ";
		result = ide.trim();

		System.out.println(ide+ "&");
		System.out.println(result+ "&");
	}

}

package week7.strings;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "java is a good programming language";

		System.out.println("Before replace ->" + str);
		String result = str.replace('o', 'O');

		System.out.println("After replace ->" + result);

		String result2 = result.replace("java", "NodeJS");
		System.out.println("After replace ->" + result2);

		String str2 = "java is a programming language, java is an " + "object oriented language";

		String result3 = str2.replaceFirst("java", "nodejs");
		System.out.println("After replace ->" +result3);

	}

}

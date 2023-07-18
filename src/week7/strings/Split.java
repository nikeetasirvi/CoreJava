package week7.strings;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sample = "Using Java language and using node language, Using javA again Both using java and node are good";
		sample = sample.toLowerCase();

		String[] splittedWords = sample.split(" ");
		for (String word : splittedWords) {
			System.out.println(word);
		}

		System.out.println("--------------");
		String splittedWords2[] = sample.split("java");
		for (String word : splittedWords2) {
			System.out.println(word);
		}
	}

}

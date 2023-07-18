package week7.strings;

public class LowerToUpperWithoutUpperCaseFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lStr = "nikeeta";
		String uStr = "";
		int ascii;
		char ch;
		
		for(int i=0; i<lStr.length(); i++) {
			ascii = lStr.charAt(i);
			ch = (char)(ascii-32);
			uStr += ch;
		}
		System.out.println(uStr);
	}
}

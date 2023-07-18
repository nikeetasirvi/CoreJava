package week7.strings;

public class CheckStringRotationOfEachOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "nikeeta";
		String str2 = "tanikee";
		
		String str3 = str2+str2;
		
		//method1
		if(str3.contains(str1)) {
			System.out.println("yes its a rotation");
		} else {
			System.out.println("Not a rotation");
		}
		
		//method2
		boolean isRotation = false;
		if(str1.length() == str2.length()) {
			for(int i=0; i<str1.length(); i++) {
				String str4 = str3.substring(i,i+str1.length());
				if(str4.equals(str1)) {
					isRotation = true;
					System.out.println("yes its a rotation");
					break;
				}
			}
		}
		if(!isRotation) {
			System.out.println("Not a rotation");
		}
		
	}

}

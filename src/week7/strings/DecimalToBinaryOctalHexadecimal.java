package week7.strings;

public class DecimalToBinaryOctalHexadecimal {

	public static void decimalToBinary(int decimal) {
		int[] binary = new int[100];
		int i=0;
		while(decimal>0) {
			binary[i] = decimal%2;
			decimal = decimal/2;
			i++;
		}
		for(int j=i-1; j>=0; j--) {
			System.out.print(binary[j]);
		}
		System.out.println();
	}

	public static void decimalToOctal(int decimal) {
		int[] octal = new int[100];
		int i=0;
		while(decimal>0) {
			octal[i] = decimal%8;
			decimal = decimal/8;
			i++;
		}
		for(int j=i-1; j>=0; j--) {
			System.out.print(octal[j]);
		}
		System.out.println();
	}

	public static void decimalToHexadecimal(int decimal) {
		int[] hexadecimal = new int[100];
		int i=0;
		while(decimal>0) {
			hexadecimal[i] = decimal%16;
			decimal = decimal/16;
			i++;
		}
		for(int j=i-1; j>=0; j--) {
			if(hexadecimal[j] > 9) {
				System.out.print((char)(hexadecimal[j]+55));
			} else {
				System.out.print(hexadecimal[j]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int decimal = 2545;
		decimalToBinary(decimal);
		decimalToOctal(decimal);
		decimalToHexadecimal(decimal);
	}

}

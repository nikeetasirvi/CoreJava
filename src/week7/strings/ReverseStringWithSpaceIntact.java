package week7.strings;

public class ReverseStringWithSpaceIntact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My name is nikeeta";
		char[] sourceArr = str.toCharArray();
		char[] targetArr = new char[sourceArr.length];
		
		for(int i=0; i<sourceArr.length; i++) {
			if(sourceArr[i] == ' ') {
				targetArr[i] = ' ';
			}
		}
		
		int sourcePointer = sourceArr.length-1;
		
		for(int targetPointer = 0; targetPointer < sourceArr.length; targetPointer++) {
			if(targetArr[targetPointer] != ' ') {
				if(sourceArr[sourcePointer] == ' ') {
					targetPointer--; // to balance out the for loops++
				} else {
					targetArr[targetPointer] = sourceArr[sourcePointer];
				}
				sourcePointer--;
			}
		}
		
		System.out.println(str);
		System.out.println(String.valueOf(targetArr));
		//targetArr.toString will give the address of targetArr so to get value we use String.valueOf(targetArr)
	}

}

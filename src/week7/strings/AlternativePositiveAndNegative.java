package week7.strings;

public class AlternativePositiveAndNegative {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,-1,-2,50,-3,60};
		int firstNegative = 0;
		
		for(int j=0; j<arr.length; j++) {
			
			if(arr[j]>0 && j%2==0) {
				//if positive number is in its correct place;
				continue;
				
			} else if(arr[j]<0 && j%2!=0){
				//if negative number is in its correct place;
				System.out.println("continue for " +arr[j]);
				continue;
				
			} else if(arr[j]>0 && j%2!=0) {
				//if positive number on wrong place
				
				boolean isNegativeFound = false;
				
				for(int i=j+1; i<arr.length; i++) {
					//find first negative number's index found after the wrong positive number's index
					if(arr[i]<0) {
						System.out.println("first negative " +arr[i]);
						firstNegative = i;
						isNegativeFound = true;
						break;
					}
				}
				
				if(isNegativeFound) {
					//swap the wrong place positive number with the first negative
					System.out.println("swap " +arr[j]+ "and" +arr[firstNegative]);
					int temp = arr[j];
					arr[j] = arr[firstNegative];
					arr[firstNegative] = temp;
					isNegativeFound = false;
				}
				
				for(int i=firstNegative; i<arr.length; i++) {
					//shift pointer to next negative number index after first negative number's index
					if(arr[i]<0) {
						System.out.println("first negative " +arr[i]);
						firstNegative = i;
						isNegativeFound = true;
						break;
					}
				}
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.print(arr[j]+ " ");
		}
	}
}

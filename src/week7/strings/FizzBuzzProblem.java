package week7.strings;

public class FizzBuzzProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 15;
		if(n1%3 == 0 && n1%5 == 0) {
			System.out.println("FizzBuzz");
		} else if(n1%3 == 0) {
			System.out.println("Fizz");
		} else if(n1%5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println("Not multiplier of 3 or 5");
		}
		
	}

}

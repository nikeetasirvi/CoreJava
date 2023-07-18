package week3.recursion;

public class FibonacciFinalNo {
    public static int fibonacci(int n){
		if(n <= 1){
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        //code your solution here
        if(n == 0){
            System.out.println("0");
        } else if(n == 1){
            System.out.println("1");
        } else {
            System.out.println(fibonacci(n-1));
        }
    }
}
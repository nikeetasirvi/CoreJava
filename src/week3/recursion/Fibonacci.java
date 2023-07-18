package week3.recursion;
class Fibonacci{

	public static int fibonacci(int i){
		if(i==0 || i==1){
			return i;
		}
		return fibonacci(i-1)+fibonacci(i-2);
	}

	public static void main(String[] args){

		int n = 7;
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2; i<n; i++){
			System.out.println(fibonacci(i));
		}
	}
}
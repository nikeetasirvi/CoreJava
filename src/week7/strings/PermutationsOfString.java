package week7.strings;

public class PermutationsOfString {

	public static void swap(char[] a,int l,int i) {
		char temp = a[l];
		a[l] = a[i];
		a[i] = temp;
	}
	
	public static void permute(char[] a, int l,int r) {
		if(l == r) {
			System.out.print(String.valueOf(a)+ " ");
		} else {
			for(int i=l; i<=r; i++) {
				swap(a,l,i);
				permute(a,l+1,r);
				swap(a,l,i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ABC";
		char[] ch = str1.toCharArray();
		int n = ch.length;
		permute(ch,0,n-1);
	}

}

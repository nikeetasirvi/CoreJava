package week4_5.searching_sorting.methods;

public class LinearSearch {

	public static int linearSearch(int[] arr,int num){
	    for(int i=0; i<arr.length; i++){
	      if(arr[i] == num){
	        return i;
	      }
	    }
	    return -1;
	  }
	  
	  public static void main(String[] args){
	  
	    int[] arr = {5,12,1,7,8,4,9};
	    System.out.println(linearSearch(arr,7));
	  }

}

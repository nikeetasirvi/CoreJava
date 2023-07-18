package week4_5.searching_sorting.methods;

public class BinarySearch {
	
	public static void binarySearch(int[] arr,int strt,int end,int num){
	    if(strt > end){
	      System.out.println("Number cant be found");
	      return;
	    }
	    int mid = strt + (end - strt)/2;
	    if(arr[mid] == num){
	      System.out.println(mid);
	    } else if(arr[mid] > num){
	      binarySearch(arr,strt,mid-1,num);
	    } else{
	      binarySearch(arr,mid+1,end,num);
	    }
	  }
	  
	  public static void main(String[] args){
	  
	    int[] arr = {10,20,30,40,50,60,70,80,90};
	    binarySearch(arr,0,arr.length-1,100);
	  }

}

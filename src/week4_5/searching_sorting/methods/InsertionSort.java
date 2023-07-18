package week4_5.searching_sorting.methods;

public class InsertionSort {
	
	public static void insertionSort(int[] arr,int size){
	    
	    for (int i = 1; i < size; i++){
	        int key = arr[i];
	        int j;
	        for(j=i-1; j >= 0 && arr[j] > key; j--){
	            arr[j + 1] = arr[j];
	        }
	        arr[j + 1] = key;
	    }
	    
	  }
	  
	  public static void main(String[] args){
	  
	    int[] arr = {50,60,40,30,70,10,90,20};
	    insertionSort(arr,arr.length);
	    
	    for(int i=0; i<arr.length; i++){
	      System.out.println(arr[i]);
	    }
	  }

}

package week4_5.searching_sorting.methods;

public class SelectionSort {
	
	public static void selectionSort(int[] arr,int size){
	    for(int j=0; j<size; j++){
	      int min = j;
	      for(int i=j+1; i<size; i++){
	        if(arr[i] < arr[min]){
	          min = i;
	        }
	      }
	      int temp = arr[j];
	      arr[j] = arr[min];
	      arr[min] = temp;
	    }
	  }
	 
	  public static void main(String[] args){
	  
	    int[] arr = {50,60,80,40,30,70,10,90,20};
	    selectionSort(arr,arr.length);
	    
	    for(int i=0; i<arr.length; i++){
	      System.out.print(arr[i]+ " ");
	    }
	  }

}

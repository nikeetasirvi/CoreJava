package week4_5.searching_sorting.methods;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr,int size){
		System.out.println("itteration");
	    if(size>=1){
	      for(int j=0; j<size; j++){
	        if(arr[j] > arr[j+1]){
	          int temp = arr[j];
	          arr[j] = arr[j+1];
	          arr[j+1] = temp;
	        }
	      } 
	      size--;
	      bubbleSort(arr,size);
	    }
	  }
	  
	  public static void main(String[] args){
	    int[] arr = {50,60,80,40,30,70,10,90,20};
	    bubbleSort(arr,arr.length-1);
	    for(int i=0; i<arr.length; i++){
	      System.out.print(arr[i]+ " ");
	    }
	  }

}

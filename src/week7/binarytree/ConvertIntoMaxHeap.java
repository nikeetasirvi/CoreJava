package week7.binarytree;

public class ConvertIntoMaxHeap {

	static int[] tree = {0,4,1,3,2,16,9,10,14,8,7};
	static int i=10;
	
	public static void convertIntoMaxHeap() {
		// also called heapification or heapify
		boolean sta = false; 
		while(sta == false) {
			sta = true;
			int max;
			if(i%2 == 0) {
				//last node is at left branch
				if(tree[i] > tree[i/2]) {
					swap(i,i/2);
					sta = false;
				}
				for(int j=i-1; j>1; j=j-2) {
					max = tree[j]>tree[j-1] ? j : j-1;
					if(tree[max] > tree[j/2]) {
						swap(max,j/2);
						sta = false;
					}
				}
			} else {
				//last node is at right branch
				for(int j=i; j>1; j=j-2) {
					max = tree[j]>tree[j-1] ? j : j-1;
					if(tree[max] > tree[j/2]) {
						swap(max,j/2);
						sta = false;
					}
				}
			}
		}
	}

	public static void swap(int x,int y) {
		int temp;
		temp = tree[x];
		tree[x] = tree[y];
		tree[y] = temp;	
	}
	
	public static void print() {
		System.out.println("Binary tree with root " +tree[1]);
		for(int j=1; j<=i; j++) {
			System.out.print(tree[j]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertIntoMaxHeap();
		print();
	}

}

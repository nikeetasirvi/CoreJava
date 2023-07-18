package week7.strings;

import java.util.ArrayList;

public class RemoveDuplicateFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);

		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
		System.out.println(list);
	}
	
}

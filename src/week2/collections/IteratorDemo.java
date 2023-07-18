package week2.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		list.add('e');

		// iterator have next method and not previous method
		Iterator<Character> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();

		// if type not mentioned then typecast
		Iterator itr2 = list.iterator();
		while (itr2.hasNext()) {
			Character c = (Character) itr2.next();
		}
		System.out.println();

		// list iterator has next and previous method both
		ListIterator<Character> itr1 = list.listIterator(2); // strt iteration from index 2(if nothing mentioned then strt from 0)
		while (itr1.hasNext()) {
			int index = itr1.nextIndex();
			System.out.println("index of below Element: " + index);
			System.out.println(itr1.next());
			if (index == 4) {
				itr1.set('D');
			}
		}
		System.out.println();
		while (itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}

		// remove element one by one
		while (itr.hasNext()) {
			System.out.println(itr1.next());
			itr.remove();
		}
		while (itr.hasNext()) {
			System.out.println(itr1.next()); // nothing to print as everything is deleted
		}
	}
}
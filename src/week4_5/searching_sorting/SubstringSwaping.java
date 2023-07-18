package week4_5.searching_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SubstringSwaping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s;
		s = sc.nextLine();

		TreeMap<Character, Integer> map = new TreeMap<>();
		for (int i = 0; i < s.length(); ++i) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		List<Integer> list = new ArrayList<>();
		for (Map.Entry entry : map.entrySet()) {
			list.add((int) entry.getValue());
		}

		List<Integer> copy = new ArrayList<>();
		copy.addAll(list);

		Collections.sort(list);
		int res = 0;

		for (int i = 0; i < list.size(); ++i) {
			res += (Math.abs(list.get(i) - copy.get(i)));
		}

		System.out.println(res / 2);
	}
}

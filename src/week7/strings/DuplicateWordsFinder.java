package week7.strings;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateWordsFinder {

	public static void printDuplicatesFromMap(Map<String,Integer> map) {
		for(String akey : map.keySet()) {
			if(map.get(akey) > 1) {
				System.out.println("Key is " + akey + " and value is " + map.get(akey));
			}
		}
	}
	
	public static boolean containsIgnoreCase(List<String> resultList, String iword) {
		for (String words : resultList) {
			if (words.equalsIgnoreCase(iword)) {
				return true;
			} else {
				continue;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Using Java language and using node language Using javA again Both using java and node are good";
		
		//method1
		String[] splitedWords = str.split(" ");
		List<String> resultList = new ArrayList<String>();
		
		for (int i = 0; i < splitedWords.length; i++) {
			String iword = splitedWords[i];
			for (int j = 0; j < splitedWords.length; j++) {
				String jword = splitedWords[j];
				if (i != j) {
					if (iword.equalsIgnoreCase(jword)) {
						if (!containsIgnoreCase(resultList, iword)) {
							resultList.add(iword);
						}
					}
				}
			}
		}
		System.out.println("method1----------------");
		System.out.println("Result List " + resultList+ "\n");
		
		//method2
		str = str.toUpperCase();
		String[] splitedWords1 = str.split(" ");
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		for (int i = 0; i < splitedWords1.length; i++) {
			String key = splitedWords1[i];
			if(map.containsKey(key)) {
				map.put(key,map.get(key)+1); // can also do as below
				//Integer value = map.get(key);
				//value++;
				//map.put(key,value);
			} else {
				map.put(key,1);
			}
		}
		System.out.println("method2------------------------");
		printDuplicatesFromMap(map);
		
	}
}

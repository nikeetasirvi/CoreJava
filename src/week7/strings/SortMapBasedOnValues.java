package week7.strings;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SortMapBasedOnValues {

	public static void display(Map<String,Float> map) {
		for(String akey : map.keySet()) {
			System.out.println(akey+ "---->" +map.get(akey));
		}
	}

	public static void sortByValues(Map<String,Float> map) {
		Set<Map.Entry<String,Float>> set = map.entrySet();
		List<Map.Entry<String,Float>> list = new ArrayList<>();
		list.addAll(set);
		
		Collections.sort(list,new MapValueComparator());

		Map<String, Float> resultsMap = new LinkedHashMap<>();

		Iterator<Map.Entry<String, Float>> iterator = list.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Float> mapEntry = iterator.next();		
			resultsMap.put(mapEntry.getKey(), mapEntry.getValue());
		}
		display(resultsMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Float> moviesRatingMap = new LinkedHashMap<>();

		moviesRatingMap.put("Test Movie", 7.7F);
		moviesRatingMap.put("Logan", 5.9F);
		moviesRatingMap.put("Inception", 8.5F);
		moviesRatingMap.put("Fast & Furious", 6.8F);
		moviesRatingMap.put("Rebecca", 8.1F);
		moviesRatingMap.put("Shutter Island", 7.8F);
		moviesRatingMap.put("Interstellar", 9.5F);

		display(moviesRatingMap);
		System.out.println("----------------");
		sortByValues(moviesRatingMap);
	}

}

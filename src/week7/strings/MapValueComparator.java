package week7.strings;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MapValueComparator implements Comparator<Map.Entry<String, Float>>{

	@Override
	public int compare(Entry<String,Float> me1, Entry<String,Float> me2) {
		// TODO Auto-generated method stub
		
		// if we did not have float and we have integer we should write only one line
		// return op2-op1;
		
		if (me1.getValue() == me2.getValue()) {
			return 0;
		}else if (me1.getValue() < me2.getValue()) {
			return -1;
		}else {
			return +1;
		}
	}

}

package collectionsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortArraybyLengthAndAscendingOrder {

	public static void main(String[] args) {
		    	String a[] = {"banana", "apple", "banana", "orange", "oranges"};
		    	ArrayList<String> al = new ArrayList<String>(Arrays.asList(a));
		    	ArrayList<String> newList = new ArrayList<>();

		    	TreeMap<Integer, List<String>> tm = new TreeMap<>();
		    	for(String s : al) {
		    		Integer len = s.length();
		    		if(tm.containsKey(len)) {
		    			tm.get(len).add(s); 
		    		}
		    		else {
		    			
		    			tm.put(len, new ArrayList<String>(Arrays.asList(s)));
		    		}
		    	}
//		    	
		    	for(Map.Entry<Integer, List<String>> kv: tm.entrySet()) {
//		    		System.out.println(kv.getValue() +" "+kv.getKey());
		    		newList.addAll(kv.getValue());
		    	}
		    	
		    	System.out.print(newList);
		    	
		    }

}

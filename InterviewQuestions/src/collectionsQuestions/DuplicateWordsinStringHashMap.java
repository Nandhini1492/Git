package collectionsQuestions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsinStringHashMap {

	public static void main(String[] args) {
		String s1 = "iam iam very slow slow for you you";
		String s2 = s1.toLowerCase();
		
		
		String[] str = s2.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 for(String s: str) {
			 if(hm.containsKey(s)) {
				 hm.put(s, hm.get(s)+1);
			 }else {
				 hm.put(s, 1);
			 }
		 }
		 
		 for(Map.Entry<String,Integer> map: hm.entrySet()) {
			 if(map.getValue()>1) {
			 System.out.println(map.getKey()+" "+map.getValue());
			 }
		 }
	}

}

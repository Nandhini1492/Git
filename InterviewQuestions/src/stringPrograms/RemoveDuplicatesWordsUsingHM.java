package stringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class RemoveDuplicatesWordsUsingHM {

	public static void main(String[] args) {
		String s1 = "iam iam very slow slow for you you";
		String s2 = s1.toLowerCase();
		
		String[] str = s2.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String s:str) {
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}else {
				hm.put(s, 1);
			}
		}
		
		for(Map.Entry<String,Integer> map: hm.entrySet()) {
			if(map.getValue()>=1) {
				System.out.println(map.getKey()+ " "+map.getValue());
//				ArrayList<String> al = new ArrayList<String>(Arrays.asList(map.getKey()));
//				System.out.print(al);
				
			}
		}
		
		
		
	}

}

package collectionsQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DuplicateCharinStringHashMap {

	public static void main(String[] args) {
		String s1 = "Iam Mgrateful for this";
		String s = s1.toLowerCase();

		char[] c = s.toCharArray();

		TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();

		for(char c1:c){
			if(hm.containsKey(c1)){
				hm.put(c1, hm.get(c1)+1);
			}else{
				hm.put(c1,1);
		}}

		for(Map.Entry<Character, Integer> map:hm.entrySet()){
			if(map.getValue()>1 && map.getKey()!=' '){
				System.out.println(map.getKey()+" "+map.getValue());
				//System.out.println(map.getKey());
		}
	}
}
}

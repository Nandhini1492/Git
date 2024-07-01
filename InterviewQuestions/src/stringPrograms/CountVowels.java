package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountVowels {
	public static void main(String[] args) {
		
		String s1 ="Iam Grateful for eee my job";
		int count = 0;
		String s = s1.toLowerCase();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i= 0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				if(hm.containsKey(s.charAt(i))) {
					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
				}else {
					hm.put(s.charAt(i), 1);
				}
				count++;
			}}
		System.out.println(count);
		for(Map.Entry<Character, Integer> map: hm.entrySet()) {
				System.out.println(map.getKey()+" "+map.getValue());
	}

}
}

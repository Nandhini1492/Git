package streamsQuestions;

import java.util.stream.Collectors;
import java.util.*;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,2,3,3,4,5,5,6,8,8,10,22,22,33);
		
		Set<Integer> set = list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(set);
	
		List<String> strList = Arrays.asList("orange","orange","guava","berry","b	erry","Melon");
		Set<String> newSet = strList.stream().filter(e->(Collections.frequency(strList, e)>1))
				.collect(Collectors.toSet());
		
		System.out.println(newSet);
	}

}

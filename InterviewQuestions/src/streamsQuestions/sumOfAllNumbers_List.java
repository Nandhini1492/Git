package streamsQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class sumOfAllNumbers_List {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Optional sum = list.stream().reduce((a,b)->a+b);
		
		System.out.println(sum.get());
}
}
package streamsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbersUsingStreams {

	public static void main(String[] args) {
		
		List<Integer> list =  Arrays.asList(1,-1,22,3,66,99,888,67,2,7);
		
		//Limit method is used to limit the numbers upto certain size
		//print only 5 numbers
		List<Integer> l = list.stream().limit(6).collect(Collectors.toList());
		System.out.println(l);
		//add only first 6 numbers
		int sum = list.stream().limit(6).reduce((a,b)->a+b).get();
		System.out.println(sum);
		
		//skip first 5 number
		List<Integer> skip = list.stream().skip(5).collect(Collectors.toList());
		System.out.println(skip);
		
	}

}

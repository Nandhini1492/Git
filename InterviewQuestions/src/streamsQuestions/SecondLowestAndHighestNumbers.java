package streamsQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLowestAndHighestNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,-1,22,3,66,99,88,67,2,7);
		
		//Second highest
		int secondHigh = list.stream().sorted().distinct().skip(1).findAny().get();
		System.out.println(secondHigh);
		
		//Secondlowest
		int secondLow = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findAny().get();
		System.out.println(secondLow);
	}

}

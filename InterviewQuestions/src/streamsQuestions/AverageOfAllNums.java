package streamsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AverageOfAllNums {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		double average = list.stream().mapToInt(a->a).average().getAsDouble();
		
		System.out.println(average);
		
		//Sqare of each number
		
		List<Integer> square = list.stream().map(a->a*a).collect(Collectors.toList());
		System.out.println(square);

	}

}

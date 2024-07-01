package streamsQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//Odd numbers
		List<Integer> odd = list.stream().filter(x->!(x%2==0)).map(x->x).collect(Collectors.toList());
		odd.forEach(e->System.out.println(e));
		
		//Even numbers
		System.out.println("__________");
		List<Integer> even = list.stream().filter(x->x%2==0).collect(Collectors.toList());
		even.forEach(e->System.out.println(e));
	}

}

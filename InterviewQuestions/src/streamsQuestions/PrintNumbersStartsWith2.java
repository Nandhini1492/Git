package streamsQuestions;

import java.util.List;
import java.util.stream.Collectors;

public class PrintNumbersStartsWith2 {

	public static void main(String[] args) {
		
		List<Integer> num = List.of(22,224,566,677,244,233,677,88,34,478);

		List<Integer> witTwo = num.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2"))
			.map(e->Integer.parseInt(e)).collect(Collectors.toList());
		
		witTwo.forEach(e->System.out.println(e));
	}

}

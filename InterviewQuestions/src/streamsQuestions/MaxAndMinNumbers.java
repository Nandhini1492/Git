package streamsQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinNumbers {
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,-1,22,3,66,99,888,67,2,7);
	
	//Largest number
	int Largest = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
	System.out.println("Largest numer" +Largest);
	
	//
	int smallest = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	System.out.println("Smallest numer" +smallest);
	}
}

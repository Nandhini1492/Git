package streamsQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumberAscAndDes {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,-1,22,3,66,99,888,67,2,7);
		
		int[] a = {0,-1,22,3,66,99,888,67,2,7};
		//ascending order
		List<Integer> sortedAsc = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedAsc);
		
		//Descending order
		List<Integer> sortedDes = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedDes);
		
		//without using sort order
		for(int i=0;i<list.size();i++) {
			int count = 0;
			for(int j =i+1;j<list.size();j++) {
					if(a[i]<a[j]) {
						a[count]=a[i];
						a[i]=a[j];
						a[j]=a[count];
					}
			}
			System.out.print(a[i]+",");
		}
		

	}

}

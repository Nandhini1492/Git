package collectionsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceArrayValuesinArrayList {

	public static void main(String[] args) {
        // Sample ArrayList with initial elements
		Integer a[] = {1, 2, 3, 4, 2, 5};
        List<Integer> al = new ArrayList<>(Arrays.asList(a));
        List<Integer> al1 = new ArrayList<>(Arrays.asList(8,9));

        // Index of element to be replaced
        int value = 2;
        for(int i =0; i<al.size(); i++) {
        	if(al.get(i)==value) {
        		al.remove(i);
        		al.addAll(i,al1);
        	}

        }
        System.out.print(al);
	}
}

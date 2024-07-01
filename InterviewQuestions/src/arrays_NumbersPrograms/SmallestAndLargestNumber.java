package arrays_NumbersPrograms;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		int[] a = new int[] {3001,-1,2,3,6,9,99,100,2000,582,899};
		
		Arrays.sort(a);
		
		
		System.out.println("Largest number is"+a[a.length-1]);
		System.out.println("Largest number is"+a[a.length-2]);
		System.out.println("Smallest number is"+a[0]);
	}

}

package arrays_NumbersPrograms;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] a = new int[] {-1,2,3,6,9,99,100,2000,582,899};
		
		int Largest = a[0];//3001
		int Smallest = a[0];//3001
		int secondL = a[0];//3001
		
		Arrays.sort(a);
		
		for(int i=1;i<a.length; i++) {
			if(a[i]>Largest) {
				secondL=Largest;
				Largest=a[i];
			}else if(a[i]<Smallest) {
				Smallest=a[i];
			}else if(a[i]>secondL) {
				secondL=a[i];
			}
		}
		System.out.println(Largest+" "+secondL+" "+Smallest+" ");
		//Sorted Array
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
	}

}

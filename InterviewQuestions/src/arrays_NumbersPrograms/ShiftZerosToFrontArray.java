package arrays_NumbersPrograms;

import java.util.Arrays;

public class ShiftZerosToFrontArray {

	    public static void main(String[] args) {
	        int[] arr = {0, 2, 0, 3, 0, 4, 5, 0};
	        moveZerosToFront(arr);
	        System.out.println(Arrays.toString(arr)); // Output: [0, 0, 0, 0, 2, 3, 4, 5]
	    }

	    public static void moveZerosToFront(int[] arr) {
	        int n = arr.length;
	        int nextNonZeroIndex = 0;

	        // Traverse the array from left to right
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == 0) {
	                // If the current element is zero, swap it with the element at nextNonZeroIndex
	                int temp = arr[i];
	                arr[i] = arr[nextNonZeroIndex];
	                arr[nextNonZeroIndex] = temp;
	                // Increment the nextNonZeroIndex
	                nextNonZeroIndex++;
	            }
	        }
	    }
	
}



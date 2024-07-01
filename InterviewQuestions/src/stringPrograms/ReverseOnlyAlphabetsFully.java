package stringPrograms;

public class ReverseOnlyAlphabetsFully {
	  public static void main(String[] args) {
	        String input = "Hello123World456";
	        System.out.println("Original string: " + input);
	        
	        // Convert the string to character array
	        char[] chars = input.toCharArray();
	        
	        // Define pointers to reverse alphabets
	        int start = 0;
	        int end = chars.length - 1;
	        
	        // Reverse alphabets
	        while (start < end) {
	            if (!Character.isAlphabetic(chars[start])) {
	                start++;
	            } else if (!Character.isAlphabetic(chars[end])) {
	                end--;
	            } else {
	                // Swap alphabets
	                char temp = chars[start];
	                chars[start] = chars[end];
	                chars[end] = temp;
	                start++;
	                end--;
	            }
	        }
	        
	        // Convert character array back to string
	        String reversedString = new String(chars);
	        System.out.println("String with reversed alphabets: " + reversedString);
	    }
	
}

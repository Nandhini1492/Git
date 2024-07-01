package stringPrograms;

public class ReverseOnlyAlpbhabets {

	public static String reverseAlphabet(String input) {
		char[] chars = input.toCharArray();
		int i = 0;

		while (i < chars.length) {
			//if loop
			if (Character.isLetter(chars[i])) {
				int j = i + 1;
				while (j < chars.length && Character.isLetter(chars[j])) {
					j++;
				}
				int end = j-1;
				while (i < end) {
					char temp = chars[i];
					chars[i] = chars[end];
					chars[end] = temp;
					i++; 
					end--;
				}
				i = j;
			}//if loop ends
			else {
				i++;
			}
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		String input = "test*&^python34pop9";
		String reversed = reverseAlphabet(input);
		System.out.println(reversed);
	}

}



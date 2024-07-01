package arrays_NumbersPrograms;

public class ReverseOnlyDigits {

	public static String reverseDigits(String input) {
		char[] chars = input.toCharArray();
		int i = 0;

		while (i < chars.length) {
			//if loop
			if (Character.isDigit(chars[i])) {
				int j = i + 1;
				while (j < chars.length && Character.isDigit(chars[j])) {
					j++;//4
				}
				int end = j-1;//3
				while (i < end) {//0<3
					char temp = chars[i];
					chars[i] = chars[end];
					chars[end] = temp;//tset
					i++; //1
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
		String input = "5test12python34pop90";
		String reversed = reverseDigits(input);
		System.out.println(reversed);
	}

}



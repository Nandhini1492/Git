package arrays_NumbersPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
//		int n=12321;
//		String s = String.valueOf(n);
		
		String s1 = "Madam";
		String s = s1.toLowerCase();
		boolean pal = true;
		
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				pal = false;
				break;
			}
		}
		
		if(pal) {
			System.out.println("Number is palindrome");
		}else
			System.out.println("Number is not a palindrome");
	}

	

}

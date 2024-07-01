package stringPrograms;

public class CountCharinString {

	public static void main(String[] args) {
	
		String s ="Iam Grateful for my job";
		int count = 0;
		
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)!=' ') 
				count++;
		}
		
		System.out.println("number of characters in a String:  "+s.length());
 
	}

}

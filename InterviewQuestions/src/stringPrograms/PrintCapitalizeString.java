package stringPrograms;

public class PrintCapitalizeString {
	
	public static String capital(String str) {
         String[] words = str.split(" ");
         String result ="";
		
		for(String w:words) {
			String first = w.substring(0, 1).toUpperCase();
			String second = w.substring(1);
			
			result = result+first+second+" ";
		}
		
		return result.trim();
	}

	public static void main(String[] args) {
		String caps = capital("naveen automation labs");
		System.out.println(caps);
		String s = "Great";

	}
		
		

	

}

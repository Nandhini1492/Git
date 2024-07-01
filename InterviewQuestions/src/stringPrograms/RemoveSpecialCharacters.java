package stringPrograms;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String s1 ="ab123cd$%^ef(*";
		
		String s = s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}

}

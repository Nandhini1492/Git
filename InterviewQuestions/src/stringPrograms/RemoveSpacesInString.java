package stringPrograms;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		String s1 = "There is always a greater power";
		String[] s = s1.split(" ");
		
		for(String s2:s) {
			System.out.print(s2);
		}
		System.out.println( );
		
		//*****************************************
		
		String s3 = s1.replace(" ", "");
		System.out.println(s3);
		
		//remove leading and trailing spaces
		String ss = "  abc  def\t";
		String s4=ss.strip();
		System.out.println(s4);

	}

	
		

}

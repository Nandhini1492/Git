package arrays_NumbersPrograms;

public class PrintMergedArray {

	public static void main(String[] args) {
		String[] a = {"Java","Lang","Php"};//output should be JavaLangPhp
		
		//using simple join
		String join = String.join("", a);
		System.out.println(join);
		
		//Convert int to string and then join
		int[] arr = {1,2,3,4,5,6};
		
		String[] s = new String[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			s[i] = String.valueOf(arr[i]);
			//System.out.println(s[i]);
		}
		
		String joins =  String.join("", s);
		System.out.println(joins);
		
		
		
	
	}

}

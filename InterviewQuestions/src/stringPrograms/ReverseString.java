package stringPrograms;

public class ReverseString {
	
	public static void main(String[] args) {
		//Reverse below string
		String s = "Iam grateful for everything";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);// output: gnihtyreve rof lufetarg maI
	
	
		//Reverse a string without altering positions
		String s1 = "Iam grateful for this job";
		String[] words = s1.split(" ");
		String rev1 = "";
		for(int i=0;i<words.length;i++) {
			for(int j=words[i].length()-1; j>=0;j--) {
				rev1+=words[i].charAt(j);
			}
			System.out.print(rev1+" ");
			rev1 =""; //output: maI lufetarg rof siht boj 
		}
	

}
}

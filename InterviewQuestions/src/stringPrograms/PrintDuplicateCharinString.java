package stringPrograms;

import java.util.Arrays;

public class PrintDuplicateCharinString {
	
	public static void main (String[]args) {
	String s1 = "Nandhini U N";
	int count;
	
	String s = s1.toLowerCase();
	char[] c = s.toCharArray();
	
	for(int i = 0; i<c.length; i++) {	
		count = 1;
		for(int j=i+1;j<c.length;j++) {
			if(c[i]==c[j] && c[i]!=' ') {
				count++;
				c[j]='0';
			}
		}
		
		if(count>1&& c[i]!='0') {
			System.out.println(c[i]+" "+count);
		}
	}
	
	
	}

}

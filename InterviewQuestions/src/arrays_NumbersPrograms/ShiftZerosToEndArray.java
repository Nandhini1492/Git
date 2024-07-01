package arrays_NumbersPrograms;

public class ShiftZerosToEndArray {

	public static void main(String[] args) {
		int a[] = {0,0,1,5,9,0,1,4};
		//a.length = 12 
		int count = 0;
		for(int i = 0;i<a.length;i++) {
			//System.out.println(a.length);
			if(a[i]!=0) {
				a[count++] = a[i];
			}
		}
		while(count<a.length) {
			a[count++]=0; 
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}

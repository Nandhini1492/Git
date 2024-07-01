package arrays_NumbersPrograms;

public class SortWithoutUsingSortMethod {

	public static void main(String[] args) {
		int[] a = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				int count = 0;
				if(a[i]>a[j]) {
					count = a[i];
					a[i]=a[j];
					a[j]=count;
				}
			}
			System.out.print(a[i]+",");
		}

	}

}

package arrays_NumbersPrograms;

public class PrintFibonacci {
	
	public static void main(String[] args) {
		//fibonacci series 011235812...
		
		int n=10;
		int first = 0;
		int second =1;
		
		for(int i=0;i<n;i++) {
			System.out.print(first+",");
			int next = first+second;
			first = second;
			second = next;
		}
		
		
	}

}

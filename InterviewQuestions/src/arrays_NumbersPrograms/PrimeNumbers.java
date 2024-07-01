package arrays_NumbersPrograms;

import java.util.Scanner;

public class PrimeNumbers {
	  public static void main(String[] args) {
	    
		  boolean flag = false;
		  Scanner s =  new Scanner(System.in);
		  System.out.print("Enter a number:");
		  
		  int num = s.nextInt();
		  
		  for(int i=2;i<=num/2;i++) {
			  if(num%i==0) {
				 flag=true;
				 break;
			  }
		  }
		  
		  if(!flag & num>1) {
			  System.out.println("Given number is a prime number");
		  }else {
			  System.out.println("Given number is not a prime number");
		  }
	}
}
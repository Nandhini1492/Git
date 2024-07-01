package arrays_NumbersPrograms;

public class ConverNumbersToStringWords {

	    private static final String[] units = {
	            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
	            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
	    };

	    private static final String[] tens = {
	            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	    };

	    public static String convert(int n) {
	        if (n < 0 || n > 999) {
	            return "Number out of range";
	        }

	        if (n < 20) {
	            return units[n];
	        }

	        if (n < 100) {
	            return tens[n / 10] + ((n % 10 != 0) ? " " + units[n % 10] : "");
	        }//23+

	        return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " and " + convert(n % 100) : "");
	    }

	    public static void main(String[] args) {
	        int number = 30;
	        System.out.println(number + " in words: " + convert(number));
	    }
	

}

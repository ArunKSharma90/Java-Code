package com.uis.fundamentals;

public class Java17_NumberOfDigits {

	public static void main(String[] args) {
		int num = 624646;  // just not using scanner class input for this ex. 
		
		int count = 0;
		
		while (num != 0) {     // != 0 condition will handle negatives also . num >0 will fail for negative values 
 			
			
			num = num/10;
			count++;
		}
		
		System.out.println("number of digits is => " + count);

	}

}

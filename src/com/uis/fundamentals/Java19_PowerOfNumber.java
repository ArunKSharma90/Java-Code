package com.uis.fundamentals;
public class Java19_PowerOfNumber {
	public static void main(String[] args) {
		
		int base = 3;
		int exponent = 7;
		double result = 1; // if exponent is 0 this result will be printed
		
		// using for loop
		for (int i=1; i<= exponent; i ++) {
			result *= base;
		}
		System.out.println("the result using for loop is " + result);
		result = 1;  // reset for next calculation method
		
		// using while
		
		  int i=1; while (i <=exponent) { result *= base; ++i; }
		  System.out.println("the result using while loop is " + result);
		 
		// using pow() of math class
		  
		  result = Math.pow(base, exponent);
		  System.out.println("the result using pow() loop is " + result);
		

	}

}

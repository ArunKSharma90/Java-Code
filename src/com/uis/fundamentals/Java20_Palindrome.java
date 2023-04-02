package com.uis.fundamentals;

public class Java20_Palindrome {

	public static void main(String[] args) {
		// Palindrome => reverse of a number is same 
		int num = 121;
		int actualNum = num;
		int Rev=0, Rem; 
		
		while (num != 0) {
		Rem = num % 10; 
		Rev = Rev*10 + Rem;
		num = num/10;
		}
		
		System.out.println("reverse of the num is " + Rev);
		if(actualNum == Rev) 
			System.out.println("The num is a Palindrome");
		else 
			System.err.println("The num is NOT a Palindrome");
		}

}

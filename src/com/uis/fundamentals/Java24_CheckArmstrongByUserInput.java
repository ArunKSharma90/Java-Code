package com.uis.fundamentals;

import java.util.Scanner;

public class Java24_CheckArmstrongByUserInput {
	
	static int digits=0;
	// check digits and then calculate the sum with pow()  to check Armstrong
	public static void isArmstrong (int n) {
		
		int rem, tempNum = n, totalSum = 0;
		
		while (tempNum > 0) {
			tempNum = tempNum/10;
			digits++;			
		}
		
		tempNum = n; //reset temp with number for next calculation
		// now calculate the sum of m th pow of all digits
		while (tempNum > 0) {
			 
			rem = tempNum%10;
			totalSum =  totalSum + (int) Math.pow(rem, digits);
			tempNum = tempNum/10 ;			
		}
		
		if (totalSum == n)
			System.out.println("The number " + n + " is an Armstrong number..");
		else 
			System.err.println("The number " + n + " is NOT an Armstrong number..");	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number here ...");
		int num = sc.nextInt();
		sc.close();
		
		isArmstrong(num);
		
	}
	
}

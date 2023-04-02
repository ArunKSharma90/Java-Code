package com.uis.fundamentals;

import java.util.Scanner;

public class Java_4_QuotientAndRemainder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the dividend ");
		int dividend = sc.nextInt();
		
		System.out.println("enter the divisor ");
		int divisor = sc.nextInt();
			
		int quotient = dividend/divisor;
		int remainder = dividend%divisor;
		
		System.out.println("quotient is " + quotient);
		System.out.println("remainder is " + remainder);
		sc.close();
	}

}

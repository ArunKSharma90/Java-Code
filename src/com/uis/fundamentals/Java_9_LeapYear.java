package com.uis.fundamentals;

import java.util.Scanner;

public class Java_9_LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year please: " );
		int year = sc.nextInt();
		
		if ( (year%4 ==0 || year%400 ==0) && (year%100 !=0))
			{
				System.out.println(year + "- year is a leap year"); 
			}
		else
			System.err.println(year + "- year is NOT a leap year"); ;
		sc.close();

	}

}

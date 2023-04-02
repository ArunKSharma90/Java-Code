package com.uis.fundamentals;

import java.util.Scanner;

public class Java_3_PrintAscii_UnicodeValue {

	public static void main(String[] args) {
		
		System.out.println("taking user input here, please enter a char ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char c = str.charAt(0);
		
		int num = c;  // characters in java are internally stored as int only. char is an int data typte in java
		System.out.println("the ASCII or Unicode value of entered char- " + c + " is " + (int)c);
		System.out.println(num); // if you assign the char value to int - 
		sc.close();

		// System.out.println((char)2345 );   // this is to print Unicode value of a num
	}

}

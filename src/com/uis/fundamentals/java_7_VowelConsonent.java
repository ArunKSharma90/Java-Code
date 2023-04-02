package com.uis.fundamentals;

import java.util.Scanner;

public class java_7_VowelConsonent {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the char ");
		char c = sc.next().trim().toLowerCase().charAt(0);
		
		// c =Character.toUpperCase(c);  also we can use this method of Character class for changing case of a char 
		
		// using If condition
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println(c + " is a vowel");
		} else {
			System.out.println(c + " is a consonant");
		}

		
		// using switch
		
		
		switch (c) {
		case 'a': 
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c + " is a vowel - by case stetement");
			break;
		default:
			System.out.println(c + " is a consonant - by case stetement");
			break;
		}
		
		sc.close();
	}

}

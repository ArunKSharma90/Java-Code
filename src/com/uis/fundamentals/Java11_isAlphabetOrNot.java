package com.uis.fundamentals;

public class Java11_isAlphabetOrNot {

	public static void main(String[] args) {

		// Method 1 - using if
		char c = 'd';

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println(c + " is an alphabet.");
		else
			System.out.println(c + " is not an alphabet.");

		// 2 - using ternary operator
		String result = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ? c + " is an alphabet - using ternary op."
				: c + " is not an alphabet";
		System.out.println(result);

		
		// 3 - using method of Character class

		boolean b = Character.isAlphabetic(c);
		if (b == true)  // or just write  =>  if (Character.isAlphabetic(c))
			System.out.println(c + " is an alphabet. - using isAlphabetic()");
		else
			System.out.println(c + " is not an alphabet.using isAlphabetic()");

	}

}

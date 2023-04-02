package com.uis.fundamentals;

public class StringsPractice {

	public static void main(String[] args) {

		// converting String to array and altering with array elements

		String str = "more";

		/*
		 * char ca[] = str.toCharArray(); ca[0] = 's'; System.out.println(str); // more
		 * - changing anything in array will not impact actual string. Strings are //
		 * immutable ! for (int i = 0; i < ca.length; i++) System.out.println(ca[i]);
		 */

		// 4 ways to print each char of a string
		// 4.1 > charAt()

		System.out.println("Printing each char of str using charAt ");
		for (int i = 0; i < str.length(); i++)
			System.out.println(str.charAt(i));

		// 4.2 > using toCharArray() - as done above also
		System.out.println("Printing each char of str using toCharArray()  ");
		char ca1[] = str.toCharArray();
		for (int i = 0; i < ca1.length; i++)
			System.out.println(ca1[i]);

		// 4.3 using Split("")
		System.out.println("Printing each char of str using Split('')  ");
		String sa[] = str.split("");
		for (int i = 0; i < sa.length; i++)
			System.out.println(sa[i]);

	}

}

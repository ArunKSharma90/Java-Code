package com.strings;

public class StringRegex {

	public static void main(String[] args) {
		String str = "_(A+]34R-U)n/"; 
		
		System.out.println(str.replaceAll("[a-z0-9A-Z]", "")); // remove all alphanumeric
		
		System.out.println(str.replaceAll("[0-9]", "")); // replace all digits 
		System.out.println(str.replaceAll("[\\d]", "")); // replace all digits
		System.out.println(str.replaceAll("[\\D]", "")); // replace all NON-digits, keep only digits
		System.out.println(str.replaceAll("[^\\D]", ""));  // keep only NON-digits
		
//		\d => digits,   \D => non digits
	}

}

package com.strings;

public class StringReverse {
	static String str = "Hyderabad";
	static String rev = "";
	static String revCharAt = "";
	public static void main(String[] args) {
		// method 1 - toCharArray
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println("using toCharArray()" + rev);

		// method 2 - StringBuilder
		StringBuilder sb = new StringBuilder(str);
		rev = sb.reverse().toString();
		System.err.println("using StringBuilder => " + rev);

//		method 3 - charAt()
		for(int i=str.length()-1; i>=0 ; i-- ) {
			revCharAt = revCharAt + str.charAt(i);
		}
		System.out.println("Using chatAt() rev is  =>" + rev);
	}
}

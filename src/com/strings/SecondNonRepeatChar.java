package com.strings;

public class SecondNonRepeatChar {
	static String str = "aabcdefbgh ijklmn";
	static int count = 0;
	static char ch1, ch2;

	public static void main(String[] args) {

	outer:	for (int i = 0; i < str.length() - 1; i++) {

			for (int j = i + 1; j < str.length() - 1; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					System.out.println(str.charAt(i));
					System.out.println(count);

				}
				if (count == 2) {
					ch2 = str.charAt(i);
					System.out.println(ch2);
					break outer;
				}
			}
		}
		System.out.println("2nd non-repeat char is => " + ch2);

	}

}

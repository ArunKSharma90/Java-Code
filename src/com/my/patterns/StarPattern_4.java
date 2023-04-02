package com.my.patterns;

public class StarPattern_4 {
	// Right Down Triangle
	// *****
	// ****
	// ***
	// **
	// *
	static int row = 5;

	public static void main(String[] args) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = row; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println(); // next line
		}

	}

}

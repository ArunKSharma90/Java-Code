package com.uis.fundamentals;

public class Java16_Print_AToZ {

	public static void main(String[] args) {
		
		// way 1 
		for (int i = 65; i<91; i++)
			System.out.print((char)i + " ");
		
		// what if you don't remember Unicode value of A & Z
		for (char c = 'A';c<= 'Z'; c++)
			System.err.print(c + " ");

	}

}

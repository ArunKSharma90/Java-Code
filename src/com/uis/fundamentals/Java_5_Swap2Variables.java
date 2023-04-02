package com.uis.fundamentals;

public class Java_5_Swap2Variables {

	public static void main(String[] args) {

		int x, y;
		x = 5; 
		y = 10;
		System.out.println("before swappig x = " + x);
		System.out.println("before swappig y = " + y);

//		// 1. swap using third variable
//		int t;
//		t = x; // 5
//		x = y; // 10
//		y = t; // 5

		// 2. without using 3rd var
		x = x + y; // 15
		y = x - y; // 5
		x = x - y; // 10
		
//		// 3. using * operator
//		x = x*y; //50
//		y = x/y; //5
//		x = x/y; //10

//		// 4. using XOR ^ operator
//		x = x ^ y; //
//		y = x ^ y; //
//		x = x ^ y; //
		
		System.err.println("after swappig without 3rd var x = " + x);
		System.err.println("after swappig without 3rd var y = " + y);
		
	}

}

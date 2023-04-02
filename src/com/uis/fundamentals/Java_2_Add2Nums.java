package com.uis.fundamentals;

public class Java_2_Add2Nums {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		Sum.add(a, b);
		Multiplication.mul(a, b);
	}

}

class Sum {

	public static long add(int a, int b)

	{
		long c = a + b;
		System.out.println("the sum of " + a + " & " + b + " is " + c);
		return c;

	}
}

class Multiplication {

	public static long mul(int a, int b)

	{
		long c = a * b;
		System.out.println("the multiplication of " + a + " & " + b + " is " + c);
		return c;

	}
}

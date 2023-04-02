package com.uis.fundamentals;

import java.util.Scanner;

public class Java_6_OddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number ");
		int num = sc.nextInt();
		
		if (num%2 == 0)
			System.out.println(num + " is Even");
		else 
			System.out.println(num + " is Odd");

		sc.close();
	
	}

}

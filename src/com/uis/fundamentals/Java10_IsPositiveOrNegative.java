package com.uis.fundamentals;

import java.util.Scanner;

public class Java10_IsPositiveOrNegative {

	public static void main(String[] args) {
		
		//1. Java Program to Check Whether a Number is Positive or Negative
		// first way - using if  
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number here ");
		int d = sc.nextInt();
		
		if(d > 0.0) {
			System.out.println(d + " the number is positive ");
		}
		else if (d < 0.0) {
			System.err.println(d + " the number is negative ");
		}
		else
			System.out.println(d + " the number is zero ");
		
		
		// 2nd way - using Math.signum(double d)  or Integer.signum(int i)
		
		double result = Math.signum(d);
		if (result == 1.0)
			System.out.println(d + " the number is positive - using signum() ");
		else if (result == -1.0)
			System.err.println(d + " the number is negative - using signum()  ");
		else 
			System.out.println(d + " the number is zero - using signum() ");
		sc.close();

	}

}

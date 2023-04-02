package com.uis.fundamentals;

import java.util.Scanner;

public class Java12_SumOfNaturalNum {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of How many Numbers ?, plz enter  ");
		int num  = sc.nextInt();
		int i=0;
		int sum = 0;
		sc.close();
		
		// using for loop
		for(i=1; i<= num; i++) {
			sum = sum + i; 	
		}
		
		System.out.println("the sum of " + num + " natural numbers using for loop is " + sum);
		
		// using while loop // reset the sum to 0
		i = 1; // start i with 1 only, bcoz adding 0 to the sum will not make any diff.
		sum = 0;
		
		while (i <=num) {
			sum = sum + i;
			i++;

		}
		System.err.println("the sum of " + num + " natural numbers using while loop is " + sum);
		
		// or directly use the maths formula
		System.out.println("the sum using maths formulae is " + ((num)*(num+1)/2));
		
	}
	
}

package com.uis.fundamentals;

import java.util.Scanner;

public class Java13_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number, positive integer..  ");
		int num = sc.nextInt();
		sc.close();
		long factorial = 1;
		int i = 1;

				
		if ((num == 0)) // this is called single case check
			System.out.println("the factorial for Zero is => 1");
		else if (num < 0) // negative test case
			System.out.println("factorial is not possible for negative numbers ");
		else {
			while (i < num) {
				factorial = factorial * i;
				i++;
			}
			System.out.println("factorial for " + num + " using while loop is " + factorial);
		}
		
		factorial = 1; // reset fact , for againg doing it with for loop
		// using for loop
		for (i =1; i < num; i++) {
			factorial = factorial * i;
		}
		System.out.println("factorial for " + num + " using for loop is " + factorial);
		
	

	}
	
}

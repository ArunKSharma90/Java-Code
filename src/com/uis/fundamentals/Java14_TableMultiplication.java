package com.uis.fundamentals;

import java.util.Scanner;

public class Java14_TableMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number, positive integer..  ");
		int num = sc.nextInt();
		sc.close();
		long MulTable;
		
		System.out.println("Multiplication table of " + num + " is below");
		for (int i = 1; i <= 10; i++) {
			MulTable = num * i;
			//System.out.println(num + " * " + i + " = " + (long)num * i);  // if don;t want to take separate vaiable for calculation , then use it - promote one operand to long to avoid silent failure
			System.out.println(num + " * " + i + " = " + MulTable);
		}
		
	}

}

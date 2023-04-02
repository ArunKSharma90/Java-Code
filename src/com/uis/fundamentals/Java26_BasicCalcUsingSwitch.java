package com.uis.fundamentals;

import java.util.Scanner;

public class Java26_BasicCalcUsingSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st num ");
		double num1 = sc.nextDouble();

		System.out.println("enter the 2nd num ");
		double num2 = sc.nextDouble();

		System.out.println("enter the operation i.e. +, -, * or / - any one of these four ");
		char operator = sc.next().charAt(0);

		double result;

		sc.close();

		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println("sum of " + num1 + " & " + num2 + " is " + result);
			break;

		case '-':
			result = num1 - num2;
			System.out.println("subtraction of " + num1 + " & " + num2 + " is " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println("multiply of " + num1 + " & " + num2 + " is " + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println("sum of " + num1 + " & " + num2 + " is " + result);
			break;

		default:
			break;
		}

	}

}

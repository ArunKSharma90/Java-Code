package com.uis.fundamentals;

import java.util.Scanner;

public class Java15_Fibonacci_Series {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34 55

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number till where Fibonacci should be printed..  ");
		int num = sc.nextInt();
		sc.close();
		 int n1 =0, n2 = 1, n3;

		for (int i = 0; i < num; i++) {

			System.out.print(n1 + " ");	
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

		}

	}

}

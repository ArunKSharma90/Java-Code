package com.uis.fundamentals;
import java.util.Scanner;
public class Java21_PrimeNumber {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = sc.nextInt(); // 5
		boolean prime = true;
		if (num ==0 || num == 1) {
			prime = false;
			System.out.println("0 and 1 are not prime numbers");
			return;
		} 
		for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					prime = false;
					break;
				} else {
					continue;
				}
			}
			if(prime)
				System.out.println(num + " is a prime num.");
			else
				System.out.println(num + " is NOT a prime num.");
		}
}

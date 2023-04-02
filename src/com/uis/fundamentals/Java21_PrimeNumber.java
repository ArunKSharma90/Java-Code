package com.uis.fundamentals;

public class Java21_PrimeNumber {

	public static void main(String[] args) {
		int num = 137;
		int flag = 0;
			
		if (num==0 ||num ==1) {
			System.err.println(num + " is not a prime number");
		}
		else {
			
			for (int i = 2; i <= num/2; i++) { 
				
				if(num%i ==0) {
					System.err.println("the num is NOT a prime number");
					flag = 1;
					break; 
				}
			
		}
		
			if (flag ==0)
				System.out.println(num + " is a Prime number");

		}
			//System.out.println("the number is prime");
	
	}

}

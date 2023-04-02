package com.uis.fundamentals;

public class Java23_Armstrong {

	public static void main(String[] args) {
		// 153 = 1^3 + 5^3 + 3^3 = 153 , so it's an Armstong num
		// 2   = 2^1 = 2        		, so it's an Armstong num
		
		// Method 1 => if number is already given to be checked whether Arwmstrong or not
		
		int num = 371; 
		int originalNum = num; 
		int rem, sum=0; 
		
		while(num > 0) { 
			rem = num%10;
			sum = sum + (int) Math.pow(rem, 3);
			num = num/10;
		}
		
		System.out.println("Sum of digits for " + originalNum + " is " + sum );
		if(originalNum == sum)
			System.out.println("The number " + originalNum + " is an Armstrong number..");
		else 
			System.err.println("The number " + originalNum + " is NOT an Armstrong number..");
		}

}

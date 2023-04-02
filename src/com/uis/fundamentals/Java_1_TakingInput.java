package com.uis.fundamentals;
import java.util.Scanner;

public class Java_1_TakingInput {

	public static void main(String[] args) {		
		// try to run complete pgm Int + String - it's not working 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first num ");
		
		int num1 = sc.nextInt();
		System.out.println("Enter second num ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		System.out.println("sum is " + sum);
		
		 // we should close the scanner at the end of the pgm to not get any warning.
					   // also if we use any of Scanner method after closing the scanner then it will throw exception, 
					  // so it should be closed when all the inputs have been taken from the user.
		
		// >>>>>>>>>> below code is not working ,
		// however it works if we remove the sum code part, then this string code works fine. 
		System.out.println("taking String input here, please enter string ");
		String str =  sc.nextLine();
		System.out.println(str);
		sc.close();
	}	

}

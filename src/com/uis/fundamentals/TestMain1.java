package com.uis.fundamentals;

import java.util.Scanner;
public class TestMain1 {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the 1st no. "); int firstNum = sc.nextInt();
		  System.out.println("enter the 2nd no. "); int secondNum = sc.nextInt();
		  System.out.println("the sum is " + (firstNum + secondNum)); 
		  //sc.close();
		 
		
		//Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the string .. ");
		String str = sc.nextLine();
		System.out.println("String entered is -- " + str); 
		sc.close();
		
	}
}

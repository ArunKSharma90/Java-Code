package com.uis.fundamentals;

public class Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WAP for converting 
	    // Array to String
		// String to Array
		// String to int (primitive) and vice versa
		
		// String to int  -- use the parseInt method of Integer class
		String data = "10";
		System.out.println("The string value is: " + data);
		int num = Integer.parseInt(data);
		System.out.println("The integer value is: " + num);
		
		// int to String (onw way is to simply concat int with a blank string and store in a String var)
		// 2nd way is to use valueOf constructor of String class
		int i = 78;
		System.out.println("The integer value is: " + i);
		String str = String.valueOf(i);
		System.out.println("The string value is: " + str);
		
		
		
		
	   // Boxing and Unboxing > Primitive to object and object to Primitive
	   // String to char and vice versa
		
		

	}

}

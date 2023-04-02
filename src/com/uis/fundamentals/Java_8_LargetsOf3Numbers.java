package com.uis.fundamentals;

public class Java_8_LargetsOf3Numbers {
	
	public static void main(String args[]) {
		
		int x = 6;
		int y = 7;
		int z = 5;
		
		// using if else
		if (x>y && x>z) {
			System.out.println("largest num is x- " + x); 
		}
			else if (y>x && y>z)
					System.out.println("largest num is y- " + y);
				else 
					System.out.println("largest num is z- " + z);
					
			

		// using ternary operator
		
		int largest = z > (x>y ? x:y )  ?  z: ((x>y ? x:y));
		System.out.println("using ternary op. largest num is " + largest);
		
	}  
} 
		
	
	
	

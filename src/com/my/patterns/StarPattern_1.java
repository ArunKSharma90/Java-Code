package com.my.patterns;

public class StarPattern_1 {
// 1. Right Triangle Star Pattern
//	*
//	**
//	***
//	****
//	*****
	static int row = 5;
	public static void main(String[] args) {		
		for(int i=1; i<=row; i++) {		
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
			}	
			System.out.println(""); //next line
		}
		
	}
}

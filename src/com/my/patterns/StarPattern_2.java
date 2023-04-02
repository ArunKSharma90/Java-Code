package com.my.patterns;

public class StarPattern_2 {
//	Right triangle pattern 
//	    *
//	   **
//	  ***
//	 ****
//	*****
	static int row = 5;
	
	public static void main(String[] args) {
		for (int i=1; i<= row; i++) {
			for (int j=1; j<= row-i; j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			
		System.out.println("");	
		}

	}

}

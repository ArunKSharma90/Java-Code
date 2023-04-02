package com.my.patterns;

public class StarPattern_3 {
// Left Down Triangle
//	*****
//	****
//	***
//	**
//	*
	static int row =5; 
	public static void main(String[] args) {
		for(int i=1; i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print("*");			
			}	
			System.out.println(""); //next line
		}
	}

}

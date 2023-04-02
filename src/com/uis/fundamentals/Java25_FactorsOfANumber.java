package com.uis.fundamentals;

public class Java25_FactorsOfANumber {

	// print all factors of a number
	public static void main(String[] args) {
		int num = 12; 
		
		for (int i = 1; i<= num/2; i++) {
			
			if(num%i == 0)
				System.out.print(i + "  ");
			else 
				continue;
			
		}

	}

}

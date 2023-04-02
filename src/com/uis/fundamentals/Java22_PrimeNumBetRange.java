package com.uis.fundamentals;

public class Java22_PrimeNumBetRange {

	public static void main(String[] args) {
 
		int low = 1, high = 100;
		int flag = 0;  // if flag = 0 => prime number 

		for (int i = low; i <= high; i++) {
			//System.out.println(i);
			if (i == 0 || i == 1)
				continue;
			flag = 0; // set the flag to 0 before the inner for loop, bcoz in inner loop it will be set to 1
			
			for (int j = 2; j <= i / 2; j++) {
			
				if (i % j == 0) {
					flag = 1;
					break;

				}
				//flag =0;  
				
			}
			if (flag == 0)
				System.out.print(i + " ");
				

			

		}

	}

}

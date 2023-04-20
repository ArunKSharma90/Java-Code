package com.qa.temp;
import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		int arr[] = { 20, 52, 11, 9, 63, 1, 8 };
		int max = arr[0];
		int secMax = arr[0];
		int maxIndex=0, secMaxIndex=0;
		
		for(int i=1; i< arr.length; i++) {
				if (arr[i] > max ) {
					max = arr[i];
				} else {
					if(arr[i] > secMax)
						secMax = arr[i];
				}
				
		}
		System.out.println("max: " + max);
		System.out.println("Second max: " + secMax);
		
		
		
	}
}

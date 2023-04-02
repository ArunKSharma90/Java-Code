package com.practice.collections;

import java.util.ArrayList;
import java.util.List;
public class ArrayList1 {
//		1. List allows all types of values  (indexed)
//		2. Duplicates are allowed 
//		3. Insertion order is preserved
//		4. Any no. of null values are allowed
	
	public static void main(String[] args) {
		
		List<String> str = new ArrayList<>();	
		str.add("Hello");
		str.add(null);
		str.add("How are you !");
		str.add(null);
		
		System.out.println(str);  // to print the list
		int size = str.size();    // to get size of list
		System.out.println("size of the list str is " + size  );
		
		//fetch a specific value from list    
		System.out.println("index 2 element is > " + str.get(2));
		System.err.println("The list is printed below");
		// print all values in list
		for(int i=0;i<size; i++) {
			System.out.println(str.get(i));
		}
	}

}

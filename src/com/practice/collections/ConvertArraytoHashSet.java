package com.practice.collections;

import java.util.HashSet;
import java.util.Set;

public class ConvertArraytoHashSet {
// This is one of the ways to remove duplicates from Array
	
	public static void main(String[] args) {
	
		String arr[] = {"Hi", "Hello", "Hi", "How are you ?"};  //create array
		Set<String> set1 = new HashSet<String>(); // create set			
		for(String s: arr) {   				// add elements to set
			set1.add(s);
		}
		
		System.out.println("Set is: " + set1);    // print set
				
		String[] arrNew = new String[set1.size()]; // same size as set1
		arrNew = set1.toArray(arrNew);
		System.out.println("new array after removing duplicates is below: ");
		for(String s: arrNew) {
			System.out.println(s);
		}
		
	}

}

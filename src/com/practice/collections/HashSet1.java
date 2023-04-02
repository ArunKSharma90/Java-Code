package com.practice.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {
//	1. Set(any collection) allows all types of values
//	2. Duplicates are NOT allowed
//	3. Insertion order is NOT preserved
//	4. Only 1 null value is allowed
//	5. To fetch values from Set/HashSet no direct method is available, need to use iterator
//	6. No concept of indexes in Set
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(2);
		set1.add(12);
		set1.add(179398);
		set1.add(null);
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<String>();
		set2.add("Baraut");
		set2.add("Delhi");
		set2.add("Delhi");  //duplicates not retained
		set2.add(null);
		set2.add(null); // 2nd null will not added
		System.out.println(set2);
		
		System.out.println("size of set 1 is > " + set1.size());
		System.out.println("size of set 2 is > " + set2.size());
		
		Iterator itr1 = set1.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		

	}

}
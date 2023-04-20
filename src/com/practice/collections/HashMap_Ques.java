package com.practice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Ques {
	public static void main(String[] args) {
		// Test Yantra Round 1
		//Quest-  Store one of each value in a Map and then print it - 1int, 1 string, 1 char, 1 double , 1 boolean
				Map<Integer,Object> map = new HashMap<Integer, Object>();
				map.put(1, 24);
				map.put(2, "Hello");
				map.put(3, 'D');
				map.put(4, 345.656d);
				map.put(5, true);
				
				Set<Integer> Keys = map.keySet();
				Iterator itr = Keys.iterator();
				while(itr.hasNext()) {
					Object key = itr.next();
					System.out.println("Key > " + key +  " value > " + map.get(key));
				}
			}
}

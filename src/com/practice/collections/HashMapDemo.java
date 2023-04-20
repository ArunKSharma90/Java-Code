package com.practice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
//  1. Stores the data in Key-value pair, that's why this is not part of collection interface
//	2. Map is a separate interface
//	3. Keys are unique but values can be duplicate
//	4. Only 1 null key allowed, but any no. of null values are allowed
//	5. If we try to insert duplicate values, the recent/last inserted value is stored.
	
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Arun"); map.put(2, "ram"); map.put(3, "Kumar M"); map.put(4, "Kumar M");
		System.out.println(map);
		//map.remove(2);
		System.out.println(map);
		System.out.println(map.get(1));
		System.out.println(map.get("ram"));
		
		Set<Integer> setOfKeys = map.keySet();
		
		Iterator itr = setOfKeys.iterator();
		while(itr.hasNext()) {
			Object key = itr.next();
			System.out.println("Key -> " + key + " Value-> " + map.get(key));
		}

}}

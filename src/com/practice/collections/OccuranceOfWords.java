package com.practice.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OccuranceOfWords {
	//	Java Program to find the occurrence of words in a String using HashMap.
	public static void main(String[] args) {
		String str = "Delhi is a metro city and Meerut is just a normal city";  
		String[] words = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String word: words) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			} else {
				map.put(word, 1);
			}
		}
		System.out.println(map);  // answer 1 is this sysout
		
//		Ques: Print map with only the words which are repeated atleast once.
		Set mapKeys =   map.keySet();
		Iterator itr = mapKeys.iterator();
		while(itr.hasNext()) {
			Object key  = itr.next();
//			if(map.get(key) > 1)
			System.err.println( key +  " - no. of occurance is > " + map.get(key));
		}
	}
}

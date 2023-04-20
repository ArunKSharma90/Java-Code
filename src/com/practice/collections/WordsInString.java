package com.practice.collections;

import java.util.HashMap;
import java.util.Map;

// Write a Java Program to count the number of words in a string using HashMap.
public class WordsInString {

	public static void main(String[] args) {
		String str = "Hey, Hi Hello? How are you?";  // output = 6
		
		// to remove special chars from the string first and then count number of words
		str = str.replaceAll("[^a-z0-9A-Z ]", "");
		System.err.println("String after removing the special chars => " + str);
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		String[] words = str.split(" ");
		for(int i=0; i< words.length; i++) {
			map.put(i, words[i]);
		}
		int numOfWords = map.keySet().size();
		System.out.println("Total number of words in the string is > " + numOfWords );
		System.out.println(map);

	}

}

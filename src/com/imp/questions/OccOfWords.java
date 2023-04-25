package com.imp.questions;
import java.util.HashMap;
import java.util.Map;
// 1) Print how many times a word occurs in a sentence.
public class OccOfWords {

	public static void main(String[] args) {
		String str = "this is a very very very costly gift gift costly. Yes this is  "; 
		str = str.replace(".", "");  //replace any full stop , Grammar 
		String[] words = str.split(" ");
		Map<String,Integer> wordCount = new HashMap<String, Integer>();
				
		for(String w : words) {
			if(wordCount.containsKey(w)) {
				wordCount.put(w, wordCount.get(w) + 1);
			}else {
				wordCount.put(w, 1);
			}
			if(wordCount.get(w)>1) {
				System.out.println("Key > " + w + " value > " + wordCount.get(w));
			}
		}
		System.out.println(wordCount);
		
//		Set<Entry<String,Integer>> s = wordCount.entrySet();

	}
}

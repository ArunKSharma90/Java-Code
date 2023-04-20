package com.strings;

//Test Yantra Round 1
//Ques?  Count How many A/a are the in String , remove all A/a, and reverse the remaining string
public class StringOperations {
	static int count = 0;
	public static void main(String[] args) {
		String str = "My name is Arun Kumar First Name Arun ";
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i)== 'A' || str.charAt(i)== 'a') {
				count ++;
			}
		}
		System.out.println("A occurance is " + count);  // count
		String str2 = str.replace("A", "").replace("a", "");  // remove a
		System.out.println(str2);  
		
		// reverse the remaining string
		for(int i = str2.length()-1; i>=0; i--) {
			System.out.print(str2.charAt(i));
		}
	}	
}

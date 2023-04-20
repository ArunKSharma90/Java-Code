package com.strings;
public class SecondNonRepeatChar {
	public static char NonRepeatChar(String str, int k) {
		int count = 0; 
		char c = '\0';
		for(int i=0; i<str.length(); i++) {
			boolean repeat = false; 
			for(int j=0; j<str.length(); j++) {
				if(i!=j && str.charAt(i)== str.charAt(j)) {
					repeat = true; 
					break;
				}
			}
			if(!repeat) {
				count++ ;
				if(count ==k) {
					c=  str.charAt(i);
					break;
				}
			}	
		}
		return c;
	}
	public static void main(String[] args) {
		int k =2;
		String str = "AABBcDDEEEEFgFFFF";
		System.out.println("String is " + str);
		char nrp = NonRepeatChar(str, k);
		System.out.println(k + "th non repeat char is " + nrp);
	}
}

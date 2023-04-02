package test;

import java.util.HashSet;
import java.util.Iterator;

public class BasicHashSet {

	public static void main(String[] args) {
		//Creating HashSet and adding elements  
	    HashSet<String> set=new HashSet<String>();  
	           set.add("One");  set.add("Two");  set.add("Three"); set.add("Four");   set.add("Five");  
	           
	          
	           System.out.println("Set size is  " + set.size());
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	           set.remove("One");
	           System.out.println("Set size after remoring- " + set.size());
	          
	           
	           
	        	           }
	}


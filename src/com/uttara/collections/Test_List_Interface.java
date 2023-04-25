package com.uttara.collections;
import java.util.ArrayList;
import java.util.List;

public class Test_List_Interface {
	public static void main(String[] args) {
	
	List list = new ArrayList();
		
	list.add("tik tok");
	list.add("insta reels");
	list.add("raposo");
	list.add("chingari");
	list.add("tik tok");
	
	System.out.println(list);
//	1. Calling List specific add() method
	list.add(2, "YT shorts");
//	2. Calling List specific get(index) method
	System.out.println(list.get(2));
	
	System.out.println(list);
//	3. Calling List specific remove() method
	list.remove(list.size()-1);  // remove the last element
	
//	4. indexOf()
	System.out.println("Index of YT shorts is " + list.indexOf("YT shorts"));
	
//	5. List after removal
	System.out.println(list);
	

	
		}
}
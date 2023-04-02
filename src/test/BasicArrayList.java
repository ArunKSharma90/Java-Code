package test;

import java.util.ArrayList;
public class BasicArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String str;
		
		
		list.add("Hello ArrayList");
	
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		//list.add(4345);
		list.add(null);
		System.out.println(list.size());
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println("After clearing - "+list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			      
		}
	}

}

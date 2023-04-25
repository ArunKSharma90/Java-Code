package com.uttara.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
public class Col1_TestCollections {
	public static void main(String[] args) {
		Collection col = new ArrayList();   // the returned Obj ref can be stored in 4 ref data types - ArrayList, List, Collection and Object 
											// However we should not Store the ref in Object type, bcoz then we will not be able to access the child classes/interface methods - i.e. methods of Collection/List/ArrayList. 
//	1. boolean add(E e)	
		for(String str: args)      
			col.add(str);              // add the command line args as elements of ArrayList();
//  2. print a collection
		System.out.println("col: " + col);
//	3. int size()	
		System.out.println("coll size is: " + col.size());
//	4. search =>   boolean contains()      => it looks up for exact match
		System.out.println(col.contains("dosa"));
		System.out.println(col.contains("Dosa"));
		System.out.println(col.contains("dos"));

		String s = new String("pongal");
		col.add(s);
		String s1 = new String("pongal");
		System.out.println(col.contains(s1));  // returns true  =>  even though s1(ref) is not added to col but still it will return true. this is bcoz internally the search works as - It will search if there is an element available whose state is same as s1's state. 
		
//	5.  boolean remove(Object o)  => it removes only the 1st occurrence. 
		col.remove(s1);   // this will remove the element whose state is same as s1 refernece's state
		
//	6.  select all elements which has "do" in it.  => need to loop through each element=> use iterator or for each
//		Iterate through each element
		for(Object x: col) {
			String x2  = (String) x; 
			if(x2.contains("do")) {
				System.out.println("found match :" + x2);
			}
		}
//	7. void clear(); => will empty the collection
//		col.clear();
//	8. 	addAll();   (Bulk Methods)
		System.out.println("col before addAll() : " + col);
		
		String a1 = "pepsi" ;
		String a2 = "Coke" ;
		String a3 = "Mirinda" ;
		String a4 = "donut" ;
	
		Collection col2 = new LinkedList();
		col2.add(a1);
		col2.add(a2);
		col2.add(a3);
		col2.add(a4);
		System.out.println("new collection col2 is : " + col2);
		
		col.addAll(col2);     // get 1-1 element of col 2 and add it to col 
		System.out.println("col after addAll() : " + col);
	
//	9. 	col.removeAll(col2); =>  remove all element from col which are present in col2.
		col.removeAll(col2);
		System.out.println("col after removeAll(col2) : " + col);
		
// 10.  boolean retainAll()
		System.out.println("col Before retainAll() : " + col);
		Collection col3 = new HashSet();
		col3.add("pepsi");
		col3.add("dosa");
		System.out.println("new collection col3 is : " + col3);
		
		col.retainAll(col3);
		System.out.println("col after col.retainAll(col3) : " + col);
	}
}

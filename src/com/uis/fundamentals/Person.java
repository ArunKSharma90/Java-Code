package com.uis.fundamentals;
public class Person {
	
	int num= 0;
	public static void getData() {
	System.out.println("inside static method - we need to call a method to access otherwise only main method gets executed ! ");
	}
	
	// 1.
	static {        
		int a = 2;
		System.out.println("inside static block");
		System.out.println(a);
	}
	
	// 2. 
	public static void main (String[] args) {	
		Person p1 = new Person();
		System.out.println(p1.num);
		System.out.println("starting main method - ");
		System.out.println("srting value is abc ");
		Person.getData();
		
	}  }
	
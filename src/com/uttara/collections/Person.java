package com.uttara.collections;
public class Person {
	private int age;
	private String name;
	private Address homeAddress;
	private Address ofcAddress;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(this.age==p.age && this.name.equals(p.name) 
				&& this.homeAddress.equals(p.homeAddress) && this.ofcAddress.equals(p.ofcAddress))// this line equals() method will work only when
			{
				return true; }
			else
				return false;	
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		Address adr = new Address();
		adr.setCity("Blr");
		adr.setHomeNum("652");
 		Person p1 = new Person(32, "Ram");
		Person p2 = new Person(32, "Ram");
		Person p3 = new Person(32, "Ramu");
		
		p1.homeAddress = adr;
		p2.homeAddress = adr;
		p1.ofcAddress = adr;
		p2.ofcAddress = adr;
		
//		System.out.println("p1==p2 without overriding equals() -> "  + (p1==p2));    // will return false 
//		System.out.println("p1.equals(p2) without overriding equals() -> " + p1.equals(p2)); // will return false
		
		System.out.println("p1==p2 after overriding equals() -> "  + (p1==p2));    // false -bcoz ref values of a1 and a2 are diff as they are the ref of 2 diff objects
		System.out.println("p1.equals(p2) after overriding equals() -> " + p1.equals(p2)); // true => as now the equals() of Address class is being called.
		System.out.println("p1.equals(p3) after overriding equals() -> " + p1.equals(p3));
	}
}

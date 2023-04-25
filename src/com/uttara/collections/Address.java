package com.uttara.collections;

// this is created to code equals() method in our class by overriding the Object equals() method
public class Address {
	private String city;
	private String homeNum;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String homeNum) {
		super();
		this.city = city;
		this.homeNum = homeNum;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHomeNum() {
		return homeNum;
	}
	public void setHomeNum(String homeNum) {
		this.homeNum = homeNum;
	}
	
	// instead of manually overriding , we can auto-genarate it from soure, which will handle all possible null scenarios as well/
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Address) {
			Address a = (Address) obj;
			if(this.city.equals(a.city) && this.homeNum.equals(a.homeNum)) {   // 
			  return true;
			}
			else
				return false;  // or else you can throw an exception also here!  
		}
		return false;
	}
	
	public static void main(String[] args) {

		Address a1 = new Address("Delhi", "425");
		Address a2 = new Address("Delhi", "425");
		Address a3 = new Address("Delhi", "4566");
		
//		System.out.println("a1==a2 without overriding equals() -> "  + (a1==a2));    // will return false 
//		System.out.println("a1.equals(a2) without overriding equals() -> " + a1.equals(a2)); // will return false
		
		System.out.println("a1==a2 after overriding equals() -> "  + (a1==a2));    // false -bcoz ref values of a1 and a2 are diff as they are the ref of 2 diff objects
		System.out.println("a1.equals(a2) after overriding equals() -> " + a1.equals(a2)); // true => as now the equals() of Address class is being called.
		System.out.println("a1.equals(a3) after overriding equals() -> " + a1.equals(a3));
	}
	
}

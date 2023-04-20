package test;

public class Animal {
	String name; 
	Animal(String name) {
		this.name = name;
	}
		// sleep in both 
		public void sleep() {
			System.out.println("Animal " + name + "is sleeping");
		}
		
		//fight - only parent/Animal
		public void fight() {
			System.out.println("Animal " + name + "is fighting");
		}
}

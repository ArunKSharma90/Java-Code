package test;
public class Dog extends Animal {

	String name; 
	int age = 10;
	Dog(String name) {
		super(name);
		this.name = name;
	}
	// sleep in both 
	public void sleep() {
		System.out.println("Dog " + name + "is sleeping");
	}
	// bark - only in child 
	public void bark() {
		System.out.println("Dog" + name + "is barking");
	}
	
}

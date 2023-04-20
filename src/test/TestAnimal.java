package test;
public class TestAnimal {
	public static void main(String[] args) {
		Animal a1 = new Animal("jimmy");
		a1.sleep();
		a1.fight();
		System.out.println("Animal name is " + a1.name);
		
		Animal a2 = new Dog("Heera");
		a2.sleep();
		a2.fight();
		System.out.println("Animal name is " + a1.name);
//		a2.bark(); // we cannot access a child specific method using Parent's ref.  

	}

}

package test;
class T {
	private class B {
		public void check() {
			System.out.println("hehe..");
		}
	}
}

public class A2 extends T {
	
	public static void main(String[] args) {
		T t = new T();
//		T.B b = t.new B();
		
	}
}

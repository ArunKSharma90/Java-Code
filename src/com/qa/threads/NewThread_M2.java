package com.qa.threads;

public class NewThread_M2 implements Runnable {

	public static void main(String[] args) {
		NewThread_M2 m2 = new NewThread_M2();
		Thread t1 =new Thread(m2);   // Using the constructor Thread(Runnable r)  -- we are passing a child of Runnable in the argument
		t1.start();  
		System.out.println("This is main() of my class M2.. ");
		
	}

	@Override
	public void run() {
		System.out.println("Hello, from run() of Runnable....");
		
	}

}
